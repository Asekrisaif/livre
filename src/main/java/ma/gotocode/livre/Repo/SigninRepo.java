package ma.gotocode.livre.Repo;

import ma.gotocode.livre.Entity.Signin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SigninRepo extends JpaRepository<Signin, Integer> {
    String existsByEmail(String email); // Optional: To check for existing email
}
