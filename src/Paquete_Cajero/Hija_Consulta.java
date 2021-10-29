package Paquete_Cajero;

public class Hija_Consulta extends Clase_Padre
{

    @Override
    public void transacciones()
    {
        System.out.println("Saldo actual: "+getSaldo());
    }
}
