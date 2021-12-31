package co.com.sofka.stepdefinition;

import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.PracticeFormPage;
import co.com.sofka.runner.PracticeFormTestCucumber;
import co.com.sofka.setup.WebUI;
import co.com.sofka.util.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;
import java.util.List;


public class PracticeFormTestCucumberStepDefinition extends WebUI{
    private static final Logger LOGGER = Logger.getLogger(PracticeFormTestCucumber.class);
    private PracticeFormPage practiceFormPage;
    private PracticeFormModel viajeida;
    private PracticeFormModel viajeidavuelta;
    private static final String ASSETION_EXCEPTION_MESSAGE = "Los valores suministrados no son los esperados: %s";
    //Background

    @Given("que el cliente se encuentra en la pagina web de vuelos.com")
    public void que_el_cliente_se_encuentra_en_la_pagina_web_de_vuelos_com() {
        try{
            generalSetup();
            LOGGER.info("Configuración del driver lista.");
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(),exception);
        }

    }

    //scenario 1

    @When("el cliente ingresa los campos obligatorios con destino de ida y oprime buscar.")
    public void el_cliente_ingresa_los_campos_obligatorios_con_destino_de_ida_y_oprime_buscar() {
        try{
            generarviajeida();
            practiceFormPage = new PracticeFormPage(viajeida, super.driver) ;
            practiceFormPage.fillVueloIdaFields();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(),exception);
        }
    }

    @Then("el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida para comprar.")
    public void el_sistema_debera_mostrar_por_pantalla_los_diferentes_precios_del_vueldo_de_ida_para_comprar() {
        try{
           Assertions.assertEquals(
                    expectedOutcomeForMandatoryFields1().toString(),
                    practiceFormPage.isRegistrationDone().toString(),
                    String.format(ASSETION_EXCEPTION_MESSAGE, messageForMandatoryFields())
            );

            LOGGER.info("Comparacion completa");
            quiteDriver();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(),exception);
        }
    }
    //scenario 2
    @When("el cliente ingresa los campos obligatorios con destino de ida y vuelta y oprime buscar.")
    public void el_cliente_ingresa_los_campos_obligatorios_con_destino_de_ida_y_vuelta_y_oprime_buscar() {

        try{
            generarviajeidavuelta();
            practiceFormPage = new PracticeFormPage(viajeidavuelta, super.driver) ;
            practiceFormPage.fillVueloIdaVueltaFields();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(),exception);
        }

    }

    @Then("el sistema debera mostrar por pantalla los diferentes precios del vueldo de ida y vuelta para comprar.")
    public void el_sistema_debera_mostrar_por_pantalla_los_diferentes_precios_del_vueldo_de_ida_y_vuelta_para_comprar()  {

        try{
            Assertions.assertEquals(
                    expectedOutcomeForMandatoryFields2().toString(),
                    practiceFormPage.isRegistrationDone2().toString(),
                    String.format(ASSETION_EXCEPTION_MESSAGE, messageForMandatoryFields2())
            );

            LOGGER.info("Comparacion completa");

            Assertions.assertEquals(
                    practiceFormPage.finalPrice1().toString(),
                    practiceFormPage.finalPrice2().toString(),
                    String.format(ASSETION_EXCEPTION_MESSAGE, messageForPrices())
            );
            LOGGER.info("Comparacion completa");
            quiteDriver();
        } catch (Exception exception){
            quiteDriver();
            Assertions.fail(exception.getMessage(), exception);
            LOGGER.warn(exception.getMessage(),exception);
        }

    }
    private void generarviajeida(){
        viajeida = new PracticeFormModel();
        viajeida.setCiudadOrigen(" Bogotá, Bogotá D.C., Colombia");
        viajeida.setCiudadDestino(" Medellín, Antioquia, Colombia");
        viajeida.setDiaPartida(15);
        viajeida.setMesPartida("01");
        viajeida.setMeses(Meses.ENERO);
        viajeida.setAnoPartida(2022);
        viajeida.setClase(Clase.ECONOMICA);
        viajeida.setBancos(Bancos.BANCOLOMBIA);
        viajeida.setNombrePersona1("Juan");
        viajeida.setApellidoPersona1("Ramirez");
        viajeida.setTipoDocumentoPersonaNatural(TipoDocumentoPersonaNatural.CEDULA_CIUDADANIA);
        viajeida.setCedulaPersona1("123456789101");
        viajeida.setNombrePersona2("Marcos");
        viajeida.setApellidoPersona2("Martinez");
        viajeida.setCedulaPersona2("11105479856");
        viajeida.setGender(Gender.MASCULINO);
        viajeida.setDiaNacido("12");
        viajeida.setMesNacido("5");
        viajeida.setAnoNacido("1994");
        viajeida.setEstados(Estados.BOGOTA);
        viajeida.setCiudades(Ciudades.BOGOTA);
        viajeida.setDireccionAdulto("Int 5 apto 404 Conjunto Grande");
        viajeida.setPaisesOrigen(PaisesOrigen.COLOMBIA);
        viajeida.setEmail("juan.perez@gmail.com");
        viajeida.setTipoTelefono("Celular");
        viajeida.setAreaTelefono("60");
        viajeida.setNumeroTelefono("3112587412");

    }

    private void generarviajeidavuelta(){
        viajeidavuelta = new PracticeFormModel();
        viajeidavuelta.setCiudadOrigen(" Cali, Valle del Cauca, Colombia");
        viajeidavuelta.setCiudadDestino(" Medellín, Antioquia, Colombia");
        viajeidavuelta.setDiaPartida(10);
        viajeidavuelta.setMesPartida("02");
        viajeidavuelta.setMeses(Meses.FEBRERO);
        viajeidavuelta.setAnoPartida(2022);
        viajeidavuelta.setVueltaDia(24);
        viajeidavuelta.setVueltaMes("02");
        viajeidavuelta.setMeses2(Meses2.FEBRERO);
        viajeidavuelta.setVueltaAno(2022);
        viajeidavuelta.setBancos(Bancos.BBVA);
        viajeidavuelta.setNombrePersona1("Maria");
        viajeidavuelta.setApellidoPersona1("Ramirez");
        viajeidavuelta.setTipoDocumentoPersonaNatural(TipoDocumentoPersonaNatural.CEDULA_CIUDADANIA);
        viajeidavuelta.setCedulaPersona1("123456789101");
        viajeidavuelta.setGender(Gender.FEMENINO);
        viajeidavuelta.setDiaNacido("12");
        viajeidavuelta.setMesNacido("12");
        viajeidavuelta.setAnoNacido("1994");
        viajeidavuelta.setEstados(Estados.ANTIOQUIA);
        viajeidavuelta.setCiudades(Ciudades.MEDELLIN);
        viajeidavuelta.setDireccionAdulto("Int 6 apto 401 Conjunto pequeño");
        viajeidavuelta.setPaisesOrigen(PaisesOrigen.COLOMBIA);
        viajeidavuelta.setEmail("maria.ramirez@gmail.com");
        viajeidavuelta.setTipoTelefono("Celular");
        viajeidavuelta.setAreaTelefono("60");
        viajeidavuelta.setNumeroTelefono("3112587418");

    }


    public List<String> expectedOutcomeForMandatoryFields1(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(viajeida.getNombrePersona1());
        submitedFormResult.add(viajeida.getApellidoPersona1());
        submitedFormResult.add(viajeida.getCedulaPersona1());
        submitedFormResult.add(viajeida.getNombrePersona2());
        submitedFormResult.add(viajeida.getApellidoPersona2());
        submitedFormResult.add(viajeida.getCedulaPersona2());
        submitedFormResult.add(viajeida.getDiaPartida()-1+ viajeida.getMeses().getValue()+viajeida.getAnoPartida());
        return submitedFormResult;
    }

    public List<String> expectedOutcomeForMandatoryFields2(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(viajeidavuelta.getNombrePersona1());
        submitedFormResult.add(viajeidavuelta.getApellidoPersona1());
        submitedFormResult.add(viajeidavuelta.getCedulaPersona1());
        submitedFormResult.add(viajeidavuelta.getDiaPartida()-1+ viajeidavuelta.getMeses().getValue()+viajeidavuelta.getAnoPartida());
        submitedFormResult.add(viajeidavuelta.getVueltaDia()-1+ viajeidavuelta.getMeses2().getValue()+viajeidavuelta.getVueltaAno());
        return submitedFormResult;
    }




    private String messageForMandatoryFields(){
        return "\n" + practiceFormPage.isRegistrationDone().toString() + "\n\r" + expectedOutcomeForMandatoryFields1().toString();
    }

    private String messageForMandatoryFields2(){
        return "\n" + practiceFormPage.isRegistrationDone2().toString() + "\n\r" + expectedOutcomeForMandatoryFields2().toString();
    }

    private String messageForPrices() {
        return "\n" + practiceFormPage.finalPrice1().toString() + "\n\r" + practiceFormPage.finalPrice2().toString();
    }



}
