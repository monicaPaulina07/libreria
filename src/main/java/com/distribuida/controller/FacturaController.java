package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Factura;
import com.distribuida.entities.FacturaDetalle;

@Controller
@RequestMapping("/facturas")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		List<FacturaDetalle> facturadetalles = facturaService.findAll();
		model.addAttribute("facturadetalles",facturadetalles);
		return "facturadetalle-listar";
		
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("numFactura") @Nullable String numFactura
			, @RequestParam("opcion") @Nullable Integer opcion
			, Model model) {
		
		if(numFactura != null) {
			int factura = facturaService.findOne( numFactura);
			model.addAttribute("factura",factura);
		}
		if(opcion == 1) return "factura-add";
		else return "factura-del";
		
	}
	
//	@PostMapping("/add")
//	public String add(@RequestParam("idFactura") @Nullable Integer idFactura
//			, @RequestParam("numFactura") @Nullable String cedula
//			, @RequestParam("fechaFactura") @Nullable String nombre
//			, @RequestParam("totalNeto") @Nullable String apellido
//			, @RequestParam("iva") @Nullable String direccion
//			, @RequestParam("total") @Nullable String telefono
//			, Model model
//			) {
//		if(idFactura == null) facturaService.add(0,numFactura, fechaFactura, totalNeto, iva, total);
//		else facturaService.up(idFactura,,numFactura, fechaFactura, totalNeto, iva, total);
//		
//		return "redirect:/facturas/findAll";
//	}
//	

}
