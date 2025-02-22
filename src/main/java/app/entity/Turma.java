package app.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "O nome da turma nao pode ser vazio!")
	private String nome;

	private String semestre;
	private int ano;
	private String turno;

	@ManyToMany
	@JoinTable(
		name = "professor_turma", 
		joinColumns = @JoinColumn(name = "turma_id"), 
		inverseJoinColumns = @JoinColumn(name = "professor_id")
	)
	private List<Professor> professores;
}
