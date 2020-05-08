<%-- 
    Document   : DisplayMasterRemote
    Created on : 8 May 2020, 07:59:17
    Author     : michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
	<h1>master remote display</h1>
</head>
<body>

	<table>
		<tr>
			<th align="left">id </th>
			<th align="left">name </th>
		</tr>
		<c:forEach items="${MasterRemoteList}" var="item">                
			<tr>
				<td>${item.keyId}</td>
				<td>${item.keyName}</td>	
			</tr> 
		</c:forEach>
	</table>
</body>
</html>
