package efrei.fr.JPAProject;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


import javax.persistence.Id;


@Entity(name = "Person")
@DiscriminatorValue("Person")

public class Person {
	
	private long id;
	private String name;
	private int age;
	
	public Person() {
		super();
	}

	public Person(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

		public String getname() {
			return name;
		}

		public void setname(String name) {
			this.name = name;
		}
		
		@Id
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}




