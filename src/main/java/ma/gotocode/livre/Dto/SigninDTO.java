package ma.gotocode.livre.Dto;

import java.io.Serializable;

public class SigninDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String fullName; // Utiliser `fullName` pour correspondre à la table `user`
    private String email;
    private String password;

    // Constructeurs
    public SigninDTO() {}

    public SigninDTO(int id, String fullName, String email, String password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString()
    @Override
    public String toString() {
        return "SigninDTO{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // Builder Pattern pour une construction plus flexible
    public static class Builder {
        private int id;
        private String fullName;
        private String email;
        private String password;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public SigninDTO build() {
            return new SigninDTO(id, fullName, email, password);
        }
    }
}
