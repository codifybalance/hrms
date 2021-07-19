package HRMSDemo.hrms.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resumes")
public class Resume {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne(targetEntity = Candidate.class)
	@JoinColumn(name = "candidate_id", referencedColumnName = "id")
	private Candidate candidate;

	@Column(name = "about")
	private String about;

	@Column(name = "created_date")
	private int createdDate;

	@Column(name = "updated_date")
	private int updatedDate;

	@Column(name = "is_active")
	private boolean isActive = true;
	
	@Column(name="resume_name")
	private String resumeName;

	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")//, cascade = CascadeType.ALL
	private List<ResumeLanguage> languages;

	@OneToMany(mappedBy = "resume")
	private List<ResumeEducation> educations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<ResumeExperience> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<ResumeCoverLetter> coverLetters;
		
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<ResumeLink> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume")
	private List<ResumeSkill> skills;
}
