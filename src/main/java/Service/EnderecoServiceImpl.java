package Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import Client.CepClient;
import Endereco.endereco;
import Repository.CepRepository;
import Service.service.EnderecoService;
import dto.EnderecoDTO;

@Service
public class EnderecoServiceImpl implements EnderecoService {

	
	ModelMapper mapper = new ModelMapper();
	
	CepClient viacep = new CepClient() {
		
		@Override
		public endereco getEndereco(String cep) {
			// TODO Auto-generated method stub
			return null;
		}
	};

	endereco end = new endereco();
	endereco newEndereco = new endereco();
	CepRepository repository = new CepRepository() {
		
		@Override
		public <S extends endereco> Optional<S> findOne(Example<S> example) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}
		
		@Override
		public <S extends endereco, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends endereco> Page<S> findAll(Example<S> example, Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends endereco> boolean exists(Example<S> example) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public <S extends endereco> long count(Example<S> example) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public Page<endereco> findAll(Pageable pageable) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<endereco> findAll(Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends endereco> S save(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Optional<endereco> findById(Long id) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}
		
		@Override
		public boolean existsById(Long id) {
			// TODO Auto-generated method stub
			return false;
		}
		
		@Override
		public void deleteById(Long id) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllById(Iterable<? extends Long> ids) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll(Iterable<? extends endereco> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void delete(endereco entity) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public long count() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		@Override
		public <S extends endereco> List<S> saveAll(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<endereco> findAllById(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public List<endereco> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends endereco> S saveAndFlush(S entity) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends endereco> List<S> saveAllAndFlush(Iterable<S> entities) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public endereco getReferenceById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public endereco getOne(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public endereco getById(Long id) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void flush() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public <S extends endereco> List<S> findAll(Example<S> example, Sort sort) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public <S extends endereco> List<S> findAll(Example<S> example) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public void deleteAllInBatch(Iterable<endereco> entities) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllInBatch() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void deleteAllByIdInBatch(Iterable<Long> ids) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public endereco save(Class<? extends endereco> class1) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public Optional<endereco> findBycep(String cep) {
			// TODO Auto-generated method stub
			return Optional.empty();
		}
	};

	@Override
	public endereco create(EnderecoDTO dto) {
		if (dto.getCep() != null) {
			newEndereco = viacep.getEndereco(dto.getCep());

			if (newEndereco != null) {
				end.setBairro(newEndereco.getBairro());
				end.setLocalidade(newEndereco.getLocalidade());
				end.setLogradouro(newEndereco.getLogradouro());
				end.setUf(newEndereco.getUf());
				end.setCep(newEndereco.getCep());
			}
		}
        return repository.save(end.getClass());
	}
	@Override
	public endereco create1(EnderecoDTO obj) {
		return repository.save(mapper.map(obj, endereco.class));
	}
	
}
