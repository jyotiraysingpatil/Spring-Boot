package com.rail.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Railway {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotNull(message = "Category is mandatory")
    private Category category;

    @NotNull(message = "Start time is mandatory")
    private LocalDateTime startTime;

    @NotNull(message = "End time is mandatory")
    private LocalDateTime endTime;

    @NotBlank(message = "Source is mandatory")
    private String source;

    @NotBlank(message = "Destination is mandatory")
    private String destination;

    @NotBlank(message = "Station code is mandatory")
    private String stationCode;

    @NotNull(message = "Distance is mandatory")
    private Integer distance;

    @NotBlank(message = "Frequency is mandatory")
    private String frequency;

	public Railway(Long id, @NotBlank(message = "Name is mandatory") String name,
			@NotNull(message = "Category is mandatory") Category category,
			@NotNull(message = "Start time is mandatory") LocalDateTime startTime,
			@NotNull(message = "End time is mandatory") LocalDateTime endTime,
			@NotBlank(message = "Source is mandatory") String source,
			@NotBlank(message = "Destination is mandatory") String destination,
			@NotBlank(message = "Station code is mandatory") String stationCode,
			@NotNull(message = "Distance is mandatory") Integer distance,
			@NotBlank(message = "Frequency is mandatory") String frequency) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.startTime = startTime;
		this.endTime = endTime;
		this.source = source;
		this.destination = destination;
		this.stationCode = stationCode;
		this.distance = distance;
		this.frequency = frequency;
	}

    // Constructors, getters, and setters
    
    
    
    
}
