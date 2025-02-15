package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.TurmaModel;
import app.repository.TurmaRepository;

@Service
public class TurmaService {

	@Autowired
	private TurmaRepository turmaRepository;
	
	public String save(TurmaModel turmaModel) {
		this.turmaRepository.save(turmaModel);
		return "Turma salva com sucesso!";
	}
	
	public TurmaModel findById(long id) {
		return this.turmaRepository.findById(id).get();
	}
	
	public List<TurmaModel> findAll(){
		return this.turmaRepository.findAll();
	}
	
	public String update(TurmaModel turmaModel, long id) {
		turmaModel.setId(id);
		this.turmaRepository.save(turmaModel);
		return "Turma atualizada com sucesso";
	}
	
	public String delete(long id) {
		this.turmaRepository.deleteById(id);
		return "Turma removida com sucesso!";
	}
}
