package com.distribuida.dto;

import java.util.Date;
import java.util.List;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Usuario;


public interface ClienteService {

	public List<Cliente> findAll();
	
	public Cliente findOne(int id);
	
	public void add(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo, String genero, Date fechadenacimiento, int fk_idtipoUS);
	
	public void up(int idCliente, String cedula, String nombre, String apellido, String direccion, String telefono,
			String correo, String genero, Date fechadenacimiento, int fk_idtipoUS);
	
	public void del(int id);

	public List<Cliente> findAll(String busqueda);
	
}
