package ma.gotocode.livre.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user") // Liaison avec la table existante `user`
public class Signin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT en SQL
    @Column(name = "id")
    private int id;

    @Column(name = "full_name")
    private String fullName;


    @Column(name = "email", length = 255, unique = true) // Assurer l'unicité
    private String email;

    @Column(name = "password", length = 255)
    private String password;

    // Default constructor
    public Signin() {}

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName; // Renommer à fullName
    }

    public void setFullName(String fullName) { // Renommer à fullName
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

    @Override
    public String toString() {
        return "Signin{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
