package hibernate.Datajpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hibernate.Datajpa.model.Employee;

@Repository
public interface Emprepo extends JpaRepository<Employee,String> {

}
