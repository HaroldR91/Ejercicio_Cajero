package Paquete_Cajero;

public class Hija_Deposito extends Clase_Padre
{
    @Override
    public void transacciones()
    {
        System.out.println("¿Cuánto va a depositar?");
        deposito();
        transacciones=getSaldo();
        setSaldo(deposito+transacciones);
        System.out.println("Valor del deposito es: "+ deposito);
        System.out.println("Valor del saldo actual es: "+ getSaldo());
    }
}
