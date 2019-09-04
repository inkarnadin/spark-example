package ru.alber.spark;

import static spark.Spark.*;

import ru.alber.spark.controller.FizzBuzzController;

public class SparkExample {
	
	public static void main(String[] args) {		
		port(8090);		
		get("/fizzBuzz/:number", FizzBuzzController.fizzBuzz);
	}
    
}
