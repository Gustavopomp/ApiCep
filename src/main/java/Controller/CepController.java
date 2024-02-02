package Controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import Endereco.endereco;
import Service.EnderecoServiceImpl;
import Service.service.EnderecoService;
import dto.EnderecoDTO;

@Controller
@RequestMapping(value = "/cep")
public class CepController {

	
	EnderecoService service = new EnderecoServiceImpl();
	
	@PostMapping
	public ResponseEntity<EnderecoDTO> create(@RequestBody EnderecoDTO obj){
		URI uri = ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}").buildAndExpand(service.create1(obj).getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	
}
