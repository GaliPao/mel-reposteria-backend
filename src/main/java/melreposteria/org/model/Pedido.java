package melreposteria.org.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable = false)
	private Long id;
	@Column (nullable=false)
	private Integer total;	
	private String status;
	private String direccionEnvio;
	private String calleNumero;
	private int cp;
	private String colonia;
	@Column (nullable=false)
	private Double precio;
	@Column (nullable=false)
	private Long clientesId;
	
	
	public Pedido(Long id, Integer total, Double precio, String status, String direccionEnvio, String calleNumero,
			int cp, String colonia, Long clientesId) {
		
		this.id = id;
		this.total = total;
		this.precio = precio;
		this.status = status;
		this.direccionEnvio = direccionEnvio;
		this.calleNumero = calleNumero;
		this.cp = cp;
		this.colonia = colonia;
		this.clientesId = clientesId;
	}//constructor


	public Pedido() {
		
	}//constructor vacio

	
	
	
	//GETTERS AND SETTERS

	public Long getId() {
		return id;
	}



	public Integer getTotal() {
		return total;
	}


	public void setTotal(Integer total) {
		this.total = total;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getDireccionEnvio() {
		return direccionEnvio;
	}


	public void setDireccionEnvio(String direccionEnvio) {
		this.direccionEnvio = direccionEnvio;
	}


	public String getCalleNumero() {
		return calleNumero;
	}


	public void setCalleNumero(String calleNumero) {
		this.calleNumero = calleNumero;
	}


	public int getCp() {
		return cp;
	}


	public void setCp(int cp) {
		this.cp = cp;
	}


	public String getColonia() {
		return colonia;
	}


	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	
	public Long getClientesId() {
		return clientesId;
	}//GETTERS AND SETTERS

	
	
	

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", total=" + total + ", status=" + status + ", direccionEnvio=" + direccionEnvio
				+ ", calleNumero=" + calleNumero + ", cp=" + cp + ", colonia=" + colonia + ", precio=" + precio
				+ ", clientesId=" + clientesId + "]";
	}//To String	

}
