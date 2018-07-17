package ajit.springmvc.model;

public class LoginDetails {

	public Long userId;
	public String userName;
	public Long loginMode;
	public String password;
	public String securityKey;
	public String sequrityQuestion;
	public String securityAnswer;
	public String userType;
	public String firstName;
	public String lastName;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getLoginMode() {
		return loginMode;
	}
	public void setLoginMode(Long loginMode) {
		this.loginMode = loginMode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurityKey() {
		return securityKey;
	}
	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}
	public String getSequrityQuestion() {
		return sequrityQuestion;
	}
	public void setSequrityQuestion(String sequrityQuestion) {
		this.sequrityQuestion = sequrityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
