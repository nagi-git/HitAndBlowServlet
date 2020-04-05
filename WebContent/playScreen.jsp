<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Insert title here</title>
</head>
<body>
	<h2>ヒット＆ブロー</h2>
	<form action="./play" method="post">
		<div class="form-group row">
			<label class="col-2 col-form-lebel">答え</label>
			<div class="col-10">
				<input type="text" class="form-control" name="inputAnswer">
			</div>
			<div class="offset-2 col-10">
				<button type="submit" class="btn btn-primary">登録</button>
			</div>
		</div>
	</form>
	<table class="table table-striped table-bordered">
		<tr>
			<th class="text-center">回数</th>
			<th class="text-center">入力値</th>
			<th class="text-center">HIT</th>
			<th class="text-center">BLOW</th>
		</tr>
		<tr>
			<td class="text-center">回目</td>
			<td class="text-center">1234</td>
			<td class="text-center">2</td>
			<td class="text-center">1</td>
		</tr>
		<tr>
			<td class="text-center">回目</td>
			<td class="text-center">1234</td>
			<td class="text-center">2</td>
			<td class="text-center">1</td>
		</tr>
	</table>
</body>
</html>