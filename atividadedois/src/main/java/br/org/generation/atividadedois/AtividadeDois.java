package br.org.generation.atividadedois;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividadedois")
public class AtividadeDois {
	
	@GetMapping
	public String atividadedois () {
		return " 1. Atenção aos Detalhes 2. Proatividade 3. Comunicação";
		
		

}
}
