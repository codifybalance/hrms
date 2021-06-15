package HRMSDemo.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "employees")
@AllArgsConstructor
@NoArgsConstructor

public class Employee extends User{

	/*
	 * @Id
	 * 
	 * @GeneratedValue(strategy = GenerationType.IDENTITY)
	 * 
	 * @Column(name="user_id") private int id;
	 */
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="job_id")
	private int jobId;
}
