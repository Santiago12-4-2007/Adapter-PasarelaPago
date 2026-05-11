package adaptee;

public class LegacyPayLib {
    public void realizarTransaccion(int centavos, String codigoDivisa) {
        System.out.println("[LegacyPayLib] Procesando...");
        System.out.println("    Monto: " + centavos + " centavos");
        System.out.println("    Divisa: " + codigoDivisa);
        System.out.println("    Estado: Transacción Exitosa.");
    }
}