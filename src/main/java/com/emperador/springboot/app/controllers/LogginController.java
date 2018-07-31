package com.emperador.springboot.app.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LogginController {

	@GetMapping("/login")
	public String login(@RequestParam(value = "error", required = false) String error, 
			@RequestParam(value = "logout", required = false) String logout,
			Model model, Principal principal,
			RedirectAttributes flash) {

		if (principal != null) {
			flash.addFlashAttribute("info", "ya ha iniciado sesión anteriormente");
			return "redirect:/";
		}
		
		if(error != null) {
			model.addAttribute("error", "Error en el login: Nombre de usuario y/o contraseña inválido: Ingrese los datos nuevamente");
		}
		
		if(logout != null) {
			model.addAttribute("success", "Ha cerrado sesión correctamente");
		}
		
		return "login";
	}

}
