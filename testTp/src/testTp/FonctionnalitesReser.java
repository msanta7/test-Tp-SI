package testTp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FonctionnalitesReser {
	
	List<Reservation> reserv; 
	
	public FonctionnalitesReser() {
		reserv = new ArrayList<>();
    }
	
	public void ajouterRes(int id, String nomEmp, int dureeReservation, LocalDateTime debut,String salle) {
		Reservation res = new Reservation(id, nomEmp, dureeReservation, debut,salle);
		reserv.add(res);
	}
	
	public void afficherRes() {
		if (!reserv.isEmpty()) {
			System.out.println("la liste des reservation : ");
			for (Reservation res : reserv) {
				System.out.println(res);
			}
		} else {
			System.out.println("aucune reservation");
		}
	}
	
	public void suppRes(Reservation reservation) throws ReservationNonTrouve {
		if (reserv.contains(reservation)) {
			reserv.remove(reservation);
		} else {
			throw new ReservationNonTrouve("reservation introuvable");
		}
	}
	
	public void modifierRes(int id, String nomEmp, int dureeReservation, LocalDateTime debut) throws ReservationNonTrouve {

		for (Reservation res : reserv) {
			if (res.getId() == id) {
				res.setDebut(debut);
				res.setDureeReservation(dureeReservation);
				res.setNomEmp(nomEmp);
				break;
			}
			throw new ReservationNonTrouve("reservation introuvable");
		}
		
	}
	
	public void doubleReservCheck(int id) {
		int count = 0;
		for (Reservation res : reserv) {
			if (res.getId() == id) {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("il y a " + count + " reservation");
		} else if (count == 1) {
			System.out.println("pas de double reservation");
		}
	}
}
