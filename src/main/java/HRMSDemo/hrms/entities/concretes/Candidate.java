package HRMSDemo.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
/* @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id") */
@Table(name="candidates")
@PrimaryKeyJoinColumn(name = "candidatesid")
public class Candidate extends User {
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_Identity")
	private String nationalityIdentity;
	
	
	@Column(name = "birth_of_year")
	private int  birthOfYear;
	
}
