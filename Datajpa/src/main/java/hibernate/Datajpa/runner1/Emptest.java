package hibernate.Datajpa.runner1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import hibernate.Datajpa.model.Employee;
import hibernate.Datajpa.repo.Emprepo;

@Component
public class Emptest implements CommandLineRunner {

	@Autowired
	Emprepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Employee emp=new Employee();
		emp.setEmpDepo("nahBJ");
		emp.setEmpName("hc");
		String id=repo.save(emp).getId();
		System.out.println("emp id saved with"+id);
		
	}

}
