<%@ page language="java" pageEncoding="GBK"%>
<%@ taglib uri="http://org.wangxg/jsp/extl" prefix="e" %>
<%String path=request.getContextPath(); %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<e:message/>
<br>
<br>
<form action="#" method="post">

<input type="text" name="sname" value="���˸�">
<input type="text" name="snumber" value="110">


<input type="submit" name="next" value="���" formaction="<%=path%>/addStudent.html"><br>
<input type="submit" name="next" value="��ѯ" formaction="<%=path%>/queryStudent.html"><br>
<input type="submit" name="next" value="ɾ��" formaction="<%=path%>/delByIdStudent.html"><br>
<input type="submit" name="next" value="ɾ��һ��" formaction="<%=path%>/delStudent.html"><br>
<input type="submit" name="next" value="��һ��" formaction="<%=path%>/findByIdStudent.html"><br>
<input type="submit" name="next" value="�޸�" formaction="<%=path%>/modifyStudent.html"><br>
<input type="submit" name="next" value="��֪��" formaction="<%=path%>/noName.html"><br>

</form>
</body>
</html>