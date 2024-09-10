package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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

@Entity
public class Book {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long bid;

@ManyToOne
@JoinColumn(name= "author_id")
private Author author;
private String title;
private double price;
private int quantity;
private LocalDate publishedAt;


}
