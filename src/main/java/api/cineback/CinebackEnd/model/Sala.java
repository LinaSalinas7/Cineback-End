package api.cineback.CinebackEnd.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name="Sala.findAll", query="SELECT a FROM Sala a")
public class Sala implements Serializable {
	
	@Id
	@Column(name="ID_SALA")
	private String sala_id;
	
	@Column(name="CAPACIDAD")
	private Number capacity;
	
	@Column(name="NUMERO_SALA")
	private String number_sala;

	@ManyToOne
	@JoinColumn(name="ID_HORARIO")
	private Horario horary_id;
	
	@ManyToOne
	@JoinColumn(name="ID_PELICULA")
	private Pelicula movie_id;
	
	public Sala() {
	}

	public String getSala_id() {
		return sala_id;
	}

	public void setSala_id(String sala_id) {
		this.sala_id = sala_id;
	}

	public Number getCapacity() {
		return capacity;
	}

	public void setCapacity(Number capacity) {
		this.capacity = capacity;
	}

	public String getNumber_sala() {
		return number_sala;
	}

	public void setNumber_sala(String number_sala) {
		this.number_sala = number_sala;
	}

	public Horario getHorary_id() {
		return horary_id;
	}

	public void setHorary_id(Horario horary_id) {
		this.horary_id = horary_id;
	}

	public Pelicula getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Pelicula movie_id) {
		this.movie_id = movie_id;
	}

	@Override
	public String toString() {
		return "Sala [sala_id=" + sala_id + ", capacity=" + capacity + ", number_sala=" + number_sala + ", horary_id="
				+ horary_id + ", movie_id=" + movie_id + "]";
	}

}
