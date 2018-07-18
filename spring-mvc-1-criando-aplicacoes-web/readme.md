# Spring MVC I

## Aula 01

- Download do Jboss Forge para o SO
- Na pasta forge/bin executar o ./forge
- Criar um projeto:
    ``project-new --named casadocodigo``
- Importar o projeto ao Eclipse (na pasta bin do forge)
- Tomcat para servidor
- No pom, adicionar as dependencias do Spring MVC
- Criação do HomeController, adicionando as anotações de controller, e o mapeamento da URL. Iremos renornas o nome da view que usaremos.
- Criação de um Servlet para as requisições do servidor (extende de ServletInitializer). No método getServletMappings, retornar a URL padrão de mapeamento. No método getServletConfigClasses, retorna uma classe de AppWebConfiguration, que será nossa classe de configuração pro projeto
- Nessa classe, faremos as anotações de habilitação do MVC Web, e indicaremos também quais classes serão base para nosso controle. Criaremos uma Bean (anotação @Bean) onde iremos indicar a resolução interna de views pela aplicação (indicaremos a pasta - prefixo - e a extensão - sufixo)
- Nossas views ficarão na pasta ``src/main/webapp/WEB-INF/views``