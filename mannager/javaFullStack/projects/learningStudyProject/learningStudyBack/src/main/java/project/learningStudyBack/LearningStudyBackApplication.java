package project.learningStudyBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import project.learningStudyBack.Model.NickNameModel;
import project.learningStudyBack.Repository.NickNameRepository;

@SpringBootApplication
public class LearningStudyBackApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearningStudyBackApplication.class, args);
		NickNameRepository nickNameRepository = context.getBean(NickNameRepository.class);
		NickNameModel nickNameModel = new NickNameModel();
		nickNameModel.setName("nayan");
		nickNameModel.setNickname("mahoday");
		NickNameModel nnm = nickNameRepository.save(nickNameModel);
		System.out.println(nnm);
	}

}
