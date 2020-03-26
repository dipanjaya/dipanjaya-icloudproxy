<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tweets of India Today</title>


<script type="text/javascript">
        function load()
        {
        setTimeout("window.open(self.location, '_self');", 300000);
        }
</script>
<!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    <style>
    	body{
    		background: url(${bgAdd});
    		background-size: cover;
    		background-repeat: no-repeat;
    	}
        .constantDiv{
        width: 60%;
        height: 100px;
        background-color:white;
        border: 2px solid black;
        margin-left:auto;
        margin-right: auto;
        border-radius: 3px;
        
        }
        .innerDiv{
        display: inline-block;
        }
        
        .square{
        width: 5px;
        height: 5px;
        background-color: red;
        }

    </style>
</head>
<body onload="load()">
<h1 class="mt-5 mb-4" style="text-align: center;color: white;"><img src="https://i.ibb.co/0jX76qL/3-Ft-QQHy-A-400x400.jpg" alt="3-Ft-QQHy-A-400x400" style="width: 100px; border-radius:100%;">
India Today Tweets - "${date}"</h1>
        <div class="constantDiv">
        	<div class="innerDiv">
        		<div>
        		<marquee behavior="scroll" scrollamount="12" onmouseover="this.stop()" onmouseout="this.start()">
        		<c:forEach items="${newsBeans}" var="newsBean">
        		 <a href="${newsBean.url}" style="text-decoration: none; color:black;">
        		<p style="display:inline-block; font-weight: bold; font-size:20px; line-height: 100px;"><span class="square">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;${newsBean.text}</p>&nbsp; &nbsp;
        		</c:forEach>
        		</marquee>
        		</div>
        	</div>
        </div>
        
        
        
	
</body>
</html>