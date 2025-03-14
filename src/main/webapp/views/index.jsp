<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p><font color="green" >${msg}</font> </p>
<form:form  action="save" modelAttribute="student" method="post">
    <table>
    <!-- Name field -->
       <tr>
          <td class="form-lable">Name</td>
          <td><form:input path="name" class="form-input"/> </td>
       </tr>
    
    <!-- Email field -->
       <tr>
          <td class="form-lable">Email</td>
          <td><form:input path="email" class="form-input"/> </td>
       </tr>
       
       <!-- Gender field -->
       <tr>
          <td class="form-lable">Gender</td>
          <td><form:radiobutton path="gender" value="Male" /> Male</td>
          <td><form:radiobutton path="gender" value="Female" /> Female</td>
       </tr>
       
       <!-- Course field -->
       <tr>
          <td class="form-lable">Course</td>
          <td>
          <form:select path="course" >
           <form:options items="${courses }"/>
          </form:select>
          </td>
       </tr>
       
       <!-- Course field -->
       <tr>
          <td class="form-lable">Timings</td>
          <td>
          <form:checkboxes items="${timings }" path="timings"/>
          </td>
       </tr>
       
       <!-- Submit Button -->
       <tr>
         <td>
         <form:button type="submit" >Submit</form:button>
         </td>
       </tr>
       
       
    </table>

</form:form>

</body>
</html>