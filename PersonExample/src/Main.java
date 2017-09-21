
public class Main {

	public static void main(String[] args) {
		Person me = new Person("Bill", "Neely");
		System.out.println(me.getName());  // should print "Bill Neely"
		System.out.println(me.getlastNameFirst());  // should print "Neely, Bill"
		me.setFirstName("Harold");
		System.out.println(me.getlastNameFirst());  // should print "Neely, Harold"
		
		
		Book textBook = new Book("Mrach on Java");
		System.out.println(textBook.title()); // "Murach on Java"
		
		
	}

}
