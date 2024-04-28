<!DOCTYPE html>
<html>
<head>
  <title>Display Info</title>
</head>
<body>
<h1>Input Data</h1>
<p>Name: <%= session.getAttribute("name") %></p>
<p>Surname: <%= session.getAttribute("surname") %></p>
<p>Email: <%= session.getAttribute("email") %></p>
<p>Address: <%= session.getAttribute("address") %></p>
</body>
</html>
