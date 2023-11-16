package com.jeku.rest;

import com.jeku.response.TicketInfo;
import com.jeku.request.PassengerInfo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirIndiaRestController {
	
	@PostMapping("/bookFlightTicket")
	public  ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo pinfo)
	{
		TicketInfo ticket = new TicketInfo();
		ticket.setName(pinfo.getFname()+ ""+pinfo.getLname());
		ticket.setFrom(pinfo.getFrom());
		ticket.setTo(pinfo.getTo());
		ticket.setTicketStatus("CONFIRMED");
		ticket.setTicketPrice("5000.00");
		ticket.setJourneyDate(pinfo.getJourneyDate());

		return new ResponseEntity<>(ticket, HttpStatus.CREATED);

	}

}
