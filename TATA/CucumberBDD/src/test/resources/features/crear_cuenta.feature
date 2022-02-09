#Author: santiago.gomezbedoya@tcs.com

  #language:en

Feature: Yo como usuario deseo crear una cuenta a traves de un formulario en advantage

  @CreacionExitosa
  Scenario: Creacion de cuenta exitosa
    Given el usuario se encuentra en la pagina del formulario
    And y se logueo
    When el usuario ingresa toda su informacion correctamente
    Then vera el mensaje bienvenido

  @CampoEmail
  Scenario: Validacion campo email
    Given el usuario se encuentra en la pagina del formulario
    When el usuario ingresa toda su informacion excepto el campo email
    Then vera el mensaje del campo email

  @BotonRegistrar
  Scenario: Validacion de boton registrar
    Given el usuario se encuentra en la pagina del formulario
    When el usuario ingresa el username Santiago y el email santiago@gmail.com
    And el salario 2358564
    And ingresa los demas datos
      | santiago |
      | Kate     |
      | Camila   |
      | Julian   |
      | Andres   |
    And ingresa los demas datos con otra lista
      | username | email              | password | confirmPassword | code |
      | Santiago | santiago@gmail.com | 121255   | 121255          | 1235 |
      | Julian   | julian@gmail.com   | 026216   | 8853            | 4535 |
      | Julian   | julian@gmail.com   | 026216   | 8853            | 4535 |
      | Julian   | julian@gmail.com   | 026216   | 8853            | 4535 |
      | Julian   | julian@gmail.com   | 026216   | 8853            | 4535 |


    Then vera el mensaje bienvenidos

