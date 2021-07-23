package br.org.generation.atividadeum;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividadeum")
public class AtividadeUm {
	
	@GetMapping
	public String atividadeum () {
		return "1. Orientação ao Futuro 2. Responsabilidade Pessoal 3.Persistência";

}
}