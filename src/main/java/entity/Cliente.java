package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "nome", nullable = false, length = 150)
	private String nome;
	
	@Column(name = "email", nullable = false, length = 150)
	private String email;
	
	@Column(name = "telefone", nullable = false, length = 11)
	private String telefone;
	
}
