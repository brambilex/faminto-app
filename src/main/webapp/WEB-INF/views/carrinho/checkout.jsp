<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/webjars/bootstrap/4.1.3/css/bootstrap.min.css"
        rel="stylesheet">
</head>
<body>
<div>
<form action="/pedido/criar" method="POST">

  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nome</label>
      <input type="text" class="form-control" id="inputEmail4" placeholder="name" name="nome">
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Data de Nadcimento</label>
      <input type="date" class="form-control" id="inputPassword4" name="dataNascimento">
    </div>
  </div>
  <div class="form-group">
    <label for="inputAddress">Endereço</label>
    <input type="text" class="form-control" id="inputAddress" placeholder="Digite seu endereço" name="endereço">
  </div>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputCity">Cidade</label>
      <input type="text" class="form-control" id="inputCity" placeholder="Blumenau" name="cidade">
    </div>
    <div class="form-group col-md-4">
      <label for="inputState">Estado</label>
      <select id="inputState" class="form-control" name="estado">
        <option>Santa Catarina</option>
      </select>
    </div>
    <div class="form-group col-md-2">
      <label for="inputZip">Cep</label>
      <input type="number" class="form-control" id="inputZip" name="cep">
    </div>
  </div>
    <div class="form-group col-md-4">
      <label for="inputpag">Forma de Pagamento</label>
      <select id="inputpag" class="form-control" name="metodoPagamento">
        <option value="DINHEIRO"> Cartão Mastercard</option>
        <option value="CARTAO_CREDITO">Dinheiro</option>
        <option value="VALE_REFEICAO">Vale Refeição</option>
      </select>
    </div>
  <button type="submit" class="btn btn-primary">Confirmar</button>
</form>


</div>
<table class="table">

  <thead>  
    <tr>
      <th scope="col">Ação</th>
      <th scope="col">Nome</th>
      <th scope="col">Descrição</th>
      <th scope="col">Preço</th>
    </tr>
  </thead>
  <tbody>
	  <c:forEach items="${ produtos }" var="produto" varStatus="status">
	    <tr id="linha_${status.index }">
	      <td><button onclick="removerItem(${produto.id}, ${status.index })"
	      type="button" class="btn btn-danger">X</button>
	      </td>
	      <td>${ produto.nome }</td>
	      <td>${ produto.descricao }</td>
	      <td>R$ ${ produto.preco }</td>
	    </tr>
	  </c:forEach>
  </tbody>
</table>
<script> 
	function removerItem(idProduto, index) {
		$.post('/carrinho/remove', {'idProduto': idProduto}, function(){
			$('#linha_'+ index).hide();
		});
	}
</script>

<script src="/webjars/jquery/3.3.1-1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>