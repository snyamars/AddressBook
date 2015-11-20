<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Address Book</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:16px;padding:10px 5px 5px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#000;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:16px;font-weight:normal;padding:10px 5px 5px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#fff;background-color:#000080;}
		.tg .tg-4eph{background-color:#f9f9f9}
		.ts  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.ts td{font-family:Arial, sans-serif;font-size:16px;padding:10px 5px 5px 5px;overflow:hidden;word-break:normal;color:#000;}
		.ts th{font-family:Arial, sans-serif;font-size:16px;font-weight:normal;padding:10px 5px 5px 5px;overflow:hidden;word-break:normal;color:#000;background-color:#fff;}
		.ts .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body style="background-color:#E6E6FA">
<h1 align="center">
	Address Book
</h1>
<hr>
<h2 align="center">
	Add Address
</h2>
<c:url var="addAction" value="/address/add" ></c:url>
<div align="center">
<form:form action="${addAction}" commandName="address">
<form:hidden path="id" />
<table class="ts">
	<!--<c:if test="${!empty address.firstname}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>-->
	<tr>
		<td>
			<form:label path="firstname">
				<spring:message text="First Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="firstname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="lastname">
				<spring:message text="Last Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="lastname" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="surname">
				<spring:message text="Surname"/>
			</form:label>
		</td>
		<td>
			<form:input path="surname" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="addressline1">
				<spring:message text="Address Line 1"/>
			</form:label>
		</td>
		<td>
			<form:input path="addressline1" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="addressline2">
				<spring:message text="Address Line 2"/>
			</form:label>
		</td>
		<td>
			<form:input path="addressline2" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="city">
				<spring:message text="City"/>
			</form:label>
		</td>
		<td>
			<form:input path="city" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="state">
				<spring:message text="State"/>
			</form:label>
		</td>
		<td>
			<form:input path="state" />
		</td>
	</tr>
	<tr>
		<td>
			<form:label path="country">
				<spring:message text="Country"/>
			</form:label>
		</td>
		<td>
			<form:input path="country" />
		</td>
	</tr>					
	<tr>
		<td>
			<form:label path="phonenumber">
				<spring:message text="Phone Number"/>
			</form:label>
		</td>
		<td>
			<form:input path="phonenumber" />
		</td>
	</tr>	
	<!-- <tr>
		<td colspan="2">
			<c:if test="${!empty address.firstname}">
				<input type="submit"
					value="<spring:message text="Edit Address"/>" />
			</c:if>
			<c:if test="${empty address.firstname}">
				<input type="submit"
					value="<spring:message text="Add Address"/>" />
			</c:if>
		</td>
	</tr> -->
</table><br>	
<c:if test="${!empty address.firstname}">
	<input type="submit"
		value="<spring:message text="Update Address"/>" />
</c:if>		
<c:if test="${empty address.firstname}">
	<input type="submit"
		value="<spring:message text="Save Address"/>" />
</c:if>					
</form:form>
</div>
<br>
<h3 align="center">List Of Addresses</h3>
<c:if test="${!empty listAddress}">
	<table class="tg" align="center">
	<tr>
		<!-- <th width="80">Address ID</th> -->
		<th width="120">Surname</th>
		<th width="120">First Name</th>
		<th width="120">Last Name</th>
		<th width="120">Address Line 1</th>
		<th width="120">Address Line 2</th>
		<th width="120">City</th>		
		<th width="120">State</th>
		<th width="120">Country</th>
		<th width="120">Phone Number</th>		
		<th width="60">Operate</th>
	</tr>
	<c:forEach items="${listAddress}" var="address">
		<tr>
			<td>${address.surname}</td>
			<td>${address.firstname}</td>
			<td>${address.lastname}</td>
			<td>${address.addressline1}</td>
			<td>${address.addressline2}</td>
			<td>${address.city}</td>
			<td>${address.state}</td>
			<td>${address.country}</td>
			<td>${address.phonenumber}</td>		
			<td><a href="<c:url value='/edit/${address.id}' />" >Edit</a>/
			<a href="<c:url value='/remove/${address.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
