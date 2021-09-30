package LargeClass.extractClass.solution;

public class Person {
	
	String name, id;
	Address ad;
	
	Person(){
		ad=new Address();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAd() {
		return ad;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", city=" + ad.getCity() + ", country=" + ad.getCountry() + "]";
	}
	
	
	
	
	

}
