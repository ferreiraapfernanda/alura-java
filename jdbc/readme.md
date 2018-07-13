# Java e JDBC: Trabalhando com um banco de dados

## Aula 01

Baixamos o driver do HSQLDB no site, e copiamos pro projeto e adicionamos ao build path.
No console, fazemos a criação do nosso banco:

``java -cp hsqldb.jar org.hsqldb.server.Server --database.0 file:loja-virtual --dbname.0 loja-virtual``

Em outro console, iremos chamar o gerenciador, para executarmos nossa query de criação da tabela e inserção de alguns dados:

``java -cp hsqldb.jar  org.hsqldb.util.DatabaseManager``

## Aula 05 

- **ConnectionPool!** :heart: