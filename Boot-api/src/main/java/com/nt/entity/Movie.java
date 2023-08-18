package com.nt.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Nonnull
	private Integer mid;
	@Column(length=20)
	private String mname;
	private String year;
	private float rating;
	 {
		// TODO Auto-generated method stub
		
	}
	public void setRating(float f) {
		// TODO Auto-generated method stub
		
	}
	public Integer getmid() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
