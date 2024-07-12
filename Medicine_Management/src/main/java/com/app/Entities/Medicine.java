package com.app.Entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.app.Enum.Type;


@Entity
public class Medicine {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotBlank(message = "add name")
private String name;
@Enumerated(EnumType.STRING)
private Type type;
@NotNull
private LocalDate startDate;
@NotNull
private LocalDate endDate;
@NotNull
private LocalTime mfgtime;
@NotNull
private LocalTime expTime;



public Medicine(Long id, @NotBlank(message = "add name") String name, Type type, @NotNull LocalDate startDate,
		@NotNull LocalDate endDate, @NotNull LocalTime mfgtime, @NotNull LocalTime expTime) {
	super();
	this.id = id;
	this.name = name;
	this.type = type;
	this.startDate = startDate;
	this.endDate = endDate;
	this.mfgtime = mfgtime;
	this.expTime = expTime;
}



@Override
public String toString() {
	return "Medicine [id=" + id + ", name=" + name + ", type=" + type + ", startDate=" + startDate + ", endDate="
			+ endDate + ", mfgtime=" + mfgtime + ", expTime=" + expTime + "]";
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



public Type getType() {
	return type;
}



public void setType(Type type) {
	this.type = type;
}



public LocalDate getStartDate() {
	return startDate;
}



public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}



public LocalDate getEndDate() {
	return endDate;
}



public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}



public LocalTime getMfgtime() {
	return mfgtime;
}



public void setMfgtime(LocalTime mfgtime) {
	this.mfgtime = mfgtime;
}



public LocalTime getExpTime() {
	return expTime;
}



public void setExpTime(LocalTime expTime) {
	this.expTime = expTime;
}



public Medicine() {}





}