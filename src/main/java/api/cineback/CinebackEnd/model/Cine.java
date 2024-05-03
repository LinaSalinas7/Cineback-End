package api.cineback.CinebackEnd.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Cine.findAll", query="SELECT a FROM Cine a")
public class Cine implements Serializable {
	
	@Id
	@Column(name="NOMBRE")
	private String name;
	
	@Column(name="DIRECCION")
	private String address;

	@ManyToOne
	@JoinColumn(name="RESERVACION_ID")
	private Reservacion id_reservacion;

	@ManyToOne
	@JoinColumn(name="SALA_ID")
	private Sala id_sala;
	
	public Cine() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Reservacion getId_reservacion() {
		return id_reservacion;
	}

	public void setId_reservacion(Reservacion id_reservacion) {
		this.id_reservacion = id_reservacion;
	}

	public Sala getId_sala() {
		return id_sala;
	}

	public void setId_sala(Sala id_sala) {
		this.id_sala = id_sala;
	}

}
