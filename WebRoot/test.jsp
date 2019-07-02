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

<input type="text" name="sname" value="王兴刚">
<input type="text" name="snumber" value="110">


<input type="submit" name="next" value="添加" formaction="<%=path%>/addStudent.html"><br>
<input type="submit" name="next" value="查询" formaction="<%=path%>/queryStudent.html"><br>
<input type="submit" name="next" value="删除" formaction="<%=path%>/delByIdStudent.html"><br>
<input type="submit" name="next" value="删除一批" formaction="<%=path%>/delStudent.html"><br>
<input type="submit" name="next" value="查一个" formaction="<%=path%>/findByIdStudent.html"><br>
<input type="submit" name="next" value="修改" formaction="<%=path%>/modifyStudent.html"><br>
<input type="submit" name="next" value="不知道" formaction="<%=path%>/noName.html"><br>

</form>
</body>
</html>