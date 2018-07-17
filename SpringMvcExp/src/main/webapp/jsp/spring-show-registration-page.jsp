<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link href="css/style.css" rel="stylesheet" type="text/css" />	
	<title>Registration</title>
</head>
<body>
	<form:form id="regForm" modelAttribute="registration" action="processRegistration" method="post">
		<div class="mainDiv">
			<div>
				<fieldset class="textAlingMent">
					<label>First Name</label>
					<form:input path="firstName" id="firstName"/>
				</fieldset>
				<fieldset>
					<label>Last Name</label>
					<form:input path="lastName" id="lastName"/>
				</fieldset>
				<fieldset>
					<label>User Name</label>
					<form:input path="userName" id="userName"/>
				</fieldset>
				<fieldset>
					<label>Password</label>
					<form:input path="password" id="password" type="password"/>
				</fieldset>
				<fieldset>
					<label>Security Key</label>
					<form:input path="securityKey" id="securityKey" type="password"/>
				</fieldset>
				<fieldset>
					<label>Security Question</label>
					<form:input path="securityQuestion" id="securityQuestion"/>
				</fieldset>
				<fieldset>
					<label>Security Answer</label>
					<form:input path="securityAnswer" id="securityAnswer" type="password"/>
				</fieldset>
				<fieldset>
					<label>User Type</label>
					<form:select path="userType" id="userType">
						<form:option value="">..:Select:..</form:option>
						<form:option value="ADMIN_USER">Admin User</form:option>
					</form:select>
				</fieldset>
			</div>
		</div>
	</form:form>
</body>
</html>