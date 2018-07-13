# Java e JPA: Persista seus objetos com a JPA2 e Hibernate

## Aula 01

- Download do Hibernate
- Adiciona os JARs required para o projeto (pasta lib > add to build path)
- Criamos a nossa classe, que será interpretada como uma tabela através das anotaçẽos do javax.persistence
- Adicionamos o nosso persistence.xml no projeto. Nesse arquivo precisamos listas as nossas classes, para que o Hibernate consiga interpretar como uma entidade

## Aula 03

- Estado Transient -> a classe ainda não foi gerenciada pelo JPA, ou seja, ele não foi persistido ainda, então suas informaçẽos são perdidas em caso de erro antes da persistễncia.

- Estado Managed -> os status do objeto são sincronizados com o banco. SOMENTE até o fechamento do entitymanager.

- Estado Detached -> após o fechamento do entitymanager, o objeto não é mais sincronizado com o banco

- Estado Removed -> de managed para removed