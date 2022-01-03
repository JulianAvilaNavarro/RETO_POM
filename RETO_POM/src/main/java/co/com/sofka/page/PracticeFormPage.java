package co.com.sofka.page;
import co.com.sofka.model.PracticeFormModel;
import co.com.sofka.page.common.CommonActionOnpages;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;
import org.openqa.selenium.By;


public class PracticeFormPage extends CommonActionOnpages{
    public static Log log= LogFactory.getLog(ResolverUtil.Test.class);

    private final PracticeFormModel practiceFormModel;
    private WebDriver webDriver;
    private final By vueloIda= By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[2]/label");
    private final By vueloIdaVuleta= By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[1]/div/span[1]/label");
    private final By ciudadOrigen = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
    private final By ciudadDestino = By.cssSelector("input[placeholder='Ingresa hacia dónde viajas']");
    private final By date = By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/input");
    private final By date2 =By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[2]/div/div[2]/div/div/div/div/input");
    private final By flechaCambioFecha = By.id("ico-arrow-right");
    private final By locatorPersonasBox=By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[4]/div/div/div/div/input");
    private final By adultos = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[1]/div[2]/div/button[2]");
    private final By menores = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[1]/div[2]/div[2]/div/button[2]");
    private final By edadMenores=By.cssSelector("#component-modals > div.sbox5-floating-tooltip.sbox5-floating-tooltip-opened > div > div > div.stepper__distribution_container > div:nth-child(3) > div.select__row__options__container > div > div > select");
    private final By clase = By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[2]/div[2]/div/div/div/select");
    private final By buttonAplicar= By.xpath("//*[@id=\"component-modals\"]/div[3]/div/div/div[3]/a");
    private final By buttonBuscar= By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[3]/button");
    private final  By locatorCiudadOrigen= By.xpath("/html/body/div[4]/div/div/ul/li");

    private final  By locatorCiudadDestino= By.xpath("/html/body/div[4]/div/div[1]/ul/li");
    private final By locatorScrollAuxiliar=By.xpath("/html/body/div[3]");
    private final By locatorForwaitNextPage=By.xpath("//*[@id=\"searchbox\"]/div/div/div/div[3]/div[2]/div[4]/div/a");
    private final By locatorComprar=By.xpath("//a[@tooltip-component='buy-button-tooltip']");

    private final By equipajeLoadingLocator = By.className("-white");
    private final By equipajePageLocator = By.className("-show-modal");

    private final By locatorContinuarButton=By.xpath("//*[@id=\"upselling-popup-position\"]/upselling-popup/div/div[3]/div/div/button");

    private final By locatorMetodoPagoOption=By.xpath("//span[text()='PSE']");
    private final By locatorBancoOption=By.xpath("//*[@id=\"card-selector-0\"]");
    private final By locatorPersonaNatural=By.xpath("//*[@id=\"invoice-fiscal-status-0\"]/div/div/ul/li[1]/label/span");
    private final By locatorNombrePersonaNatural=By.xpath("//*[@id=\"invoice-first-name-0\"]");
    private final By locatorApellidoPersonaNatural=By.xpath("//*[@id=\"invoice-last-name-0\"]");
    private final By locatorTipoDocumentoPersonaNatural=By.xpath("//*[@id=\"invoice-fiscal-identification-type-0\"]");
    private final By locatorNumeroIDPersonaNatural=By.xpath("//*[@id=\"invoice-fiscal-identification-number-0\"]");
    private final By locatorOptionEstado=By.xpath("//*[@id=\"invoice-fiscal-address-state-0\"]");
    private final By locatorCiudadEstado=By.xpath("//*[@id=\"invoice-fiscal-address-city-CASH_TRANSFER_BOG-0\"]");
    private final By locatorAuxiliarCiudad=By.xpath("//*[@id=\"ui-id-1\"]");
    private final By locatorDireccionPersonaNatural=By.xpath("//input[starts-with(@class,'input-tag invoice-fiscal-address-street')]");
    private final By locatorNombreAdulto=By.xpath("//input[starts-with(@class,'input-tag traveler-first-name ng-untouched ng-pristine ng-invalid')]");
    private final By locatorApellidoAdulto=By.xpath("//input[starts-with(@class,'input-tag traveler-last-name ng-untouched ng-pristine ng-invalid')]");
    private final By locatorPaisAdulto=By.xpath("//select[starts-with(@class,'select-tag traveler-nationality ng-untouched ng-pristine ng-valid')]");
    private final By locatorTipoIDAdulto=By.xpath("//select[starts-with(@class,'select-tag traveler-identification-type ng-untouched ng-pristine ng-valid')]");
    private final By locatorIDAdulto=By.xpath("//input[starts-with(@class,'input-tag traveler-identification-number ng-untouched ng-pristine ng-invalid')]");

    private final By locatorDiaNacido = By.id("traveler-birthday-day-0");
    private final By locatorMesNacido = By.id("traveler-birthday-month-0");
    private final By locatorAnoNacido = By.id("traveler-birthday-year-0");
    private final By locatorDiaNacido2 = By.id("traveler-birthday-day-1");
    private final By locatorMesNacido2 = By.id("traveler-birthday-month-1");
    private final By locatorAnoNacido2 = By.id("traveler-birthday-year-1");
    private final By locatorFemenino = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[1]/traveler/div/div[2]/div/div[3]/compound-radio-component/div/div/div/ul/li[1]/label/span");
    private final By locatorFemenino2=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[3]/compound-radio-component/div/div/div/ul/li[1]/label/span");
    private final By locatorMasculino = By.xpath("//em[text()='Masculino']");
    private final By locatorMasculino2 = By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/travelers-container/travelers/old-travelers/div/ul/li/ul/li[2]/traveler/div/div[2]/div/div[3]/compound-radio-component/div/div/div/ul/li[2]/label/span");
    private final By locatorEmail=By.xpath("//input[starts-with(@class,'input-tag ng-untouched ng-pristine ng-invalid')]");

    private final By locatorTipoTelefono=By.xpath("//select[starts-with(@class,'select-tag ng-untouched ng-pristine ng-valid')]");
    private final By locatorAreaNumero=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone-container/contact-phone/div/div/phones/ul/li/phone/div/div[2]/div[1]/input-component-new/div/div/input");
    private final By locatorNumeroTelefono=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone-container/contact-phone/div/div/phones/ul/li/phone/div/div[2]/div[2]/input-component-new/div/div/input");
    private final By locatorMantenerInformado=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/contact-phone-container/contact-phone/div/div/div/ol/li/checkbox-component-new/span/span/label/span");
    private final By locatorAceptarTerminos=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/agreement-component/div/ol/li/terms-checkbox-component/checkbox-component/span/label/span");

    //for validation
    private final By locatorAssertionNombrePersona1=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li[1]/div[1]/span");
    private final By locatorAssertionApellidoPersona1=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li[1]/div[2]/span");
    private final By locatorAssertionCedulaPersona1=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li[1]/div[3]/span");
    private final By locatorAssertionNombrePersona2=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li[2]/div[1]/span");
    private final By locatorAssertionApellidoPersona2=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li[2]/div[2]/span");
    private final By locatorAssertionCedulaPersona2=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/form-data-revision-container/form-data-revision/div/ul/li[2]/div[3]/span");
    private final By locatorAssertionValorFinal1=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[1]/buy-component/div/div/div/div[1]/div/money/div/span[3]");
    private final By locatorAssertionValorFinal2=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[2]/pricebox/sticky/div/div/pricebox-content/div/div/div[2]/money/div/span[3]");
    private final By locatorAssertionFechaIda=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[2]/div/purchase-detail-component/div/products-detail-component-v2/div/div/flight-info-v2/div/product-dates-v2/div/div/div[2]");
    private final By locatorAssertionFechaVuelta=By.xpath("/html/body/div[2]/div/div/app/checkout-form/div/form-component/form/div[2]/div/purchase-detail-component/div/products-detail-component-v2/div/div/flight-info-v2/div[2]/product-dates-v2/div/div/div[2]");



    //Constructor
    public PracticeFormPage(PracticeFormModel practiceFormModel, WebDriver webDriver) {
        super(webDriver);
        this.practiceFormModel = practiceFormModel;

    }

    public void fillVueloIdaFields() throws InterruptedException {
        explicitWaitTime(vueloIda);
        click(vueloIda);
        click(ciudadOrigen);
        clearText(ciudadOrigen);
        typeInto(ciudadOrigen, practiceFormModel.getCiudadOrigen());
        explicitWaitTime(locatorCiudadOrigen);
        click(locatorCiudadOrigen);
        pressEnter(ciudadOrigen);

        explicitWaitTime(ciudadDestino);
        click(ciudadDestino);
        clearText(ciudadDestino);
        typeInto(ciudadDestino, practiceFormModel.getCiudadDestino());

        try{
            explicitWaitTime(locatorCiudadDestino);
            click(locatorCiudadDestino);
        }catch(Exception e){ click(ciudadDestino);
            log.info("Se detecto bug en el campo ciudad de destino");
            clearText(ciudadDestino);
            typeInto(ciudadDestino, practiceFormModel.getCiudadDestino());
            click(locatorCiudadDestino);
        }


        pressEnter(ciudadDestino);


        click(date);
        scrollTo(locatorScrollAuxiliar);

        var dayToGoLocator =By.cssSelector("div[data-month='"+practiceFormModel.getAnoPartida()+"-"+practiceFormModel.getMesPartida()+"'] .sbox5-monthgrid-datenumber:nth-child("+practiceFormModel.getDiaPartida()+")");
        click(date);
        scrollTo(locatorScrollAuxiliar);
        for(Integer i=0 ; i<Integer.parseInt(practiceFormModel.getMesPartida())-1 ; i++){
            click(flechaCambioFecha);
        }
        click(dayToGoLocator);
        click(locatorPersonasBox);
        explicitWaitTime(adultos);
        click(adultos);


        click(clase);
        typeInto(clase, practiceFormModel.getClase().getValue());
        click(buttonAplicar);
        click(buttonBuscar);

        explicitWaitTime(locatorForwaitNextPage);

        scrollTo(locatorForwaitNextPage);


        explicitWaitTime(locatorComprar);
        click(locatorComprar);
        waitUntilInvisibility(equipajeLoadingLocator);

        if (isElementPresent(equipajePageLocator)) {
            waitToBeClickable(locatorContinuarButton);
            click(locatorContinuarButton);
        }else{
            log.info("El viaje no requiere equipaje");
        }

        waitToBeClickable(locatorMetodoPagoOption);
        scrollTo(locatorMetodoPagoOption);
        click(locatorMetodoPagoOption);


        explicitWaitTime(locatorBancoOption);
        click(locatorBancoOption);
        typeInto(locatorBancoOption, practiceFormModel.getBancos().getValue());
        pressEnter(locatorBancoOption);

        click(locatorPersonaNatural);
        scrollTo(locatorNombrePersonaNatural);
        click(locatorNombrePersonaNatural);
        typeInto(locatorNombrePersonaNatural, practiceFormModel.getNombrePersona1());
        pressEnter(locatorNombrePersonaNatural);

        click(locatorApellidoPersonaNatural);
        typeInto(locatorApellidoPersonaNatural, practiceFormModel.getApellidoPersona1());
        pressEnter(locatorApellidoPersonaNatural);

        click(locatorTipoDocumentoPersonaNatural);
        typeInto(locatorTipoDocumentoPersonaNatural, practiceFormModel.getTipoDocumentoPersonaNatural().getValue());
        pressEnter(locatorTipoDocumentoPersonaNatural);

        click(locatorNumeroIDPersonaNatural);
        clearText(locatorNumeroIDPersonaNatural);
        typeInto(locatorNumeroIDPersonaNatural, practiceFormModel.getCedulaPersona1());
        pressEnter(locatorNumeroIDPersonaNatural);

        click(locatorOptionEstado);
        typeInto(locatorOptionEstado, practiceFormModel.getEstados().getValue());
        pressEnter(locatorOptionEstado);

        scrollTo(locatorCiudadEstado);
        clearText(locatorCiudadEstado);
        typeInto(locatorCiudadEstado, practiceFormModel.getCiudades().getValue());


        explicitWaitTime(locatorAuxiliarCiudad);
        click(locatorAuxiliarCiudad);



        explicitWaitTime(locatorDireccionPersonaNatural);
        scrollTo(locatorDireccionPersonaNatural);
        typeInto(locatorDireccionPersonaNatural, practiceFormModel.getDireccionAdulto());
        tab(locatorDireccionPersonaNatural);

        //persona 1
        scrollTo(locatorNombreAdulto);

        typeInto(locatorNombreAdulto, practiceFormModel.getNombrePersona1());

        scrollTo(locatorApellidoAdulto);

        typeInto(locatorApellidoAdulto, practiceFormModel.getApellidoPersona1());

        scrollTo(locatorPaisAdulto);
        click(locatorPaisAdulto);
        typeInto(locatorPaisAdulto, practiceFormModel.getPaisesOrigen().getValue());
        pressEnter(locatorPaisAdulto);

        scrollTo(locatorTipoIDAdulto);
        click(locatorTipoIDAdulto);
        typeInto(locatorTipoIDAdulto, practiceFormModel.getTipoDocumentoPersonaNatural().getValue());
        pressEnter(locatorTipoIDAdulto);

        scrollTo(locatorIDAdulto);
        clearText(locatorIDAdulto);
        typeInto(locatorIDAdulto, practiceFormModel.getCedulaPersona1());

        if(isElementPresent(locatorDiaNacido)){
            typeInto(locatorDiaNacido, practiceFormModel.getDiaNacido());
            typeInto(locatorMesNacido, practiceFormModel.getMesNacido());
            typeInto(locatorAnoNacido, practiceFormModel.getAnoNacido());
        }else{
            log.info("No se encontro el campo de fecha de nacimiento");
        }
        if(isElementPresent(locatorFemenino) && practiceFormModel.getGender().getValue().equals("Femenino")){
            click(locatorFemenino);
        }else{
            log.info("No se encontro el campo de genero Femenino");
        }
        if(isElementPresent(locatorMasculino) && practiceFormModel.getGender().getValue().equals("Masculino")){
            click(locatorMasculino);
        }else{
            log.info("No se encontro el campo de genero Masculino");
        }




        //persona 2

        scrollTo(locatorNombreAdulto);

        typeInto(locatorNombreAdulto, practiceFormModel.getNombrePersona2());

        scrollTo(locatorApellidoAdulto);

        typeInto(locatorApellidoAdulto, practiceFormModel.getApellidoPersona2());

        scrollTo(locatorPaisAdulto);
        click(locatorPaisAdulto);
        typeInto(locatorPaisAdulto, practiceFormModel.getPaisesOrigen().getValue());
        pressEnter(locatorPaisAdulto);

        scrollTo(locatorTipoIDAdulto);
        click(locatorTipoIDAdulto);
        typeInto(locatorTipoIDAdulto, practiceFormModel.getTipoDocumentoPersonaNatural().getValue());
        pressEnter(locatorTipoIDAdulto);

        scrollTo(locatorIDAdulto);
        clearText(locatorIDAdulto);
        typeInto(locatorIDAdulto, practiceFormModel.getCedulaPersona2());

        if(isElementPresent(locatorDiaNacido2)){
            typeInto(locatorDiaNacido2, practiceFormModel.getDiaNacido());
            typeInto(locatorMesNacido2, practiceFormModel.getMesNacido());
            typeInto(locatorAnoNacido2, practiceFormModel.getAnoNacido());
        }else{
            log.info("No se encontro el campo de fecha de nacimiento");
        }
        if(isElementPresent(locatorFemenino2) && practiceFormModel.getGender().getValue().equals("Femenino")){
            click(locatorFemenino2);
        }else{
            log.info("No se encontro el campo de genero Femenino");
        }
        if(isElementPresent(locatorMasculino2) && practiceFormModel.getGender().getValue().equals("Masculino")){
            click(locatorMasculino2);
        }else{
            log.info("No se encontro el campo de genero Masculino");
        }


        scrollTo(locatorEmail);
        clearText(locatorEmail);
        typeInto(locatorEmail, practiceFormModel.getEmail());

        scrollTo(locatorEmail);
        clearText(locatorEmail);
        typeInto(locatorEmail, practiceFormModel.getEmail());

        scrollTo(locatorTipoTelefono);
        typeInto(locatorTipoTelefono, practiceFormModel.getTipoTelefono());

        scrollTo(locatorAreaNumero);
        typeInto(locatorAreaNumero, practiceFormModel.getAreaTelefono());

        scrollTo(locatorNumeroTelefono);
        typeInto(locatorNumeroTelefono, practiceFormModel.getNumeroTelefono());

        click(locatorMantenerInformado);
        scrollTo(locatorAceptarTerminos);
        click(locatorAceptarTerminos);


    }


    public void fillVueloIdaVueltaFields() {

        explicitWaitTime(vueloIdaVuleta);
        click(vueloIdaVuleta);
        click(ciudadOrigen);
        clearText(ciudadOrigen);
        typeInto(ciudadOrigen, practiceFormModel.getCiudadOrigen());
        explicitWaitTime(locatorCiudadOrigen);
        click(locatorCiudadOrigen);
        pressEnter(ciudadOrigen);

        explicitWaitTime(ciudadDestino);
        click(ciudadDestino);
        clearText(ciudadDestino);
        typeInto(ciudadDestino, practiceFormModel.getCiudadDestino());

        try{
            explicitWaitTime(locatorCiudadDestino);
            click(locatorCiudadDestino);
        }catch(Exception e){ click(ciudadDestino);
            log.info("Se detecto bug en el campo ciudad de destino");
            clearText(ciudadDestino);
            typeInto(ciudadDestino, practiceFormModel.getCiudadDestino());
            click(locatorCiudadDestino);

        }


        pressEnter(ciudadDestino);


        click(date);
        scrollTo(locatorScrollAuxiliar);


        var day1ToGoLocator =By.cssSelector("div[data-month='"+practiceFormModel.getAnoPartida()+"-"+practiceFormModel.getMesPartida()+"'] .sbox5-monthgrid-datenumber:nth-child("+practiceFormModel.getDiaPartida()+")");
        click(date);
        scrollTo(locatorScrollAuxiliar);
        for(Integer i=0 ; i<Integer.parseInt(practiceFormModel.getMesPartida())-1 ; i++){
            click(flechaCambioFecha);
        }
        click(day1ToGoLocator);

        click(locatorScrollAuxiliar);

        var day2ToGoLocator =By.cssSelector("div[data-month='"+practiceFormModel.getVueltaAno()+"-"+practiceFormModel.getVueltaMes()+"'] .sbox5-monthgrid-datenumber:nth-child("+practiceFormModel.getVueltaDia()+")");
        click(date2);

        explicitWaitTime(day2ToGoLocator);
        click(day2ToGoLocator);

        click(buttonBuscar);

        explicitWaitTime(locatorForwaitNextPage);

        scrollTo(locatorForwaitNextPage);


        explicitWaitTime(locatorComprar);

        click(locatorComprar);

        waitUntilInvisibility(equipajeLoadingLocator);

        if (isElementPresent(equipajePageLocator)) {
            waitToBeClickable(locatorContinuarButton);
            click(locatorContinuarButton);
        }else{
            log.info("El viaje no requiere equipaje");
        }

        waitToBeClickable(locatorMetodoPagoOption);
        scrollTo(locatorMetodoPagoOption);
        click(locatorMetodoPagoOption);


        explicitWaitTime(locatorBancoOption);
        click(locatorBancoOption);
        typeInto(locatorBancoOption, practiceFormModel.getBancos().getValue());
        pressEnter(locatorBancoOption);

        click(locatorPersonaNatural);
        scrollTo(locatorNombrePersonaNatural);
        click(locatorNombrePersonaNatural);
        typeInto(locatorNombrePersonaNatural, practiceFormModel.getNombrePersona1());
        pressEnter(locatorNombrePersonaNatural);

        click(locatorApellidoPersonaNatural);
        typeInto(locatorApellidoPersonaNatural, practiceFormModel.getApellidoPersona1());
        pressEnter(locatorApellidoPersonaNatural);

        click(locatorTipoDocumentoPersonaNatural);
        typeInto(locatorTipoDocumentoPersonaNatural, practiceFormModel.getTipoDocumentoPersonaNatural().getValue());
        pressEnter(locatorTipoDocumentoPersonaNatural);

        click(locatorNumeroIDPersonaNatural);
        clearText(locatorNumeroIDPersonaNatural);
        typeInto(locatorNumeroIDPersonaNatural, practiceFormModel.getCedulaPersona1());
        pressEnter(locatorNumeroIDPersonaNatural);

        click(locatorOptionEstado);
        typeInto(locatorOptionEstado, practiceFormModel.getEstados().getValue());
        pressEnter(locatorOptionEstado);

        scrollTo(locatorCiudadEstado);
        clearText(locatorCiudadEstado);
        typeInto(locatorCiudadEstado, practiceFormModel.getCiudades().getValue());
        explicitWaitTime(locatorAuxiliarCiudad);
        click(locatorAuxiliarCiudad);


        explicitWaitTime(locatorDireccionPersonaNatural);
        scrollTo(locatorDireccionPersonaNatural);
        typeInto(locatorDireccionPersonaNatural, practiceFormModel.getDireccionAdulto());
        tab(locatorDireccionPersonaNatural);

        //persona 1
        scrollTo(locatorNombreAdulto);

        typeInto(locatorNombreAdulto, practiceFormModel.getNombrePersona1());

        scrollTo(locatorApellidoAdulto);

        typeInto(locatorApellidoAdulto, practiceFormModel.getApellidoPersona1());

        scrollTo(locatorPaisAdulto);
        click(locatorPaisAdulto);
        typeInto(locatorPaisAdulto, practiceFormModel.getPaisesOrigen().getValue());
        pressEnter(locatorPaisAdulto);

        scrollTo(locatorTipoIDAdulto);
        click(locatorTipoIDAdulto);
        typeInto(locatorTipoIDAdulto, practiceFormModel.getTipoDocumentoPersonaNatural().getValue());
        pressEnter(locatorTipoIDAdulto);

        scrollTo(locatorIDAdulto);
        clearText(locatorIDAdulto);
        typeInto(locatorIDAdulto, practiceFormModel.getCedulaPersona1());

        if(isElementPresent(locatorDiaNacido)){
            typeInto(locatorDiaNacido, practiceFormModel.getDiaNacido());
            typeInto(locatorMesNacido, practiceFormModel.getMesNacido());
            typeInto(locatorAnoNacido, practiceFormModel.getAnoNacido());
        }else{
            log.info("No se encontro el campo de fecha de nacimiento");
        }
        if(isElementPresent(locatorFemenino) && practiceFormModel.getGender().getValue().equals("Femenino")){
            click(locatorFemenino);
        }else{
            log.info("No se encontro el campo de genero Femenino");
        }
        if(isElementPresent(locatorMasculino) && practiceFormModel.getGender().getValue().equals("Masculino")){
            click(locatorMasculino);
        }else{
            log.info("No se encontro el campo de genero Masculino");
        }



        scrollTo(locatorEmail);
        clearText(locatorEmail);
        typeInto(locatorEmail, practiceFormModel.getEmail());

        scrollTo(locatorEmail);
        clearText(locatorEmail);
        typeInto(locatorEmail, practiceFormModel.getEmail());

        scrollTo(locatorTipoTelefono);
        typeInto(locatorTipoTelefono, practiceFormModel.getTipoTelefono());

        scrollTo(locatorAreaNumero);
        typeInto(locatorAreaNumero, practiceFormModel.getAreaTelefono());

        scrollTo(locatorNumeroTelefono);
        typeInto(locatorNumeroTelefono, practiceFormModel.getNumeroTelefono());

        click(locatorMantenerInformado);
        scrollTo(locatorAceptarTerminos);
        click(locatorAceptarTerminos);



    }



    public List<String> isRegistrationDone(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(locatorAssertionNombrePersona1).trim());
        submitedFormResult.add(getText(locatorAssertionApellidoPersona1).trim());
        submitedFormResult.add(getText(locatorAssertionCedulaPersona1).trim());
        submitedFormResult.add(getText(locatorAssertionNombrePersona2).trim());
        submitedFormResult.add(getText(locatorAssertionApellidoPersona2).trim());
        submitedFormResult.add(getText(locatorAssertionCedulaPersona2).trim());
        submitedFormResult.add(getText(locatorAssertionFechaIda).trim());
        return submitedFormResult;
    }

    public List<String> isRegistrationDone2(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(locatorAssertionNombrePersona1).trim());
        submitedFormResult.add(getText(locatorAssertionApellidoPersona1).trim());
        submitedFormResult.add(getText(locatorAssertionCedulaPersona1).trim());
        submitedFormResult.add(getText(locatorAssertionFechaIda).trim());
        submitedFormResult.add(getText(locatorAssertionFechaVuelta).trim());
        return submitedFormResult;
    }

   public List<String> finalPrice1(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(locatorAssertionValorFinal1).trim());
        return submitedFormResult;
    }

    public List<String> finalPrice2(){
        List<String> submitedFormResult = new ArrayList<>();
        submitedFormResult.add(getText(locatorAssertionValorFinal2).trim());
        return submitedFormResult;
    }


}
