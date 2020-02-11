package model;

public class Model {
    private String lastname;
    private String nickname;

    public Model() {
    }

    public Model(String lastname, String nickname) {
        this.lastname = lastname;
        this.nickname = nickname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
