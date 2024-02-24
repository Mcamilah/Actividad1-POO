package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        double suma, X, Y; 
        suma=0;
        X=20; 
        suma=suma+X; 
        Y=40; 
        X=X + Math.pow(Y,2); 
        suma = suma + (X/Y); 
        System.out.println("El valor de la suma es: " + suma);
    }
    
}
