package beans;

public class Movie {
	private int id;
	private String name;
	private String description;
	private String release;
	private String rating;
	private String category;
	private int viewerRating;
	private int duration;
	private Boolean watched;
	MovieCast cast;
	
	public Movie() {
		id = 0;
		name = "";
		description = "";
		release = "";
		rating = "";
		category = "";
		viewerRating = 0;
		duration = 0;
		watched = false;
		cast = new MovieCast();
	}
	
	public Movie(int id, String name, String description, String release, String rating, String category, int viewerRating, int duration, Boolean watched, MovieCast cast) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.release = release;
		this.rating = rating;
		this.category = category;
		this.viewerRating = viewerRating;
		this.duration = duration;
		this.watched = watched;
		this.cast = cast;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	public int getViewerRating() {
		return viewerRating;
	}

	public void setViewerRating(int viewerRating) {
		this.viewerRating = viewerRating;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public Boolean getWatched() {
		return watched;
	}
	
	public void setWatched(Boolean watched) {
		this.watched = watched;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public MovieCast getCast() {
		return cast;
	}

	public void setCast(MovieCast cast) {
		this.cast = cast;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
