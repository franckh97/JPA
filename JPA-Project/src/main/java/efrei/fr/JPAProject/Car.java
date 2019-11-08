package efrei.fr.JPAProject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Car")
@DiscriminatorValue("Car")

public class Car extends Vehicule {
	private int numberOfSeats;

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Car(int numberOfSeats) {
		super();
		this.numberOfSeats = numberOfSeats;
	}
	

}