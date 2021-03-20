package day8.assignment;

import java.util.Arrays;

class Movie {
	int movieId;
	String movieName;
	int movieRatings;

	Movie() {

	}

	public Movie(int movieId, String movieName, int movieRatings) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieRatings = movieRatings;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieRatings=" + movieRatings + "]";
	}

}

public class P4_MovieRatings {

	int theaterId;
	String theaterName, location;
	Movie m;

	P4_MovieRatings() {

	}

	public P4_MovieRatings(int theaterId, String theaterName, String location, Movie m) {
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.location = location;
		this.m = m;
	}

	@Override
	public String toString() {
		return "P4_MovieRatings [theaterId=" + theaterId + ", theaterName=" + theaterName + ", location=" + location
				+ ", m=" + m + "]";
	}

	public static void main(String[] args) {

		P4_MovieRatings theater1[] = new P4_MovieRatings[3];
		theater1[0] = new P4_MovieRatings(001, "Amanora Cineplex", "Pune - Hadapsar",
				new Movie(101, "Hobbs and Shaw", 4));
		theater1[1] = new P4_MovieRatings(002, "Inox", "Pimpri - Chinchwad", new Movie(102, "Fast And Furious", 5));
		theater1[2] = new P4_MovieRatings(003, "Phoenix", "Pune - VimanNagar",
				new Movie(103, "Snake in the Eagle's Shadow", 5));

		for (int i = 0; i < theater1.length; i++) {
			for (int j = i + 1; j < theater1.length; j++) {
				if (theater1[i].m.movieName.compareTo(theater1[j].m.movieName) < 0) {
					P4_MovieRatings temp = theater1[i];
					theater1[i] = theater1[j];
					theater1[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(theater1));

	}

}
