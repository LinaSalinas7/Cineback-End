	package api.cineback.CinebackEnd.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.cineback.CinebackEnd.model.Reservacion;
import api.cineback.CinebackEnd.service.interfaces.ReservacionService;

@RestController
@RequestMapping("/api-rest/reservacion")
public class ReservacionRestControllerImp implements ReservacionRestController {
	
	@Autowired
	private ReservacionService reservacionService; 

	@Override
	@GetMapping("/")
	public Iterable<Reservacion> indexReservacion() {
		return reservacionService.findAll();
	}

	@Override
	@PostMapping
	public void saveReservacion(@RequestBody Reservacion reservation) {
		reservacionService.save(reservation);
		
	}

	@Override
	@DeleteMapping("/{reservacionId}")
	public void deleteReservacion(@PathVariable("reservacionId") long id) {
		Reservacion reserv = reservacionService.findById(id);
		reservacionService.delete(reserv);
		
	}

	@Override
	@GetMapping("/{reservacionId}")
	public Reservacion showReservacion(@PathVariable("reservacionId") long id) {
		return reservacionService.findById(id);
	}

	@Override
	@PutMapping("/{reservacionId}")
	public void updateReservacion(long id, Reservacion reservation) {
		// TODO Auto-generated method stub
		
	}

}
