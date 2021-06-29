package utils;

import soap.cibertec.dao.ClienteDAOImpl;
import soap.cibertec.entidad.ClienteBean;

public class Pruebas {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAOImpl dao = new ClienteDAOImpl();
		
		
//		for ( ClienteBean cli : dao.listAllClientes()) {
//			System.out.println(cli);
//		}
		
		//dao.listAllClientes().stream().forEach(System.out::println);
		
		ClienteBean cli = new ClienteBean();
		
		cli = dao.findCliente(26);
		
		System.out.println( cli );
		
//		dao.deleteCliente(26);
		
		
	}
}
