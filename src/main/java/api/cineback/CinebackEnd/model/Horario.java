package api.cineback.CinebackEnd.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@NamedQuery(name="Horario.findAll", query="SELECT a FROM Horario a")
public class Horario implements Serializable {
	
	@Id
	@Column(name="ID_HORARIO")
	private String horar_id;
	
	@Column(name="FECHA_PROYECCION")
	private Date proyection_date;

	@Column(name="HORA_PROYECCION")
	private Time proyection_time;
	
	@ManyToOne
	@JoinColumn(name="ID_RESERVACION")
	private Reservacion recervation_id;
	
	public Horario() {
	}

	public String getHorar_id() {
		return horar_id;
	}

	public void setHorar_id(String horar_id) {
		this.horar_id = horar_id;
	}

	public Date getProyection_date() {
		return proyection_date;
	}

	public void setProyection_date(Date proyection_date) {
		this.proyection_date = proyection_date;
	}

	public Time getProyection_time() {
		return proyection_time;
	}

	public void setProyection_time(Time proyection_time) {
		this.proyection_time = proyection_time;
	}

	public Reservacion getRecervation_id() {
		return recervation_id;
	}

	public void setRecervation_id(Reservacion recervation_id) {
		this.recervation_id = recervation_id;
	}

}
