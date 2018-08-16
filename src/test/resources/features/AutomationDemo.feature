#language: es
Característica: ingresar datos al formulario de automation demo

  @tag1
  Escenario: ingresar datos al formulario
    Dado que Carlos quiere acceder a la Web Automation Demo Site
    Cuando el realiza el registro en la pagina
    |fullName 	|lastName |address 				|emailAddress 			|phone 				|languages 	|skills| country	| selectCountry	 |dateOfBirthYear	|dateOfBirthMonth	|dateOfBirthDay	|password|confirmPassword	|
    |Carlos			|Apellido |Calle 29 N12  	|capellido@mail.com	|0571234545 	|Spanish		|XML	| Colombia	| Denmark				 |1990						|January					|25							|Pass123+|Pass123+				|
    Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row
