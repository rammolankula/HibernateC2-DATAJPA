package hibernate.Datajpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(generator="abcd")
	//Here iam calling the Employeerunner to generate the unique key value using @GenericGenerator
	@GenericGenerator(name="abcd",strategy="hibernate.Datajpa.runner.Employeerunner")
	private String id;
	private String empName;
	private String empDepo;
		
	}

