<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <title>Anmeldeformular - Kennenlerntagaufgabe</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
  <script src="http://code.jquery.com/jquery-2.1.3.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
<h1>${formName}</h1>
<form action="checkPerson" modelAttribute="person" method="POST">
  <div class="form-group">
    <label for="exampleInputLastname">Nachname</label>
    <input type="text" name="lastName" class="form-control" path="lastName" id="exampleInputLastname" placeholder="Nachname">
  </div>
  <div class="form-group">
    <label for="exampleInputFirstname">Vorname</label>
    <input type="text" name="firstName" path="firstName" class="form-control" id="exampleInputFirstname" placeholder="Vorname">
  </div>
  <div class="form-group">
    <label for="exampleInputFirstname">Age</label>
    <input type="text" name="age" path="age" class="form-control" id="exampleInputAge" placeholder="Age">
  </div>
  <div>
  <c:if test="${not empty error}">
    <font color="red">Error: ${error}</font>
  </c:if>
  </div>
  <button type="submit" class="btn btn-default" value="Save">Anmelden!</button>
</form>
</div>
</body>
</html>
