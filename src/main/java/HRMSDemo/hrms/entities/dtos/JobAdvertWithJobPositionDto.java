package HRMSDemo.hrms.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class JobAdvertWithJobPositionDto {
private int id;
private String name;
private String jobDescription;
private int employerId;
	
}
