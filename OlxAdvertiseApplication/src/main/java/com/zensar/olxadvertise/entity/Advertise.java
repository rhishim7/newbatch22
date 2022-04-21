package com.zensar.olxadvertise.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advertise {
	private int advertiseId;
	private String advertiseTitle;
	private String advertisePrice;
	private String advertiseCategory;
	private String advertiseDescription;
	private String userName;
	private String createdDate;
	private String modifiedDate;
	private String status;
}
