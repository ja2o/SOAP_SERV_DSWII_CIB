package soap.cibertec.interfaces;
import java.util.List;
import soap.cibertec.entidad.ClienteBean;

public interface ClienteDAO {
	
	public int saveCliente(ClienteBean bean);
	public int updateCliente(ClienteBean bean);
	public int deleteCliente(int codigo);
	public ClienteBean findCliente(int codigo);
	public List<ClienteBean> listAllClientes();
	
}

