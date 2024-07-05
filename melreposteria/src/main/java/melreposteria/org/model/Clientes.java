package melreposteria.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes {	
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id", unique=true, nullable=false)	
	private Long id;
	@Column (nullable=false)
	private String nombre;
	private int telefono;
	private String email;
	private String contraseña;
	@Column (nullable=false)
	private String calleNumero;
	private String colonia;	
	private int  codigoPostal;	
	
	public Clientes(String nombre, String email, String contraseña, int telefono, int codigoPostal, String calleNumero,
			String colonia) {
		
		this.nombre = nombre;
		this.email = email;
		this.contraseña = contraseña;
		this.telefono = telefono;
		this.codigoPostal = codigoPostal;
		this.calleNumero = calleNumero;
		this.colonia = colonia;
	}//Constructor

	public Clientes () {
	}//Constructor vacio


	//Getter and Setters
	public String getNombre() {
		return nombre;
	}//getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//setNombre

	public String getEmail() {
		return email;
	}//getEmail

	public void setEmail(String email) {
		this.email = email;
	}//setEmail

	public String getPassword() {
		return contraseña;
	}//getContraseña

	public void setPassword(String contraseña) {
		this.contraseña = contraseña;
	}//setContraseña

	public int getTelefono() {
		return telefono;
	}//getTelefono

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}//setTelefono

	public int getCodigoPostal() {
		return codigoPostal;
	}//getCodigoPostal

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}//setCodigoPostal

	public String getCalleNumero() {
		return calleNumero;
	}//getCalleNumero

	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}//setCalleNumero


	public String getColonia() {
		return colonia;
	}//getColonia


	public void setColonia(String colonia) {
		this.colonia = colonia;
	}//setColonia	
	

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nombre=" + nombre + ", email=" + email + ", contraseña=" + contraseña
				+ ", telefono=" + telefono + ", codigoPostal=" + codigoPostal + ", calleNumero=" + calleNumero
				+ ", colonia=" + colonia + "]";
	}

	

	

}
