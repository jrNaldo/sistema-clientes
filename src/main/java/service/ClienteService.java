package service;

import dao.ClienteDAO;
import dto.ClienteDTO;

public class ClienteService {
	
	private ClienteDAO dao = new ClienteDAO();
	
	public ClienteService() {}
	
	public void cadastrar(ClienteDTO dto) {
		dao.cadastrar(dto);
	}
}
