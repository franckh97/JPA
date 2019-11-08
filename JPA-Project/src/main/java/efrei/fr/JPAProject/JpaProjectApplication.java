package efrei.fr.JPAProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.CommandLineRunner;


import efrei.fr.JPAProject.Car;
import efrei.fr.JPAProject.Person;
import efrei.fr.JPAProject.Vehicule;
import efrei.fr.JPAProject.Van;


@SpringBootApplication
public class JpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

	
	public CommandLineRunner demo(EntityManagerFactory emf, long id) {
        return (args) -> {
			EntityManager em = emf.createEntityManager();
			Person person = em.find(Person.class, id);
			em.persist(person);
			//printObject(person); 
			Car car = em.find(Car.class, id);
			em.persist(car);
			Van van = em.find(Van.class, id);
			em.persist(van);
			Vehicule vehicle = em.find(Vehicule.class, id);
			em.persist(vehicle);
        };
    }
}
