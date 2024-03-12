package com.distribuida.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dto.AutorService;
import com.distribuida.dto.CategoriaService;
import com.distribuida.dto.LibroService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libros")
public class LibroController {

	@Autowired
	private LibroService libroService;
	
	@Autowired
	private AutorService autorService;
	
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/findAll")
	public String findAll(Model model) {
		
		List<Libro> libros =libroService.findAll();		
		model.addAttribute("libros", libros);		
		return "libros-listar";
	}
	
	@GetMapping("/findOne")
	public String findOne(@RequestParam("idLibro") @Nullable Integer idLibro
			, @RequestParam("opcion") @Nullable Integer opcion
			, ModelMap modelMap
			) {
		
		if(idLibro != null) {
			Libro libro = libroService.findOne(idLibro);
			modelMap.addAttribute("libro", libro);
		}
		
		List<Autor> autores = autorService.findAll();
		List<Categoria> categorias = categoriaService.findAll();
		modelMap.addAttribute("autores", autores);
		modelMap.addAttribute("categorias", categorias);
		
		if (opcion == 1) return "libros-add";
		else return "libros-del";
	}
	
	@PostMapping("/add")
	public String add(
			@RequestParam("idLibro") @Nullable Integer idLibro
			 ,@RequestParam("titulo") @Nullable String titulo
			 ,@RequestParam("editorial") @Nullable String editorial
			 ,@RequestParam("numPaginas") @Nullable Integer numPaginas
			 ,@RequestParam("edicion") @Nullable String edicion
			 ,@RequestParam("idioma") @Nullable String idioma
			 ,@RequestParam("fechaPublicacion") @Nullable @DateTimeFormat (pattern = "yyyy-MM-dd")  Date fechaPublicacion
			 ,@RequestParam("descripcion") @Nullable String descripcion
			 ,@RequestParam("tipoPasta") @Nullable String tipoPasta
			 ,@RequestParam("ISBN") @Nullable String ISBN
			 ,@RequestParam("numEjemplares") @Nullable Integer numEjemplares
			 ,@RequestParam("portada") @Nullable String portada
			 ,@RequestParam("presentacion") @Nullable String presentacion
			 ,@RequestParam("precio") @Nullable Double precio
			 ,@RequestParam("idAutor") @Nullable Integer idAutor
			 ,@RequestParam("idCategoria") @Nullable Integer idCategoria
			
			) {
		
		if(idLibro == null) {
			//libroService.add(0, "a", "a", "2", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a");
	//int numPaginas1=numPaginas;
			libroService.add(0, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion, descripcion, tipoPasta, ISBN, numEjemplares, portada, presentacion, precio, idAutor, idCategoria);
		}
		else {
			libroService.up(idLibro, titulo, editorial, numPaginas, edicion, idioma, fechaPublicacion, descripcion, tipoPasta, ISBN, numEjemplares, portada, presentacion, precio, idAutor, idCategoria);			
		}
			
		return "redirect:/libros/findAll";	  
	}
	
	@GetMapping("/del")
	public String del(@RequestParam("idLibro") @Nullable Integer idLibro) {
		libroService.del(idLibro);
		return "redirect:/libros/findAll";
	}

}
