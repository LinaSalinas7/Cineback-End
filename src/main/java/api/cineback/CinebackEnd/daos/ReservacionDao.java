package api.cineback.CinebackEnd.daos;

import java.util.List;

import api.cineback.CinebackEnd.model.Reservacion;

public interface ReservacionDao {
	public void Save(Reservacion entity);
	public void Delete(Reservacion entity);
	public void Edit(Reservacion entity);
	public Reservacion findById(long id);
	public List<Reservacion> findAll();

}
