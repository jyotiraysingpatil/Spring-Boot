package com.app.Entities;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Railway {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	
	private String source;
	
	private String destination;
	
	private LocalTime startTime;
	
	private LocalTime endTime;
	
	private String stationCode;
	
	private int distance;
	private String frequency;
	
	private float fees;

	public Railway(Long id, @NotBlank String name, String source, String destination, LocalTime startTime,
			LocalTime endTime, String stationCode, int distance, String frequency, float fees) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.startTime = startTime;
		this.endTime = endTime;
		this.stationCode = stationCode;
		this.distance = distance;
		this.frequency = frequency;
		this.fees = fees;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}
	
	
	
	
	
	
		
	
	
	
	@Override
	public String toString() {
		return "Railway [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", stationCode=" + stationCode + ", distance="
				+ distance + ", frequency=" + frequency + ", fees=" + fees + "]";
	}

	public Railway() {}
	
	
}
