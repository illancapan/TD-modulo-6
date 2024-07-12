package com.alkewallet.alkewallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WalletController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Devuelve el nombre de la plantilla HTML login.html
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Aquí puedes implementar la lógica de autenticación
        // Por ejemplo, verificar las credenciales en una base de datos o servicio de autenticación

        // Simulación de autenticación básica para ejemplo
        if ("usuario".equals(username) && "contraseña".equals(password)) {
            model.addAttribute("username", username);
            return "redirect:/dashboard"; // Redirecciona al dashboard si las credenciales son válidas
        } else {
            model.addAttribute("error", "Credenciales inválidas. Inténtelo de nuevo.");
            return "login"; // Vuelve a mostrar la pantalla de login con un mensaje de error
        }
    }
}
