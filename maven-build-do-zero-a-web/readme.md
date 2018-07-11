# Maven: Build do zero a Web

## Comandos Maven

``mvn archetype:generate -DartifactId=produtos -DgroupId=br.com.alura.maven -DinteractiveMode=false -DarchetypeArtifactId=maven-archetype-quickstart``

> **-DartifactId** Define o id nome do projeto
>
> **-DgroupId** Define o pacote
>
> **-DinteractiveMode** Desabilita o modo interativo na criação do projeto
>
> **-DarchetypeArtifactId** Define qual o projeto base para montar esse projeto

``mvn compile``

> Compila o projeto

``mvn teste``

> Roda as classes compiladas

``mvn clean``

> Limpa o projeto (diretório target)

``mvn surefire-report:report``

> Gera o relatório utilizando o plugin

``mvn package``

> Empacota o projeto
> ``java -cp produtos-1.0-SNAPSHOT.jar br.com.alura.maven.App``

``mvn versions:use-latest-versions``

> Atualiza as dependências para as últimas verões. Não é tão recomendado pela compatibilidade.

``mvn versions:display-dependency-updates``

> Dependências que possuem versões novas


## Ciclo do Build do Maven <https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html>

- validate
- compile
- test
- package
- integration-test
- verify
- install
- deploy

Sempre faz as fases anteriores.

## Plugin PMD

Plugin que gera um relatório que analise o código para encontrar falhas, como variáveis não utilizadas. Seu relatório fica sobre a pasta target/site

``mvn pmd:pmd``

## Plugin JaCoCo

``mvn jacoco prepare-agent``

``mvn jacoco report``

## Eclipse

No eclipse, é possível indicar os goals que deseja executar, é só ir em "Run As" > "Maven build...". Indique um nome para esse configuração e quais goals deseja executar.