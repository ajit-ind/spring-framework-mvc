package ajit.springmvc.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ajit.springmvc.model.LoginDetails;
import ajit.springmvc.services.RegistrationServices;

@Controller
public class RegistrationControllers extends BaseController {

	@Autowired
	RegistrationServices registrationServices;
	
	@RequestMapping(value=SHOW_REGISTRATION, method=RequestMethod.GET)
	public ModelAndView showRegistrationPage(HttpServletRequest request,
							HttpServletResponse response, HttpSession session, Map<String, Object> model) {
		ModelAndView modelAndView = new ModelAndView(SHOW_REGISTRATION_PAGE);
		model.put("registration", new LoginDetails());
		return modelAndView;
	}
	
	@RequestMapping(value=PROCESS_REGISTRATION, method=RequestMethod.POST)
	public ModelAndView processRegistration(HttpServletRequest request, HttpServletResponse response,
									@ModelAttribute("registration") LoginDetails loginDetails) {
		ModelAndView modelAndView = new ModelAndView(REGISTRATION_SUCCESS_PAGE);
		registrationServices.registerUser(loginDetails);
		return modelAndView;
	}
}
