package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.TurmaModel;

public interface TurmaRepository extends JpaRepository<TurmaModel, Long>{

}
