# Desafio FluxIT
## Requisitos
##### BACK-END
  - Maven
  - Java 1.8
  - MySQL
##### FRONT-END
  - Node v9.8.0
  - Angular CLI: 1.7.3
  -Node: 9.8.0
### Installacion
Clonar el repo desafioFluxIT
Crear la base de datos fluxit
Modificar segun corresponda las credenciales del aplication.properties para acceder a la base de datos (por default usr y pass son root)
```sh
desafioFluxIT/candidatos-back/src/main/resources/application.properties
```
Una vez configurado, acceder por terminal a la carpeta candidatos-back
Lanzar el servidor
```sh
mvn clean spring-boot:run
```
Luego, acceder por terminal a la carpeta candidatos-webapp,
y lanzar el cliente web
```sh
$ npm install
$ ng serve
```
Acceder desde un browser a localhost:4200
