package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.ProfessorModel;

public interface ProfessorRepository extends JpaRepository<ProfessorModel, Long>{

}
