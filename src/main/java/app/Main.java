package app;

import dto.ClienteDTO;
import service.ClienteService;

public class Main {
	public static void main(String[] args) {
		ClienteDTO c = new ClienteDTO();
		c.setEmail("julio@gmail.com");
		c.setNome("Julio");
		c.setTelefone("22222222222");
		
		ClienteService service = new ClienteService();
		
		service.cadastrar(c);
	}
}
