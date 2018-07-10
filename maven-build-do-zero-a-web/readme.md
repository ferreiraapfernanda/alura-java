# Maven: Build do zero a Web

``mvn archetype:generate -DartifactId=produtos -DgroupId=br.com.alura.maven -DinteractiveMode=false -DarchetypeArtifactId=maven-archetype-quickstart``

> **-DartifactId** Define o id nome do projeto

> **-DgroupId** Define o pacote

> **-DinteractiveMode** Desabilita o modo interativo na criação do projeto

> **-DarchetypeArtifactId** Define qual o projeto base para montar esse projeto

``mvn compile``

> Compila o projeto

``mvn teste``

> Roda as classes compiladas

``mvn clean``

> Limpa o projeto (diretório target)

`` mvn surefire-report:report``

> Gera o relatório utilizando o plugin

``mvn package``

> Empacota o projeto
> ``java -cp produtos-1.0-SNAPSHOT.jar br.com.alura.maven.App``