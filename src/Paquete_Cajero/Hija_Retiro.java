package Paquete_Cajero;

public class Hija_Retiro extends Clase_Padre
{
    @Override
    public void transacciones()
    {

        System.out.println("¿Cuánto va a retirar?");
        retiro();
        transacciones=getSaldo();
        if(retiro<getSaldo())
        {
            setSaldo(transacciones-retiro);
            System.out.println("Valor del retiro es: "+ retiro);
            System.out.println("Valor del saldo actual es: "+ getSaldo());
        }
        else
            System.out.println("No cuenta con fondos ");


    }
}
