package kodlamaio.hrmsDemo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Employees" )
@AllArgsConstructor
@NoArgsConstructor


public class UserEmployee extends User{
	
	@Id
	@GeneratedValue
	@Column(name = "employeeId")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "nationalityId")
	private String nationalityId;
	
	@Column(name = "yearOfBirth")
	private String yearOfBirth;
	
	
	
}
