package com.jeku.bindings;

import lombok.Data;

@Data
public class PassengerInfo {
	private String name;
	private Long phno;
	private String jdate;
	private String from;
	private String to;
	private Integer trainNum;
}
