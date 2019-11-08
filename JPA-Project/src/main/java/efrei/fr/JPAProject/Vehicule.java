package efrei.fr.JPAProject;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Vehicule")
@DiscriminatorValue("Vehicule")

public class Vehicule {
	private int platenumber;

	public Vehicule() {
		// TODO Auto-generated constructor stub
	}

	public int getPlatenumber() {
		return platenumber;
	}

	public void setPlatenumber(int platenumber) {
		this.platenumber = platenumber;
	}
	

}