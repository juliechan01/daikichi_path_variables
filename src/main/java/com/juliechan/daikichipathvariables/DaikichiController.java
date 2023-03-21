package com.juliechan.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	// WELCOME
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	// TODAY YOU WILL FIND LUCK...
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	// TOMORROW, AN OPPORTUNITY
	@RequestMapping("/tomorrow")
	public String tom() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	// PATH VARIBALE ROUTE 1 - INSPIRATIONAL QUOTES
	@RequestMapping("/quote/{num}")
	public String inspire(@PathVariable("num")Integer num) {
		if(num % 2 == 0) {
			return "Experience is not what happens to you. It is what you do with what happens to you.";			
		}
		else {
			return "The process of scientific discovery is, in effect, a continual flight from wonder.";
		}
	}
	
	// PATH VARIABLE ROUTE 2 - GIBBERISH CAUSE I RAN OUT OF IDEAS
	@RequestMapping("/{random}")
	public String random(@PathVariable("random")String random) {
		return "You're so silly! What does this: " + random + " mean?";
	}
	
	// GET REQ FOR KYOTO OR ANY CITY
	@RequestMapping("/travel/{city}")
	public String city(@PathVariable("city")String city) {
		return "Congratulations! You will soon travel to " + city + ". Accomodations have been booked.";
	}
	
	// GET REQ FOR LOTTO
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num")Integer num) {
		if(num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family & friends.";
		}
	}
}
