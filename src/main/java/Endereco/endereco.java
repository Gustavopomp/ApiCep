package Endereco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String cep;
	public String uf;
	public String bairro;
	public String localidade;
	public String logradouro;

}
