package ejercicio3;

public class Ejercicio3 {

   
    public static void main(String[] args) {
        double horas_trabajadas,valor_hora,retencion,salario_bruto,salario_neto;
        valor_hora=5000;
        horas_trabajadas=48;
        salario_bruto= valor_hora*horas_trabajadas;
        retencion= salario_bruto*(12.5/100);
        salario_neto=salario_bruto-retencion;
        System.out.println("Las horas trabajadas son: " + horas_trabajadas);
        System.out.println("El salario bruto es: "+ salario_bruto);
        System.out.println("La retencion es: "+ retencion);
        System.out.println("El salario neto es: "+ salario_neto);        
    }
    
}
