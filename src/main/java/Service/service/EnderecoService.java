package Service.service;

import org.springframework.stereotype.Service;

import Endereco.endereco;
import dto.EnderecoDTO;

public interface EnderecoService {
	endereco create(EnderecoDTO dto);

	endereco create1(EnderecoDTO obj);
}
