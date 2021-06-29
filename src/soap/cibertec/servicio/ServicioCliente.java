package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.dao.ClienteDAOImpl;
import soap.cibertec.entidad.ClienteBean;

public class ServicioCliente {
	
	ClienteDAOImpl clienteDao = new ClienteDAOImpl();
	
	public int registrarCliente( ClienteBean ClienteBean ) {
		return clienteDao.saveCliente( ClienteBean );
	}
	
	public int actualizarCliente( ClienteBean ClienteBean ) {
		return clienteDao.updateCliente( ClienteBean );
	}
	
	public int eliminarCliente( int codigoCliente) {
		return clienteDao.deleteCliente( codigoCliente );
	}
	
	public List<ClienteBean> listarCliente() {
		return clienteDao.listAllClientes();
	}
	
	public ClienteBean buscarCliente( int codCliente ) {
		return clienteDao.findCliente( codCliente );
	}

}
