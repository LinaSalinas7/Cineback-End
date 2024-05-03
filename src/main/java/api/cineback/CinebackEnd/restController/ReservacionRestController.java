package api.cineback.CinebackEnd.restController;

import org.springframework.web.bind.annotation.PathVariable;

import api.cineback.CinebackEnd.model.Reservacion;

public interface ReservacionRestController {
	
	public Iterable<Reservacion> indexReservacion();
	public void saveReservacion(Reservacion reservation);
	public void deleteReservacion(long id);
	public Reservacion showReservacion(@PathVariable("id") long id);	
	public void updateReservacion(long id, Reservacion reservation);

}
