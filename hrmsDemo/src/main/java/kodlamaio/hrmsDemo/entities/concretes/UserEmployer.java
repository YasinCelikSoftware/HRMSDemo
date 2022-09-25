package kodlamaio.hrmsDemo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Employers")
@AllArgsConstructor
@NoArgsConstructor

public class UserEmployer extends User {
	@Id
	@GeneratedValue
	
	@Column(name = "employerId")
	private int id;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "website")
	private String website;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
}
