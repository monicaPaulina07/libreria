package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="productos")
public class Producto {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProducto")
	private int idProducto;
	@Column(name="numeroProducto")
	private String numeroProducto;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="precioProducto")
	private double precioProducto;
	@Column(name="stock")
	private int stock;
	@Column(name="ImgProducto")
	private String ImgProducto;
	
	@ManyToOne(cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JoinColumn(name="fk_idCategoria")		
	//GENERAMOS Categoria ***********
//	@Autowired
	private Categoria categoria;  //Categoria

	
	//Constructor Vacio
		public Producto() {
			
		}
		

		


	public Producto(int idProducto, String numeroProducto, String descripcion, double precioProducto, int stock,
				String imgProducto) {
			this.idProducto = idProducto;
			this.numeroProducto = numeroProducto;
			this.descripcion = descripcion;
			this.precioProducto = precioProducto;
			this.stock = stock;
			this.ImgProducto = imgProducto;
			
		}





		// METODOS GET Y SET
		



		public int getIdProducto() {
			return idProducto;
		}


		public void setIdProducto(int idProducto) {
			this.idProducto = idProducto;
		}


		public String getNumeroProducto() {
			return numeroProducto;
		}


		public void setNumeroProducto(String numeroProducto) {
			this.numeroProducto = numeroProducto;
		}


		public String getDescripcion() {
			return descripcion;
		}


		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}


		public double getPrecioProducto() {
			return precioProducto;
		}


		public void setPrecioProducto(double precioProducto) {
			this.precioProducto = precioProducto;
		}


		public int getStock() {
			return stock;
		}


		public void setStock(int stock) {
			this.stock = stock;
		}



		public String getImgProducto() {
			return ImgProducto;
		}


		public void setImgProducto(String imgProducto) {
			ImgProducto = imgProducto;
		}


		public Categoria getCategoria() {
			return categoria;
		}


		public void setCategoria(Categoria categoria) {
			this.categoria = categoria;
		}




		@Override
		public String toString() {
			return "Producto [idProducto=" + idProducto + ", numeroProducto=" + numeroProducto + ", descripcion="
					+ descripcion + ", precioProducto=" + precioProducto + ", stock=" + stock + ", ImgProducto="
					+ ImgProducto + ", categoria=" + categoria + "]";
		}
		
	
		
		
		
	
	
	

}
