package Admin_Pasteleria.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class NavegationController {

        @GetMapping("/") // Página principal
    public String mostrarIndex() {
        return "index"; // Esto buscará index.html en templates/
    }

    @GetMapping("/contacto") // Nueva ruta para vista.html
    public String mostrarContacto() {
        return "contacto"; // Esto buscará vista.html en templates/
    }
    
    @GetMapping("/menu") // Nueva ruta para vista.html
    public String mostrarMenu() {
        return "menu"; // Esto buscará vista.html en templates/
    }
    
    @GetMapping("/trabajos") // Nueva ruta para vista.html
    public String mostrarTrabajos() {
        return "trabajos"; // Esto buscará vista.html en templates/
    }


    @GetMapping("/login") // Nueva ruta para vista.html
    public String mostrarLogin() {
        return "login"; // Esto buscará vista.html en templates/
    }

}
