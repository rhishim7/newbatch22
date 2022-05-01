package com.zensar.realtionships;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataMappingRelationshipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataMappingRelationshipsApplication.class, args);
	}
/*
 * [{
	"empName":"Khuso",
	"empAge":24,
	"address":
		[{
			"city":"Pune",
			"addressType":"Current"
		},
		{
			"city":"Kop",
			"addressType":"Permanent"
		}]
},
{
	"empName":"Naraen",
	"empAge":19,
	"address":
		[{
			"city":"Kop",
			"addressType":"Permenant"
		},
		{
			"city":"Sangli",
			"addressType":"Temporary"
		}]
}]
*/
}
