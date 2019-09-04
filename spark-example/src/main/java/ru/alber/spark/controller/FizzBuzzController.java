package ru.alber.spark.controller;

import spark.Route;
import spark.Request;
import spark.Response;

public class FizzBuzzController {

	public static Route fizzBuzz = (Request req, Response res) -> {	
		try {
			int i = Integer.parseInt(req.params(":number"));
			
			if (i % 5 == 0 && i % 3 == 0)
				return "FizzBuzz";
			else if (i % 5 == 0)
				return "Fizz";
			else if (i % 3 == 0)
				return "Buzz";
			else
				return i;
		} catch (NumberFormatException e) {
			return "Неверное значение, введите целое число";
		}
	};

}
