package com.movie.ReviewDTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class ReviewDTO {

	 private String contents;
	    private int rating;
	    private Long userId;
	    private Long movieId;
		
	    public ReviewDTO(String contents, int rating, Long userId, Long movieId) {
			super();
			this.contents = contents;
			this.rating = rating;
			this.userId = userId;
			this.movieId = movieId;
		}

	    
	
}
