package Paquete_Cajero;

import java.util.Scanner;

public abstract class Clase_Padre
{

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void operacion()
    {
        System.out.println("Proyecto de Harold");
        int flag = 0;
        int seleccion = 0;
        do{
                do {
                    System.out.println("Bievenido!!!");
                    System.out.println("Ingrese una opción, por favor");
                    System.out.println("1. Consulta de saldo");
                    System.out.println("2. Retiro de efectivo");
                    System.out.println("3. Deposito de efectivo");
                    System.out.println("4. Salir...");

                    seleccion = entrada.nextInt();

                    if (seleccion > 4 && seleccion <= 0) {
                        System.out.println("opción invalida, ingrese una nueva");
                    } else {
                        flag = 1;
                    }
                }
                while (flag == 0);
                    if (flag != 0) {
                        if (seleccion == 1) {
                            Clase_Padre consulta = new Hija_Consulta();
                            consulta.transacciones();
                        } else if (seleccion == 2) {
                            Clase_Padre retiro = new Hija_Retiro();
                            retiro.transacciones();
                        } else if (seleccion == 3) {
                            Clase_Padre deposito = new Hija_Deposito();
                            deposito.transacciones();
                        } else if (seleccion == 4) {
                            System.out.println("Vuelva pronto");
                            flag = 2;
                        }
                    }
            } while(flag ==2);
    }

    public void retiro()
    {
        retiro = entrada.nextInt();
    }

    public void deposito()
    {
        deposito = entrada.nextInt();
    }

    public abstract void transacciones();

    public int getSaldo()
    {
        return saldo;
    }

    public void setSaldo(int saldo)
    {
        this.saldo = saldo;
    }
}
