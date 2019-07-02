<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
<script src="https://code.jquery.com/jquery-3.4.1.js" integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU=" crossorigin="anonymous"></script>
</head>
<body>
   <form>
        <input id="nome" name="nome" type="text" placeholder="Nome">
        <input id="cargo" name="cargo" type="text" placeholder="Cargo">
        <button type="button" id="pesquisar">Pesquisar</button>   
    </form>
    <h2>Cadastro de Usuários</h2>
    <table border="-1">
        <tr>
            <th>Nome</th>
            <th>Cargo</th>
            <th>Telefone</th>
        </tr>
        <c:forEach var="usuario" items="${usuarios}">
        <tbody>
	         <tr>
		        <td>${usuario.nome}</td>
		        <td>${usuario.cargo}</td>
		        <td>${usuario.telefone}</td>
	        </tr>
        </tbody>
        </c:forEach>
    </table>
</body>
<script type="text/javascript">
$("#pesquisar").click(function(){ 
	$.ajax({
	    type: 'GET',
	    url: 'http://localhost:8080/usuario/listar?nome='+$("#nome").val()+'&cargo='+$("#cargo").val(),		    
	    success: function(data){		      
	      console.log(data);
	    }	
	});
});
</script>

</html>