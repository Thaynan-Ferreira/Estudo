<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Folha Salarial</title>
</head>
<body>
    
    <!-- A LINHA ABAIXO ADICIONA UM LOGO INTERATICO DA UNIVIÇOSA-->
    <a href="https://www.univicosa.com.br/" target="_blank">
        <img src="https://cdn.univicosa.com.br/img/logos/novo/univicosa_vertical.png" alt="" class="uni-logo">
    </a>

    <h3>Folha salarial</h3>
    <?php
        require_once 'Estagiario.php';
        require_once 'Vendedor.php';
        require_once 'Gerente.php';

        $e[0] = new Estagiario("Thales", "15", "1212", "5000", "50000");
        $v[0] = new Vendedor ("Arthur", "25", "1212", "45000", "50000");
        $g[0] = new Gerente ("Jorge", "38", "2500", "0", "50000");
        
        //print_r($e);
       // print_r($v);
       // print_r($g);
       // uma tabela é criada para exibir os valores inseridos nos arrays
        echo "<table>";
        echo "<thead><tr><td>Nome</td><td>Idade</td><td>Salario</td><td>Vendas</td><td>Total de Vendas</td><td>Cargo</td></tr></thead>";
        // o foreach irá percorrer o array, pegar os valores e montar cada linha da tabela.
        foreach ( $e as $key => $e )
        {
        echo "<tr><td>{$e -> getNome()}</td><td> {$e->getIdade()}</td><td> {$e->valorSalario()}</td>
        <td>{$e->getVendas()}</td><td> {$e->getTotalVendas()}</td><td> {$e->cargo()}</td></tr>";
        }

        foreach ( $v as $key => $v )
        {
        echo "<tr><td>{$v -> getNome()}</td><td> {$v->getIdade()}</td><td> {$v->valorSalario()}</td>
        <td>{$v->getVendas()}</td><td> {$v->getTotalVendas()}</td><td> {$v->cargo()}</td></tr>";
        }

        foreach ( $g as $key => $g )
        {
        echo "<tr><td>{$g -> getNome()}</td><td> {$g->getIdade()}</td><td> {$g->valorSalario()}</td>
        <td>{$g->getVendas()}</td><td> {$g->getTotalVendas()}</td><td> {$g->cargo()}</td></tr>";
        }
        // a tabela é fechada
        echo "</table>";
    ?>
</body>
</html>