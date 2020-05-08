<%-- 
    Document   : NewRemote
    Created on : 8 May 2020, 06:30:40
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    <h1>new remote</h1>
	</head>
    <body>
		
		
		
      <select name="NumberOfButtons">
<?php for($button=1; $button<=10; $button++){
"<option value=".$button.">".$button."</option>";
}
?>
	  </select> 
            <input type="submit" name="submitButtons" value="buttonsNumber" />

			
  
	<c:forEach var="item" items="${MasterRemote.keyName}">
    <option value="${item}"><c:out value="${item}" /></option>
</c:forEach>
  </select> 
  
	
	</body>
</html>
