package com.rail.exception;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class RailwayException extends RuntimeException{

	public RailwayException(String msg) {
		super(msg);
	}
}
