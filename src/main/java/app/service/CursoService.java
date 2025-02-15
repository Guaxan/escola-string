package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.CursoModel;
import app.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository cursoRepository;

	public String save(CursoModel cursoModel) {
		this.cursoRepository.save(cursoModel);
		return "Curso salvo com sucesso!";
	}

	public CursoModel findById(long id) {
		return this.cursoRepository.findById(id).get();
	}

	public List<CursoModel> findAll() {
		return this.cursoRepository.findAll();
	}

	public String update(CursoModel cursoModel, long id) {
		cursoModel.getId();
		this.cursoRepository.save(cursoModel);
		return "Curso atualizado com sucesso!";
	}

	public String delete(long id) {
		this.cursoRepository.deleteById(id);
		return "Curso removido com sucesso";
	}
}
