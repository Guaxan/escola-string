package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Professor;
import app.repository.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;

	public String save(Professor professorModel) {
		this.professorRepository.save(professorModel);
		return "Professor salvo com sucesso!";
	}

	public Professor findById(long id) {
		return this.professorRepository.findById(id).get();
	}

	public List<Professor> findAll() {
		return this.professorRepository.findAll();
	}

	public String update(Professor professorModel, long id) {
		professorModel.setId(id);
		this.professorRepository.save(professorModel);
		return "Professor atualizado com sucesso";
	}

	public String delete(long id) {
		this.professorRepository.deleteById(id);
		return "Professor removido com sucesso!";
	}
}
