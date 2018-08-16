#Author: your.email@your.domain.com
# language: es

Característica: registros de empleados en OrangeHR

  @tag1
  Escenario: ingresa nuevo registro en OrangeHR
		Dado que Juan necesita crear un empleado en el OrangeHR
		Cuando el realiza el ingreso del registro en la aplicación
|firstName 	|MiddleName |lastName |Location 					|DateBirth 					|MaritalStatus 		|Gender 	|Nationality				| LicenseNumber	| LicenseExpiry				|NickName	|MilitaryService	|BloodGroup	|Hobbies	|
|Carlos			|Emilio			|Valderrama |German Regional HQ	|2000-08-01					|Married		 			|MALE			|Colombian					| 1234					| 2022-08-01		 			|ca123		|OK								|AB					|CYCLING	| 
		Entonces el visualiza el nuevo empleado en el aplicativo
|firstName 	|MiddleName |lastName |Location 					|DateBirth 					|MaritalStatus 		|Gender 	|Nationality				| LicenseNumber	| LicenseExpiry				|NickName	|MilitaryService	|BloodGroup	|Hobbies	|
|Carlos			|Emilio			|Valderrama |German Regional HQ	|2000-08-01					|Married		 			|MALE			|Colombian					| 1234					| 2022-08-01		 			|ca123		|OK								|AB					|CYCLING	| 
		