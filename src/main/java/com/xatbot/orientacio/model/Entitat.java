package com.xatbot.orientacio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

	@Entity
	@Table(name="Entidades")
	
public class Entitat implements Serializable{
		
		private static final long serialVersionUID = 1L;
		
		@Id 
		//@GeneratedValue(generator="system-uuid")
		//@GenericGenerator(name="system-uuid", strategy = "uuid")
		@Column(name="centro_Id")
		private int id;
		@Column(name="Localidad")
		private String localidad;
		@Column(name="TipoEntidad")
		private String tipo;
		@Column(name="NombreEntidad")
		private String nombreentidad;
		@Column(name="Direccion")
		private String direccion;
		@Column(name="Cod_postal")
		private String codpostal;
		@Column(name="Provincia")
		private String provincia;
		@Column(name="Contacto")
		private String contacto;
		@Column(name="Telefono")
		private String telefono;
		@Column(name="email")
		private String email;
		@Column(name="web")
		private String web;
		
		
		public Entitat() {
		}

		public Entitat(String localidad, String tipo, String nombreentidad, String direccion, String codpostal,
				String provincia, String contacto, String telefono, String email, String web) {
			super();
			this.localidad = localidad;
			this.tipo = tipo;
			this.nombreentidad = nombreentidad;
			this.direccion = direccion;
			this.codpostal = codpostal;
			this.provincia = provincia;
			this.contacto = contacto;
			this.telefono = telefono;
			this.email = email;
			this.web = web;
		}

		public int getId() {
			return id;
		}

		public String getLocalidad() {
			return localidad;
		}

		public void setLocalidad(String localidad) {
			this.localidad = localidad;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getNombreentidad() {
			return nombreentidad;
		}

		public void setNombreentidad(String nombreentidad) {
			this.nombreentidad = nombreentidad;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCodpostal() {
			return codpostal;
		}

		public void setCodpostal(String codpostal) {
			this.codpostal = codpostal;
		}

		public String getProvincia() {
			return provincia;
		}

		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}

		public String getContacto() {
			return contacto;
		}

		public void setContacto(String contacto) {
			this.contacto = contacto;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getWeb() {
			return web;
		}

		public void setWeb(String web) {
			this.web = web;
		}

		@Override
		public String toString() {
			return "centros [localidad=" + localidad + ", tipo=" + tipo + ", nombreentidad=" + nombreentidad
					+ ", direccion=" + direccion + ", codpostal=" + codpostal + ", provincia=" + provincia
					+ ", contacto=" + contacto + ", telefono=" + telefono + ", email=" + email + ", web=" + web + "]";
		}

	
}
