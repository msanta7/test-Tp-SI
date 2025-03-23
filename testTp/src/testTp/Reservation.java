package testTp;

import java.time.LocalDateTime;
import java.util.Random;

public class Reservation {
	Random rand = new Random();
	int id;
	String nomEmp;
	int dureeReservation;
	LocalDateTime debut;
	String salle; 

	public Reservation(int id, String nomEmp, int dureeReservation, LocalDateTime debut, String salle) {
		super();
		this.id = rand.nextInt(100);
		this.nomEmp = nomEmp;
		this.dureeReservation = dureeReservation;
		this.debut = debut;
		this.salle = salle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomEmp() {
		return nomEmp;
	}

	public void setNomEmp(String nomEmp) {
		this.nomEmp = nomEmp;
	}

	public int getDureeReservation() {
		return dureeReservation;
	}

	public void setDureeReservation(int dureeReservation) {
		this.dureeReservation = dureeReservation;
	}

	public LocalDateTime getDebut() {
		return debut;
	}

	public void setDebut(LocalDateTime debut) {
		this.debut = debut;
	}

	public String getSalle() {
		return salle;
	}

	public void setSalle(String salle) {
		this.salle = salle;
	}

	@Override
	public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", nomEmp='" + nomEmp + '\'' +
                ", dureeReservation=" + dureeReservation +
                ", debut=" + debut +
                ", salle='" + salle + '\'' +
                '}';
    }
}
