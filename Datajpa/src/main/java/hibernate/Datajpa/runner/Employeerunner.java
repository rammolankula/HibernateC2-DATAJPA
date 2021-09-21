package hibernate.Datajpa.runner;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.stereotype.Component;
@Component
public class Employeerunner implements IdentifierGenerator{

	
	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		//This is the prefix of the name for generating the name along with the Random Id
		String prefix="RamiT";
		//This is Date format for generating the date month and year along with Random Id
		String Date=new SimpleDateFormat("DDMMMYY").format(new Date(System.currentTimeMillis()));
	
	 // This is the Random method for generating random key value for getting 
	 //  int Random=Math.abs(new Random().nextInt(99878));
		
	//Random universal unique identification string it generates hexadecima number as a random number
	String Random =UUID.randomUUID().toString().replaceAll("-","").substring(1, 10);
	return prefix+"/"+Date+"/"+Random;
	}

}
