package com.nt.moidel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Rest_ ACTOR")

public class Actor {
	@Id
	@GeneratedValue
	private Integer actorid;
	private String actorname;
	private String catageroy;
	private long mobileno;

}
