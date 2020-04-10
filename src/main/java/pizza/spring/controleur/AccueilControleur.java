package pizza.spring.controleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilControleur {
	//petite modif
	@GetMapping({"/", "/accueil"})
	public String accueil() {
		return "accueil";
	}

}
