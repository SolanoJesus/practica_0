package numerosNarcisistas2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operaciones {

    protected Scanner entrada=new Scanner(System.in);
    protected int numero, aux, suma, modulo;                                                  //Definir variables      
    
    public void Operaciones(int numero, int aux,int suma,int modulo){
        this.numero=numero;
        this.aux=aux;
        this.suma=suma;
        this.modulo=modulo;
    }
    
    public void ingresarValor() {
        try {
            System.out.print("Ingresa un numero entero:");                                   //Pedir al usuario que ingrese un dato.
            numero = entrada.nextInt();                                                      //El valo digitado se guarda en la variable 
        } catch (InputMismatchException e) {
            System.out.println("Favor de ingresar un numero entero.");
        }
    }
    
    public void Comparar() {
        if (numero == suma)                                                                 //Condicion donde comprobamos si el numero ingresado es igual a la suma.
        {
            System.out.println("El valor " + numero + " es numero narcisita.");              //Visualizacion de valores.
        } else //Si la codicion no se cumple.
        {
            System.out.println("El valor " + numero + " NO es numero narcisita.");           //Se visualiza un valor erroneo.
        }
    }

}
