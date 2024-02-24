package ejercicio.pkg1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int edjuan, edalber, edana, edmama;
        edjuan = 9;
        edalber = 2*(edjuan/3);
        edana = 4*(edjuan/3);
        edmama = edjuan + edalber + edana;
               
        System.out.println("Las edades son:");
        System.out.println("Alberto: " + edalber);
        System.out.println("Ana: " + edana);
        System.out.println("Juan: " + edjuan);
        System.out.println("Mama: " + edmama);
    }
    
}
