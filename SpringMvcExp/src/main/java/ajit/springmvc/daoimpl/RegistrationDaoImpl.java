package ajit.springmvc.daoimpl;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import ajit.springmvc.dao.RegistrationDao;
import ajit.springmvc.model.LoginDetails;

public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	DataSource datasource;	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void registerUser(LoginDetails loginDetails)  {
		String query = "INSERT INTO LOGIN_DETAILS VALUES(?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(query, new Object[] {loginDetails.getUserName(),
				loginDetails.getLoginMode(), loginDetails.getPassword(), loginDetails.getSecurityKey(),
				loginDetails.getSequrityQuestion(), loginDetails.getSecurityAnswer(), loginDetails.userType,
				loginDetails.getFirstName(), loginDetails.getLastName()});
	}
}
