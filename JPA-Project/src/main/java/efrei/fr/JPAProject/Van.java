package efrei.fr.JPAProject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Van")
@DiscriminatorValue("Van")

public class Van extends Vehicule {
	private int maxweight;

	public int getMaxweight() {
		return maxweight;
	}

	public void setMaxweight(int maxweight) {
		this.maxweight = maxweight;
	}

	public Van(int maxweight) {
		super();
		this.maxweight=maxweight;
		
		
	}
}