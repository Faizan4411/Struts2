<%@ taglib uri="/struts-tags" prefix="s" %>  
<s:form action="registrationAction">  
	<s:textfield name="name" label="Enter Name: " />
	<s:textfield name="surname" label="Enter Surname: " />
	<s:textfield name="password" label="Enter Password: " />
	<s:textfield name="fatherName" label="Enter Father Name: " />
	<s:textfield name="brotherName" label="Enter Brother Name: " />
	<s:textfield name="address" label="Enter Address: " />
	<s:textfield name="email" label="Enter Email: " /> 
	<s:textfield name="city" label="Enter city: " />
	<s:textfield name="zip" label="Enter Zip: " />
	<s:textfield name="gender" label="Enter Gender: " />
        <s:textfield name="numberStr" label="Enter Number: " />
        <s:textfield name="cnic" label="Enter cnic: " />
	<s:submit value="save"></s:submit>  
</s:form>