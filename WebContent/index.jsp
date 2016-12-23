<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

   <script type='text/javascript' src='dwr/interface/userManager.js'></script> 
   <script type='text/javascript' src='dwr/engine.js'></script> 
   <script type='text/javascript' src='dwr/util.js'></script>
   <script type="text/javascript">
	   function callBackfindExistedUser(data){ 
		   var userExistedMessage = $("userExistedMessage"); 
		   if (data == 1) 
		   userExistedMessage.style.display = "block"; 
		   else 
		   userExistedMessage.style.display = "none"; 
	   } 

	   function findExistedUser(){ 
		   var name = DWRUtil.getValue("name"); 
		   if (name != "") 
		   userManager.findExistedUser(name,callBackfindExistedUser); 
	   }
   </script>
</head>
<body>
	hello world!
</body>
</html>