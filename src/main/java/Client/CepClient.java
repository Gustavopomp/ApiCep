package Client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import Endereco.endereco;

@FeignClient(url = "https://viacep.com.br/ws/", name = "vcep")
public interface CepClient {

	@GetMapping("/{cep}/json/")
	endereco getEndereco(@PathVariable String cep);
}
