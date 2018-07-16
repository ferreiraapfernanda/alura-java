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

## Blog Caelum: Entidades Managed, Transient e Detached no Hibernate e JPA

<http://blog.caelum.com.br/entidades-managed-transient-e-detached-no-hibernate-e-jpa/>

- Transient: objeto não tem representação no banco de dados e nem o EntityManager o conhece

- Managed: objeto existe no banco de dados e o EntityManager em questão possui uma referência para ele (após o persist, ou com o método find do entitymanager). Qualquer mudança resultará em uma atualização no banco no momento do commit

- Detached: objeto possivelmente está no banco de dados, mas o EntityManager o desconhece (Quando pegamos esse objeto com find mas já fechamos o entitymanager, ele se torna detached, pois suas alterações não serão mais gerenciadas).

- Removed: quando a entidade está marcada para remoção

Para fazer alterar o estado de **detached** para **managed** podemos fazer um **merge**.
Para alterar o estado de **transient** para **managed** podemos fazer um **persist**
Para alterar o estado de **managed** para **detached** podemos fechar entitymanager.
