package api.cineback.CinebackEnd.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import api.cineback.CinebackEnd.model.Reservacion;

@Repository
@Scope("singleton")
public class ReservacionDaoImp implements ReservacionDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public void Save(Reservacion entity) {
		em.persist(entity);
		
	}

	@Override
	@Transactional
	public void Delete(Reservacion entity) {
		Reservacion attachedEntity = em.merge(entity);
		em.remove(attachedEntity);
		
	}

	@Override	
	@Transactional
	public void Edit(Reservacion entity) {
		em.merge(entity);
		
	}

	@Override
	public Reservacion findById(long id) {
		return em.find(Reservacion.class, id);
	}

	@Override
	public List<Reservacion> findAll() {
		String r = "SELECT reserv FROM Reservacion reserv ";
		return em.createQuery(r).getResultList();
	}


}
