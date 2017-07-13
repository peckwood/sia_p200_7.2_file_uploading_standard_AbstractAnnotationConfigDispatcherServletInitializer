<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Register</h1>
    <form method="POST" enctype="multipart/form-data">
      First Name: <input type="text" name="firstName" value="raiden" /><br/>
      Profile Picture1: <input type="file" name="profilePicture1"
      	accept="image/jpeg, image/png, image/gif" /><br/>
      Profile Picture2: <input type="file" name="profilePicture2"
      	accept="image/jpeg, image/png, image/gif" /><br/>
      <input type="submit" value="Register" />
    </form>
  </body>
</html>
