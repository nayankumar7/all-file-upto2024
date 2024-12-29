package project.learningStudyBack.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.learningStudyBack.Model.NickNameModel;

import java.util.List;

public interface NickNameRepository extends JpaRepository<NickNameModel, Long> {
    List<NickNameModel> findByNicknameContaining(String nickname);
    List<NickNameModel> findByNameContaining (String name);
}
