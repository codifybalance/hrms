package HRMSDemo.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resume_experiences")
public class ResumeExperience {
		
		@JsonIgnore
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@JsonIgnore
		//@JsonProperty(access = Access.WRITE_ONLY)
		@ManyToOne()
		@JoinColumn(name="resume_id",referencedColumnName = "id")
		private Resume resume;
		
		@JsonIgnore
		@ManyToOne()
		@JoinColumn(name="name",referencedColumnName = "id")
		private JobPosition jobPosition;
		
		@Column(name="company_name")
		private String companyName;
		
		@Column(name="star_date")
		private int startedDate;
		
		@Column(name="end_date")
		private int endDate;
		
}
