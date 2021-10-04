public class Gasnatural {
    public Gasnatural(){
        
    }
    
    public void calcular_gasnatural(int servicio, int estrato, int consumo){
        int unidad = 5234;
        double desc, impuesto, total, costo_total;
        
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
        System.out.println("TOTAL A PAGAR: " + total);
    }
}
