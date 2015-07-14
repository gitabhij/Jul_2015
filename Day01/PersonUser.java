public class PersonUser {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Sam";
		p1.age = 12;
		p1.placeOfStay = new Address();
		p1.placeOfStay.street = "Richmond";
		p1.placeOfStay.city = "Bangalore";
		p1.placeOfStay.country = "India";
		p1.eat("Rice");
		p1.sleep(8);
		
		Person p2 = new Person();
		p2.name = "Ram";
		p2.age = 42;
		p2.placeOfStay = new Address();
		p2.placeOfStay.street = "Bandra";
		p2.placeOfStay.city = "Mumbai";
		p2.placeOfStay.country = "India";		
		p2.eat("Rice");
		p2.sleep(8);
		p2.work();
	}
}