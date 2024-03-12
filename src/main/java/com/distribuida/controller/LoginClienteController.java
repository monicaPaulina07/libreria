package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.ClienteService;
import com.distribuida.dto.LoginClienteService;
import com.distribuida.entities.Cliente;
import com.distribuida.entities.loginCliente;



@Controller
@RequestMapping("/loginclientes")
public class LoginClienteController {
	
	@Autowired
	private LoginClienteService loginClienteService;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		
		List<loginCliente> loginClientes =loginClienteService.findAll();
		model.addAttribute("loginClientes",loginClientes);

		return "loginClientes-listar";
		
	}
	
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("id") @Nullable Integer id
			,@RequestParam("opcion") @Nullable Integer opcion
			, Model model) {
	
		if(id != null) {
			loginCliente logincliente = loginClienteService.findOne(id); 
			model.addAttribute("logincliente",logincliente);
		}
		
		if(opcion == 1) return "loginClientes-add";
		else return "loginClientes-del";
		
	
		
	}
	
	@PostMapping("/add")
	public String add(@RequestParam("id") @Nullable Integer id
			,@RequestParam("user") @Nullable String user
			, @RequestParam("password") @Nullable String password
			,@RequestParam("newpassword") @Nullable String newpassword
			,@RequestParam("confirmpassword") @Nullable String confirmpassword
			,@RequestParam("loginCorreo") @Nullable String loginCorreo
			,@RequestParam("loginToken") @Nullable String loginToken
			 ,@RequestParam("sessiontimeIn") @Nullable @DateTimeFormat(pattern = "yyyy-MM-dd") Date sessiontimeIn
			 ,@RequestParam("sessiontimeOUT") @Nullable @DateTimeFormat(pattern = "yyyy-MM-dd") Date sessiontimeOUT

			
			,@RequestParam("sessiontiempo") @Nullable Integer sessiontiempo
			, Model model
			) {
		
		if(id == null) loginClienteService.add(0, user, password, newpassword, confirmpassword, loginCorreo, loginToken, sessiontimeIn, sessiontimeOUT, sessiontiempo);
		else loginClienteService.up(id, user, password, newpassword, confirmpassword, loginCorreo, loginToken, sessiontimeIn, sessiontimeOUT, sessiontiempo);
		
		return "redirect:/loginclientes/findAll";
	}
	
	@GetMapping("/del")
	public String del( @RequestParam("id") @Nullable Integer id){
		
		loginClienteService.del(id);

		return "redirect:/loginclientes/findAll";
	}


}
