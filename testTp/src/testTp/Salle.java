package testTp;

public class Salle {
	
	String codeSalle; 
	public Salle(String codeSalle,int num)
	{
		this.codeSalle=codeSalle+num;
	}
	@Override
	public String toString() {
		return "Salle [codeSalle=" + codeSalle + "]";
	}

}
