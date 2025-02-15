package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.AlunoModel;
import app.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public String save(AlunoModel alunoModel) {
		this.alunoRepository.save(alunoModel);
		return "Aluno salvo com sucesso!";
	}

	public AlunoModel findById(long id) {
		return this.alunoRepository.findById(id).get();
	}

	public List<AlunoModel> findAll() {
		return this.alunoRepository.findAll();
	}

	public String update(AlunoModel alunoModel, long id) {
		alunoModel.setId(id);
		this.alunoRepository.save(alunoModel);
		return "Aluno atualizado com sucesso";
	}

	public String delete(long id) {
		this.alunoRepository.deleteById(id);
		return "Aluno removido com sucesso";
	}
}
