package com.app.Dto;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDto {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long bid;
	
	private Long aid;
	private String title;
	private double price;
	private int quantity;
	private LocalDate publishedAt;
}
