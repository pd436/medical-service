package com.medical.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@JsonInclude(Include.NON_NULL)
public class ResponseWrapper<T> implements Serializable{

	
	private static final long serialVersionUID = -7822353241919097819L;

	Metadata metadata;
	
	private T data;
	
	public ResponseWrapper(Metadata metadata,T data) {
		this.metadata = metadata;
		this.data = data;
	}

}
