package HRMSDemo.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;*/
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import HRMSDemo.hrms.core.entities.User;
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
@PrimaryKeyJoinColumn(name = "id")
public class Candidate extends User {
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_Identity")
	private String nationalityIdentity;
	
	
	@Column(name = "birth_of_year")
	private int  birthOfYear;
	
	@OneToMany(mappedBy = "candidate")
	private List<Resume> resume;
		
}
