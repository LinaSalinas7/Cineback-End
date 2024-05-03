package api.cineback.CinebackEnd.model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.*;

@Entity
@NamedQuery(name="Pelicula.findAll", query="SELECT a FROM Pelicula a")
public class Pelicula implements Serializable{

	@Id
	@Column(name="ID_PELICULA")
	private String movie_id;
	
	@Column(name="TITULO")
	private String name_movie;

	@Column(name="DIRECTOR")
	private String director;
	
	@Column(name="DURACION")
	private Time duration;
	
	@Column(name="FECHA_ESTRENO")
	private Date date_premiere;
	
	@ManyToOne
	@JoinColumn(name="ID_HORARIO")
	private Horario horary_id;

	public Pelicula() {
	}

	public String getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}

	public String getName_movie() {
		return name_movie;
	}

	public void setName_movie(String name_movie) {
		this.name_movie = name_movie;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public Date getDate_premiere() {
		return date_premiere;
	}

	public void setDate_premiere(Date date_premiere) {
		this.date_premiere = date_premiere;
	}

	public Horario getHorary_id() {
		return horary_id;
	}

	public void setHorary_id(Horario horary_id) {
		this.horary_id = horary_id;
	}
}
