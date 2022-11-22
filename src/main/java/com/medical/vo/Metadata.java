package com.medical.vo;

import java.util.Random;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;   

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Metadata {
	
	boolean success;
	
	String outputId;
	
	String details;
	
	public Metadata(boolean success, String details) {
		this.success = success;
		this.details = details;
		this.outputId =  String.valueOf(new Random().nextLong());
	}
	
}
