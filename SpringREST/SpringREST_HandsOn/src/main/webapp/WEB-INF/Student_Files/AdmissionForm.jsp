<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
  <body>
  <link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css" />
  
  <p>  <a href="/SpringMVCAnnotations/admissionFORM.html?siteTheme=green">Green</a> |
       <a href="/SpringMVCAnnotations/admissionFORM.html?siteTheme=red">Red</a>  </p>
  
  <a href="/SpringMVCAnnotations/admissionFORM.html?siteLanguage=english">English</a> |
  <a href="/SpringMVCAnnotations/admissionFORM.html?siteLanguage=french">French</a>
    <h1>${AdmissionSuccessMesssage}</h1>
    <h3> <spring:message code="label.admissionFORM" /></h3>
    
    <form:errors path="student1.*" />
    
    <form action="/SpringMVCAnnotations/submitAdmissionFORM.html" method="post">
      
      <table>
         <tr>
             <td><spring:message code="label.studentName" /></td>
             <td><input type="text" name="studentName" /></td>
         </tr>
         
         <tr>
             <td><spring:message code="label.studentHobby" /></td>
             <td><input type="text" name="studentHobby" /></td>
         </tr>
         
         <tr>
             <td><spring:message code="label.studentMobile" /></td>
             <td><input type="text" name="studentMobile" /></td>
         </tr>
         
         <tr>
             <td><spring:message code="label.studentDOB" /></td>
             <td><input type="text" name="studentDOB" /></td>
         </tr>
         
         <tr>
             <td><spring:message code="label.studentSkills" /></td>
             <td>
                <select name="studentSkills" multiple>
                   <option value="Java">JAVA Core</option>
                   <option value="Core">Spring Core</option>
                   <option value="MVC">Spring MVC</option>
                   <option value="Boot">Spring Boot</option>
                </select>
             </td>
         </tr>  
     </table>
      
     <table>
         <tr><td><spring:message code="label.studentAddress" /></td></tr>
         <tr>
             <td><spring:message code="label.country" /> <input type="text" name="studentAddress.country" /></td>
             <td><spring:message code="label.city" /> <input type="text" name="studentAddress.city" /></td>
             <td><spring:message code="label.street" /> <input type="text" name="studentAddress.street" /></td>
             <td><spring:message code="label.pincode" /> <input type="text" name="studentAddress.pincode" /></td>
         </tr>
         
         <tr>
             <td>
                <spring:message code="label.submitAdmissionFORM" var="labelSubmitAdmissionForm"></spring:message>
                <input type="submit" value="${labelSubmitAdmissionForm}" />
             </td>
         </tr> 
     </table>
    </form>
</body>
</html>