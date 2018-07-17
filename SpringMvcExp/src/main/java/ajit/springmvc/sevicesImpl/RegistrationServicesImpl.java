package ajit.springmvc.sevicesImpl;

import org.springframework.beans.factory.annotation.Autowired;

import ajit.springmvc.dao.RegistrationDao;
import ajit.springmvc.model.LoginDetails;
import ajit.springmvc.services.RegistrationServices;

public class RegistrationServicesImpl implements RegistrationServices {

	@Autowired
	private RegistrationDao registrationDao;
	
	@Override
	public void registerUser(LoginDetails loginDetails) {
		registrationDao.registerUser(loginDetails);
	}
}
