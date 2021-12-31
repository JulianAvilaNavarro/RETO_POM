Feature: Checkeo precios vuelos
  Como cliente
  necesito conocer los precios de los vuelos a diferentes destinos
  con el fin de programar mi viaje

  Background:
    Given que el cliente se encuentra en la pagina web de vuelos.com

  @regresion
  Scenario: Checkeo precios vuelo de solo ida
    When el cliente ingresa los campos obligatorios con destino de ida y oprime buscar.
    Then el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida.

  @ignore
  Scenario: Checkeo precios vuelo de solo ida y vuelta
    When el cliente ingresa los campos obligatorios con destino de ida y vuelta y oprime buscar.
    Then el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida y vuelta.