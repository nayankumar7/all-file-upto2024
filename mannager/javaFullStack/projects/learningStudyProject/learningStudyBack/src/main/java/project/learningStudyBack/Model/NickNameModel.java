package project.learningStudyBack.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "nicknametable")
public class NickNameModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "nickname")
    private String nickname;

    public NickNameModel (){

    }

    public NickNameModel( String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "NickNameModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
