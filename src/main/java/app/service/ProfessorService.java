package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.ProfessorModel;
import app.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;

	public String save(ProfessorModel professorModel) {
		this.professorRepository.save(professorModel);
		return "Professor salvo com sucesso!";
	}

	public ProfessorModel findById(long id) {
		return this.professorRepository.findById(id).get();
	}

	public List<ProfessorModel> findAll() {
		return this.professorRepository.findAll();
	}

	public String update(ProfessorModel professorModel, long id) {
		professorModel.setId(id);
		this.professorRepository.save(professorModel);
		return "Professor atualizado com sucesso";
	}

	public String delete(long id) {
		this.professorRepository.deleteById(id);
		return "Professor removido com sucesso!";
	}
}
