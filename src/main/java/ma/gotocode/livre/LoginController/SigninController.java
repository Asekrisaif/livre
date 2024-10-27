package ma.gotocode.livre.LoginController;

import ma.gotocode.livre.Dto.SigninDTO;
import ma.gotocode.livre.Service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/signin") // Mettre à jour le chemin ici
public class SigninController {

    @Autowired
    private SigninService signinService;

    @PostMapping("/save") // Chemin pour la méthode
    public String saveSignup(@RequestBody SigninDTO signinDTO) {
        return signinService.addSignin(signinDTO);
    }
}
