package HRMSDemo.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "employers")
@Data

public class Employer extends User{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int id;
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	

}
