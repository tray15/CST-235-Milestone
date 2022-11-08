package beans;

import java.util.HashMap;

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
