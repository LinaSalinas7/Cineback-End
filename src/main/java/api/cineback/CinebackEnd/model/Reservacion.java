package api.cineback.CinebackEnd.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Reservacion.findAll", query="SELECT a FROM Reservacion a")
public class Reservacion implements Serializable {

	@Id
	@Column(name="ID_RESERVACION")
	private String reservacion_id;
	
	@Column(name="TOTAL_ASIENTOS")
	private Number total_chairs;

	@ManyToOne
	@JoinColumn(name="ID_HORARIO")
	private Horario horary_id;
	
	public Reservacion() {
	}

	public String getReservacion_id() {
		return reservacion_id;
	}

	public void setReservacion_id(String reservacion_id) {
		this.reservacion_id = reservacion_id;
	}

	public Number getTotal_chairs() {
		return total_chairs;
	}

	public void setTotal_chairs(Number total_chairs) {
		this.total_chairs = total_chairs;
	}

	public Horario getHorary_id() {
		return horary_id;
	}

	public void setHorary_id(Horario horary_id) {
		this.horary_id = horary_id;
	}

}
