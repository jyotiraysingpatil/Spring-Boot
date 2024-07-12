package com.app.Entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import com.app.Enum.Company;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@ToString
@NoArgsConstructor

@Setter
@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	
	@NotBlank(message = "plzz add vehicle name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	private Company company;
	
	@NotBlank(message = "plzz add vehicle number")
	private String vNo;
	
	@NotBlank(message = "plzz enter vehicle type")
	private String Vtype;
	
	private LocalDate date;
	
	
	private String time;

	public Vehicle(Long id, @NotBlank(message = "plzz add vehicle name") String name, Company company,
			@NotBlank(message = "plzz add vehicle number") String vNo,
			@NotBlank(message = "plzz enter vehicle type") String vtype, LocalDate date,
		 String time) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.vNo = vNo;
		Vtype = vtype;
		this.date = date;
		this.time = time;
	}

	
	
	
	
	
	
	
}
