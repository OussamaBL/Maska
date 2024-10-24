<%@ page import="java.util.List" %>
<%@ page import="org.example.Model.Member" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Membre List</title>
  <!-- Include Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
  <h2 class="mb-4">Membre List</h2>
  <table class="table table-bordered">
    <thead class="thead-light">
    <tr>
      <th>ID</th>
      <th>Numéro d'Adhésion</th>
      <th>Nom</th>
      <th>Prénom</th>
      <th>Pièce d'Identification</th>
      <th>Nationalité</th>
      <th>Date d'Adhésion</th>
      <th>Date d'Expiration de Licence</th>
      <th>Actions</th>
    </tr>
    </thead>
    <tbody>

      <%
          List<Member> listMembers= (List<Member>) request.getAttribute("listMembers");
          for (Member member: listMembers) { %>
            <td><%= member.getId() %></td>
            <td><%= member.getMembership_number() %></td>
            <td><%= member.getFirst_name() %></td>
            <td><%= member.getLast_name() %></td>
            <td><%= member.getIdentification_document() %></td>
            <td><%= member.getNationality() %></td>
            <td><%= member.getMembership_date() %></td>
            <td><%= member.getLicense_expiration_date() %></td>
            <td class="d-flex justify-content-center align-items-center w-100">
              <a href="${pageContext.request.contextPath}/membres/edit/<%=member.getId()%>" class="btn btn-warning btn-sm me-5">Edit</a>
              <form action="${pageContext.request.contextPath}/delete" method="post">
                <input type="hidden" name="id" value="<%=member.getId()%>" />
                <input type="submit" value="Delete" class="btn btn-danger btn-sm" />
              </form>
            </td>
          <% } %>

    </tbody>
  </table>

  <a href="${pageContext.request.contextPath}/save" class="btn btn-primary">Add Membre</a>
</div>

<!-- Include Bootstrap JS (Optional) -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
