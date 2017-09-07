<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
  <title>Transactions</title>
</head>

<body>

<h1>
    <a href="exit.html"> Exit! </a><br>
    <a href="index.html"> Go to "Clients" </a><br>
    <a href="bankaccaunt.html"> Go to "BankAccounts" </a>
    <h1><p> Manager of transactions: </p></h1></h1>
<form id="transactions" action="tr/add" method="GET">
    <p>Trans time:<input type="text" placeholder="time" name="time"></p>
    <p>Client Id:<input type="text" placeholder="clientId" name="clientId"></p>
    <p>From account Id:<input type="text" placeholder="fromAccountId" name="fromAccountId"></p>
    <p>To account Id:<input type="text" placeholder="toAccountId" name="toAccountId"></p>
    <p>Amount of money:<input type="text" placeholder="amount" name="amount"></p>
    <button type="submit">SAVE</button>
</form>
<h1><p>Transactions:</p></h1>
<table>
    <thead>
    <td>Transaction Id:</td>
    <td>Trans time:</td>
    <td>Client Id:</td>
    <td>From account Id:</td>
    <td>To account Id:</td>
    <td>Amount of money:</td>
    </th>
    </thead>
    <tbody>
    <tr>
        <td>transactionId</td>
        <td>time</td>
        <td>clientId</td>
        <td>fromAccountId</td>
        <td>toAccountId</td>
        <td>amount</td>
    </tr>
    </tbody>
</table>

</body>

</html>