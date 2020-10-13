<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Add Employee</title>
</head>
<body>
<div id="addItem">
    <form action="addNewEmployee.do" method="post">
        <label>Enter Employee Id</label><input type="text" name="empId" /><br>
        <label>Enter Employee Name</label><input type="text" name="name" /><br>
        <label>Enter Employee Designation</label><input type="text" name="designation" />
        <br>
        <label>Enter Employee Salary</label><input type="text" name="salary" />
        <br>
        <input type="submit" value="Add"/>
    </form>
</div>
</body>
</html>

