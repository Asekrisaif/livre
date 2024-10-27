package ma.gotocode.livre.Service.impl;

import ma.gotocode.livre.Dto.SigninDTO;
import ma.gotocode.livre.Entity.Signin;
import ma.gotocode.livre.Repo.SigninRepo;
import ma.gotocode.livre.Service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigninIMPL implements SigninService {

    @Autowired
    private SigninRepo signinRepo;

    @Override
    public String addSignin(SigninDTO signinDTO) {
        // Create a new Signin entity
        Signin signin = new Signin();
        signin.setFullName(signinDTO.getFullName()); // Correctly set fullName
        signin.setEmail(signinDTO.getEmail());
        signin.setPassword(signinDTO.getPassword());

        // Save the entity
        signinRepo.save(signin);

        // Return a message or the name of the saved user
        return signin.getFullName(); // Change to getFullName() if you renamed it
    }
}
