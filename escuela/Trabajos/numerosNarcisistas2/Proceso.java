
package numerosNarcisistas2;


public class Proceso extends Operaciones {

    int operar() {
        String numeroString = String.valueOf(numero);                                       //Evaluar el valor que ingreso el usuario en String y saber su tamaño
        int potencia = numeroString.length();                                               //Al saber el tamaño ahora toca volverlo entero para trabajar con potencias.
        
        aux = numero;
        while (aux > 0) {                                                                   //Ciclo que pide que el aux sea mayor que 0
            modulo = aux % 10;                                                              //Nos quedamos con el resultado del MOD(residuo) al dividir el numero ingresado por el usuario entre 10
            aux = aux / 10;                                                                 //Ahora el numero que ingreso el usuario se divide entre 10 pero ahor dando como resultado 
            suma = (int) (suma + (Math.pow(modulo, potencia)));                             //Utilicamos la variable suma mas en cuadrado del modulo que es una parte del numero ingresado.
        }
        return suma;
    }

}
