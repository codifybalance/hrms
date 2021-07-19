package HRMSDemo.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@Table(name="job_advertisement")
@PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert{

	/*
	 * @Column(name="job_id") 
	 * private int jobPosition; //iş pozisyonu
	 */	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="job_id")
	private int jobId;
    
    @Column(name="ad_name")
	private String adName;
    
	@Column(name="job_description")
	private String jobDescription; //iş tanımı
	
	@Column(name="city")
	private String city;
	
	@Column(name="salary")
	private String salary;  //maaş
	
	@Column(name="number_of_open_positions")
	private int numberOfOpenPositions; //açıkpozisyon
	
	@Column(name="application_deadline")
	private String applicationDeadline;  //son başvuru günü
	
	@Column(name="is_active")
	private boolean isActive;
	
	@ManyToOne()
	@JoinColumn(name="id")
	private JobPosition jobPosition;
	
	
	@ManyToOne()
	@JoinColumn(name = "employer_id") // employerId -> employer_id
	private Employer employer;
	

	


}
