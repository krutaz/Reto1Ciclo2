
import java.util.Scanner;

public class Mainapp {
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    
    int servicio, estrato, consumo;
    double desc, impuesto, total, costo_total, unidad;
        
    do{
    
    System.out.println("PAGO DE SERVICIOS PÚBLICOS\n"
                + "Seleccione el servicio público:\n"
                + "1. Energia\n"
                + "2. Acueducto\n"
                + "3. Gas Natural\n"
                + "4. Salir\n"
                + "Opción:");
    servicio = leer.nextInt();
        switch (servicio){
            case 1:
                System.out.println("Pago de Servicio de Energia");
                break;
            case 2:
                System.out.println("Pago de Servicio de Acueducto");
                break;
            case 3:
                System.out.println("Pago de Servicio de Gas Natural");
                break;
        }
    if (servicio == 4){
        System.out.println("Hasta pronto");
        break;
    }
    System.out.println("Estrato del inmueble:");
    estrato = leer.nextInt();
    System.out.println("Consumo del inmueble:");
    consumo = leer.nextInt();
    
        switch (estrato) {
            case 1:
            case 2:
                desc = 0.5;
                break;
            case 3:
            case 4:
                desc = 0.9;
                break;
            default:
                desc = 1.25;
                break;
        }
        switch (servicio) {
            case 1:
                unidad = 6200;                
                break;
            case 2:
                unidad = 9256;                
                break;
            default:
                unidad = 5234;                
                break;
        }
        
        costo_total = unidad * consumo;
        impuesto = costo_total * 0.01;
        desc = (costo_total * desc) - costo_total;
        total = (costo_total + desc) + impuesto;
        
        System.out.println("El consumo fue: " + consumo);
        System.out.println("Valor unidad: " + unidad);
        System.out.println("Estrato del inmueble: " + estrato);
        System.out.println("Costo total: " + costo_total);
        System.out.println("Descuento o sobrecosto: " + desc);
        System.out.println("Impuesto por infraestructura: " + impuesto);
        System.out.println("TOTAL A PAGAR: " + total + "\n");
    
    }while (servicio != 4);
}
}
