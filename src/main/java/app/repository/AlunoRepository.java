package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long>{

}
