package Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Endereco.endereco;


@Repository
public interface CepRepository  extends JpaRepository<endereco, Long>{

	endereco save(Class<? extends endereco> class1);

	Optional<endereco> findBycep(String cep);

}
