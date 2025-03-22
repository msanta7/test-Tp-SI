package testTp;

import java.time.LocalDateTime;
import java.util.Random;

public class Reservation {
	Random rand=new Random();
	int id=rand.nextInt(1000);
	String nomEmp;
	int dureeReservation;
	LocalDateTime debut;
	
	public Reservation(int id, String nomEmp, int dureeReservation, LocalDateTime debut) {
		super();
		this.id = id;
		this.nomEmp = nomEmp;
		this.dureeReservation = dureeReservation;
		this.debut = debut;
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
	
	
	

}
