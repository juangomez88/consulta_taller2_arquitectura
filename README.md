# consulta_taller2_arquitectura

[![CI/CD PipeLine](https://github.com/juangomez88/consulta_taller2_arquitectura/actions/workflows/build.yml/badge.svg)](https://github.com/juangomez88/consulta_taller2_arquitectura/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=bugs)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=juangomez88_consulta_taller2_arquitectura&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=juangomez88_consulta_taller2_arquitectura)

Implementation of a Simple App with the next operations:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check
  Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and
  Snyk
### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests
### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```
to download the node dependencies

### How to test it
Execute:
```shell
$ mvnw clean install
```
### How to get coverage test
Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
```