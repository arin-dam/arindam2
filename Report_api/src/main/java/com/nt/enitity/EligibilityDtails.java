package com.nt.enitity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity

@Data
public class EligibilityDtails {
	private Integer eligid;
	private String name;
	private long mobile;
	private String email;

}
