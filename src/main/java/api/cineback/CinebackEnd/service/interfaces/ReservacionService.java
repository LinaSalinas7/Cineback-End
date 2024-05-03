package api.cineback.CinebackEnd.service.interfaces;

import api.cineback.CinebackEnd.model.Reservacion;

public interface ReservacionService {
	
	public Iterable<Reservacion> findAll();
	public void save(Reservacion reservation);
	public Reservacion findById(long id);
	public void delete(Reservacion reservation);

}
