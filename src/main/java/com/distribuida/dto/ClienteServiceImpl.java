package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.ProductoDAO;
import com.distribuida.dao.UsuarioDAO;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.Producto;
import com.distribuida.entities.Usuario;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDAO clienteDAO;
	
	@Autowired
	private UsuarioDAO usuarioDAO;
	
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return clienteDAO.findAll();
	}

	@Override
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		return clienteDAO.findOne(id);
	}

	@Override
	public void add(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo, String genero, Date fechadenacimiento, int fk_idtipoUS) {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioDAO.findOne(fk_idtipoUS);
		
		Cliente cliente1 = new Cliente(idCliente, cedula, nombre, apellido, direccion, telefono, correo, genero, fechadenacimiento, usuario);
		
		cliente1.setUsuario(usuario);
		
		clienteDAO.add(cliente1);

	}

	@Override
	public void up(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo, String genero, Date fechadenacimiento, int fk_idtipoUS) {
		// TODO Auto-generated method stub
		Usuario usuario = usuarioDAO.findOne(fk_idtipoUS);
		
		Cliente cliente1 = new Cliente(idCliente,cedula,nombre,apellido,direccion,telefono,correo,genero,fechadenacimiento, usuario);
		
		cliente1.setUsuario(usuario);
		
		clienteDAO.up(cliente1);
	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

		clienteDAO.del(id);
	}
	
	@Override
	public List<Cliente> findAll(String busqueda){
		return null;
		
	}

}
