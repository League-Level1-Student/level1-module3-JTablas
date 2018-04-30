
public class netflixMovies {
public static void main(String[] args) {

	Movie spider = new Movie("Spiderman", 4);
	System.out.println(spider.toString());
	System.out.println(spider.getTicketPrice());
	
	Movie iron = new Movie("IronMan", 4);
	System.out.println(iron.toString());
	System.out.println(iron.getTicketPrice());

	Movie captain = new Movie("Captain America", 4);
	System.out.println(captain.toString());
	System.out.println(captain.getTicketPrice());

	Movie doctor = new Movie("Doctor Strange", 4);
	System.out.println(doctor.toString());
	System.out.println(doctor.getTicketPrice());

	Movie thor = new Movie("Thor", 4);
	System.out.println(thor.toString());
	System.out.println(thor.getTicketPrice());
}

}
