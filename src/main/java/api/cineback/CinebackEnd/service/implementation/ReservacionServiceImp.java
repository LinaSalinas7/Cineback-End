package api.cineback.CinebackEnd.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.cineback.CinebackEnd.daos.ReservacionDao;
import api.cineback.CinebackEnd.model.Reservacion;
import api.cineback.CinebackEnd.service.interfaces.ReservacionService;

@Service
public class ReservacionServiceImp implements ReservacionService{
	
	private ReservacionDao reservacionDao;
	
	@Autowired
	public ReservacionServiceImp(ReservacionDao reservacionDao) {
		this.reservacionDao = reservacionDao;
	}

	@Override
	public Iterable<Reservacion> findAll() {
		return reservacionDao.findAll();
	}

	@Override
	public void save(Reservacion reservation) {
		reservacionDao.Save(reservation);
		
	}

	@Override
	public Reservacion findById(long id) {
		return reservacionDao.findById(id);
	}

	@Override
	public void delete(Reservacion reservation) {
		reservacionDao.Delete(reservation);;
		
	}

}
