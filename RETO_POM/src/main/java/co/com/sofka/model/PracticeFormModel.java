package co.com.sofka.model;

import co.com.sofka.util.Clase;
import co.com.sofka.util.*;


public class PracticeFormModel {

    private String ciudadOrigen;
    private String ciudadDestino;
    private int diaPartida;
    private String mesPartida;
    private int anoPartida;
    private int vueltaDia;
    private String  vueltaMes;
    private int vueltaAno;
    private Clase clase;
    private String edadNinos;
    private String nombrePersona1;
    private String apellidoPersona1;
    private String cedulaPersona1;
    private String nombrePersona2;
    private String apellidoPersona2;
    private String cedulaPersona2;
    private String diaNacido;
    private String mesNacido;
    private String anoNacido;
    private Gender gender;
    private Bancos bancos;
    private TipoDocumentoPersonaNatural tipoDocumentoPersonaNatural;
    private Estados estados;
    private Ciudades ciudades;
    private String direccionAdulto;
    private PaisesOrigen paisesOrigen;
    private String email;
    private String tipoTelefono;
    private String areaTelefono;
    private String numeroTelefono;
    private Meses meses;
    private Meses2 meses2;



    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public int getDiaPartida() {
        return diaPartida;
    }

    public void setDiaPartida(int diaPartida) {
        this.diaPartida = diaPartida+1;
    }

    public String getMesPartida() {
        return mesPartida;
    }

    public void setMesPartida(String mesPartida) {
        this.mesPartida = mesPartida;
    }

    public int getAnoPartida() {
        return anoPartida;
    }

    public void setAnoPartida(int anoPartida) {
        this.anoPartida = anoPartida;
    }

    public int getVueltaDia() {
        return vueltaDia;
    }

    public void setVueltaDia(int vueltaDia) {
        this.vueltaDia = vueltaDia+1;
    }

    public String getVueltaMes() {
        return vueltaMes;
    }

    public void setVueltaMes(String vueltaMes) {
        this.vueltaMes = vueltaMes;
    }

    public int getVueltaAno() {
        return vueltaAno;
    }

    public void setVueltaAno(int vueltaAno) {
        this.vueltaAno = vueltaAno;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public String getEdadNinos() {
        return edadNinos;
    }

    public void setEdadNinos(String edadNinos) {
        this.edadNinos = edadNinos;
    }

    public String getNombrePersona1() {
        return nombrePersona1;
    }

    public void setNombrePersona1(String nombrePersona1) {
        this.nombrePersona1 = nombrePersona1;
    }

    public String getApellidoPersona1() {
        return apellidoPersona1;
    }

    public void setApellidoPersona1(String apellidoPersona1) {
        this.apellidoPersona1 = apellidoPersona1;
    }

    public String getCedulaPersona1() {
        return cedulaPersona1;
    }

    public void setCedulaPersona1(String cedulaPersona1) {
        this.cedulaPersona1 = cedulaPersona1;
    }

    public String getNombrePersona2() {
        return nombrePersona2;
    }

    public void setNombrePersona2(String nombrePersona2) {
        this.nombrePersona2 = nombrePersona2;
    }

    public String getApellidoPersona2() {
        return apellidoPersona2;
    }

    public void setApellidoPersona2(String apellidoPersona2) {
        this.apellidoPersona2 = apellidoPersona2;
    }

    public String getCedulaPersona2() {
        return cedulaPersona2;
    }

    public void setCedulaPersona2(String cedulaPersona2) {
        this.cedulaPersona2 = cedulaPersona2;
    }


    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }

    public TipoDocumentoPersonaNatural getTipoDocumentoPersonaNatural() {
        return tipoDocumentoPersonaNatural;
    }

    public void setTipoDocumentoPersonaNatural(TipoDocumentoPersonaNatural tipoDocumentoPersonaNatural) {
        this.tipoDocumentoPersonaNatural = tipoDocumentoPersonaNatural;
    }

    public Estados getEstados() {
        return estados;
    }

    public void setEstados(Estados estados) {
        this.estados = estados;
    }

    public Ciudades getCiudades() {
        return ciudades;
    }

    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }

    public String getDireccionAdulto() {
        return direccionAdulto;
    }

    public void setDireccionAdulto(String direccionAdulto) {
        this.direccionAdulto = direccionAdulto;
    }

    public PaisesOrigen getPaisesOrigen() {
        return paisesOrigen;
    }

    public void setPaisesOrigen(PaisesOrigen paisesOrigen) {
        this.paisesOrigen = paisesOrigen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    public String getAreaTelefono() {
        return areaTelefono;
    }

    public void setAreaTelefono(String areaTelefono) {
        this.areaTelefono = areaTelefono;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Meses getMeses() {
        return meses;
    }

    public void setMeses(Meses meses) {
        this.meses = meses;
    }

    public Meses2 getMeses2() {
        return meses2;
    }

    public void setMeses2(Meses2 meses2) {
        this.meses2 = meses2;
    }

    public String getDiaNacido() {
        return diaNacido;
    }

    public void setDiaNacido(String diaNacido) {
        this.diaNacido = diaNacido;
    }

    public String getMesNacido() {
        return mesNacido;
    }

    public void setMesNacido(String mesNacido) {
        this.mesNacido = mesNacido;
    }

    public String getAnoNacido() {
        return anoNacido;
    }

    public void setAnoNacido(String anoNacido) {
        this.anoNacido = anoNacido;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
