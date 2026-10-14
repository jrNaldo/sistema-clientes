package dao;

import dto.ClienteDTO;
import entity.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ClienteDAO {
	public void cadastrar(ClienteDTO dto) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("clientes-pu");
		EntityManager entMan = factory.createEntityManager();
		Cliente entity = toEntity(dto);
		entMan.getTransaction().begin();
		entMan.persist(entity);
		entMan.getTransaction().commit();
		entMan.close();
		factory.close();
	}
	
	private Cliente toEntity(ClienteDTO dto) {
		Cliente entity = new Cliente();
		entity.setNome(dto.getNome());
		entity.setEmail(dto.getEmail());
		entity.setTelefone(dto.getTelefone());
		
		return entity;
	}
}
