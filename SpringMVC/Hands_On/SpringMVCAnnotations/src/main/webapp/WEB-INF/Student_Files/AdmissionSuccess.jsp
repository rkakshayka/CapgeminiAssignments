<html>
  <body>
    <h1>${AdmissionSuccessMesssage}</h1>
    <h2>Details Submitted by You </h2>
    
    <table>
       <tr>
           <td>Student Name :</td>
           <td>${student1.studentName}</td>           
       </tr>
       
       <tr>
           <td>Student Hobby :</td>
           <td>${student1.studentHobby}</td>           
       </tr>
       
       <tr>
           <td>Student Mobile :</td>
           <td>${student1.studentMobile}</td>           
       </tr>
       
       <tr>
           <td>Student DOB :</td>
           <td>${student1.studentDOB}</td>           
       </tr>
       
       <tr>
           <td>Student Skills :</td>
           <td>${student1.studentSkills}</td>           
       </tr>
       
       <tr>
          <td>country: ${student1.studentAddress.country}
                 city: ${student1.studentAddress.city}
               street: ${student1.studentAddress.street}
              pincode: ${student1.studentAddress.pincode}</td>
       </tr>
    </table>
    
    <h3>Congratulations!! College has processed the Application form Successfully</h3>
  </body>
</html>