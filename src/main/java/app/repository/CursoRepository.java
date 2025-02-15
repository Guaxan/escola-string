package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.CursoModel;

public interface CursoRepository extends JpaRepository<CursoModel, Long>{

}
