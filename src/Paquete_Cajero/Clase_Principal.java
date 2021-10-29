package Paquete_Cajero;

public class Clase_Principal
{
    public static void main (String []args)
    {
        Clase_Padre deposito = new Hija_Deposito();
        deposito.setSaldo(500);
        deposito.operacion();

    }

}
