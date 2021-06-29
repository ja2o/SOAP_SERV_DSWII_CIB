package soap.cibertec.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import soap.cibertec.entidad.ClienteBean;
import soap.cibertec.interfaces.ClienteDAO;
import utils.MysqlDBConexion;

public class ClienteDAOImpl implements ClienteDAO {

	public int saveCliente(ClienteBean bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_saveCliente(?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setString(1,bean.getNombre());
			cstm.setString(2,bean.getApellido());
			cstm.setString(3,bean.getTelefono());
			cstm.setString(4,bean.getEmail());
			cstm.setString(5, bean.getPassword());

			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	public int updateCliente(ClienteBean bean) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_updateCliente(?,?,?,?,?,?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,bean.getCodigo());
			cstm.setString(2,bean.getNombre());
			cstm.setString(3,bean.getApellido());
			cstm.setString(4,bean.getTelefono());
			cstm.setString(5,bean.getEmail());
			cstm.setString(6, bean.getPassword());
			
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	public int deleteCliente(int codigo) {
		int estado=-1;
		Connection cn=null;
		CallableStatement cstm=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_deleteCliente(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,codigo);
			estado=cstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return estado;
	}

	public ClienteBean findCliente(int codigo) {
		
		ClienteBean bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_findCliente(?)";
			cstm=cn.prepareCall(sql);
			cstm.setInt(1,codigo);
			rs=cstm.executeQuery();
			if(rs.next()) {
				bean=new ClienteBean();
				bean.setCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setApellido(rs.getString(3));
				bean.setTelefono(rs.getString(4));
				bean.setEmail(rs.getString(5));
				bean.setPassword(rs.getString(6));
				
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return bean;
	}

	public List<ClienteBean> listAllClientes() {
		List<ClienteBean> lista=new ArrayList<ClienteBean>();
		ClienteBean bean=null;
		Connection cn=null;
		CallableStatement cstm=null;
		ResultSet rs=null;
		try {
			cn=MysqlDBConexion.getConexion();
			String sql="call SP_listarCliente()";
			cstm=cn.prepareCall(sql);
			rs=cstm.executeQuery();
			while(rs.next()) {
				bean=new ClienteBean();
				bean.setCodigo(rs.getInt(1));
				bean.setNombre(rs.getString(2));
				bean.setApellido(rs.getString(3));
				bean.setTelefono(rs.getString(4));
				bean.setEmail(rs.getString(5));
				bean.setPassword(rs.getString(6));
				
				lista.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();	
		}
		finally{
			try {
				if(rs!=null) rs.close();
				if(cstm!=null) cstm.close();
				if(cn!=null) cn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return lista;
	}

}
