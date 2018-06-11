import javax.swing.JOptionPane;

public class netflixMovies {
public static void main(String[] args) {

	
	
	Movie spider = new Movie("Spiderman", 4);
	System.out.println(spider.toString());
	
	System.out.println(spider.getTicketPrice());
	
	Movie iron = new Movie("IronMan", 5);
	System.out.println(iron.toString());
	
	System.out.println(iron.getTicketPrice());
	
	Movie captain = new Movie("Captain America", 4);
	System.out.println(captain.toString());
	
	System.out.println(captain.getTicketPrice());
	
	Movie doctor = new Movie("Doctor Strange", 4);
	System.out.println(doctor.toString());

	System.out.println(doctor.getTicketPrice());
	
	Movie thor = new Movie("Thor", 3);
	System.out.println(thor.toString());
	
	System.out.println(thor.getTicketPrice());
	
	NetflixQueue netQue = new NetflixQueue();
	netQue.addMovie(thor);
	netQue.addMovie(spider);
	netQue.addMovie(iron);
	netQue.addMovie(captain);
	netQue.addMovie(doctor);
	netQue.printMovies();
	
	netQue.sortMoviesByRating();
	System.out.println("The best movie is "+netQue.getBestMovie());
	System.out.println("The second best movie is "+netQue.getSecondBestMovie());
}

}
