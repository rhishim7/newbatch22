package com.zensar.stockapplication.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Automatically Creates all the Getters,Setters,ArgsConstructors,
@NoArgsConstructor // Creates a default constructor
@AllArgsConstructor //Creates all arguments constructor
//swagger@ApiModel("Stock Response Model") //Changes the model name in swagger ui
@Entity //Maps the class with the table in the database.
//@NamedQuery(name = "Stock.findByStockName", query="FROM Stock s WHERE s.name=?1")
//@NamedQuery(name = "Stock.findByStockName", query="FROM Stock s WHERE s.name=?1 and s.price=?2")
public class Stock {
	
	//swagger@ApiModelProperty("This is stockId integer") //Adds description for every property in model section
	@Id //Entity requires a primary key so @Id is a primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stock_id")
	private long stockId;
	private String stockName;
	private String marketName;
	private double stockPrice;
	// one2one creates a foreign key column with company_company_id
	@OneToOne(cascade = CascadeType.ALL)
	// custom foreign key column name
	//@JoinColumn(name = "fk_company_id") 
	private Company company;
}
