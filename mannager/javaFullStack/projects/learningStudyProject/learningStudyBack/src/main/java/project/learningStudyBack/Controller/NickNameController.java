package project.learningStudyBack.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.learningStudyBack.Model.NickNameModel;
import project.learningStudyBack.Repository.NickNameRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8888")
@RestController
@RequestMapping("/abc")
public class NickNameController {

    @Autowired
    NickNameRepository nickNameRepository;

    @GetMapping("/name")
    public ResponseEntity<List<NickNameModel>> getAllNickNameModels (@RequestParam (required = false) String name) {
        try {
            List<NickNameModel> nickNameModels = new ArrayList<>();
            if (name == null)
                nickNameRepository.findAll().forEach(nickNameModels::add);
            else
                nickNameRepository.findByNameContaining(name).forEach(nickNameModels::add);

            if (nickNameModels.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(nickNameModels, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/name/{id}")
    public ResponseEntity<NickNameModel> getNickNameById(@PathVariable("id") long id) {
        Optional<NickNameModel> nickNameModelData = nickNameRepository.findById(id);

        if (nickNameModelData.isPresent()) {
            return  new ResponseEntity<>(nickNameModelData.get(),HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/nicknames")
    public ResponseEntity<NickNameModel> createNickName (@RequestBody NickNameModel nickNameModel) {
        try{
            NickNameModel newNickNameModel = nickNameRepository.save(new NickNameModel(nickNameModel.getName(), nickNameModel.getNickname()));
            return new ResponseEntity<>(newNickNameModel, HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/nicknames/{id}")
    public ResponseEntity<NickNameModel> updateNickName (@PathVariable("id") long id, @RequestBody NickNameModel nickNameModel) {
        Optional<NickNameModel> nickNameModelData = nickNameRepository.findById(id);
        if(nickNameModelData.isPresent()){
            NickNameModel newNickNamemodel = nickNameModelData.get();
            newNickNamemodel.setName(nickNameModel.getName());
            newNickNamemodel.setNickname(nickNameModel.getNickname());
            return new ResponseEntity<>(nickNameRepository.save(newNickNamemodel), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
