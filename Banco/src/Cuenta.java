import java.util.Date;

public class Cuenta {
    protected String numeroDeCuenta;
    protected String titular;
    protected Date fechaDeAlta;//sera String o Data?
    protected String estado;

    protected Cliente cliente; //sera que va aqui la asociacion o solo en cliente
}


//PRIVATE O PROTECTED????
//PUEDEN LAS CLASES HIJAS ACCEDER A LOS ATRIBUTOS DE CLASE PADRE SI ESTAN EN PRIVADO????
