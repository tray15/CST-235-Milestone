package beans;

import java.util.HashMap;


/*
 * @author Tanner Ray
 * MovieCast model class
 * 
 * uses a hashmap to store name of a cast member, role of the cast member
 */
public class MovieCast {
	HashMap<String, String> cast; //cast. Name of cast, Role of cast
		
	public MovieCast() {
		
	}
	
	public MovieCast(HashMap<String, String> cast) {
		this.cast = cast;
	}

	public HashMap<String, String> getCast() {
		return cast;
	}

	public void setCast(HashMap<String, String> cast) {
		this.cast = cast;
	}

}
