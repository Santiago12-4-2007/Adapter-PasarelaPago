import adaptee.LegacyPayLib;
import adapter.LegacyPayAdapter;
import client.Tienda;
import target.PasarelaPago;

public class Main {
    public static void main(String[] args) {

        PasarelaPago pasarelaPago = new PasarelaPago() {
            @Override
            public void procesarPago(double monto, String moneda) {
                System.out.println("[ModernaPay] Procesando pago de " + monto + " " + moneda);
                System.out.println("    Estado: Transacción completada instantáneamente.");
            }
        };

        Tienda miTienda = new Tienda(pasarelaPago);
        miTienda.checkout(37.56, "SOLES");
        miTienda.checkout(57.56, "DOLARES");

        LegacyPayLib  libreriaAntigua = new LegacyPayLib();

        PasarelaPago adaptador = new LegacyPayAdapter(libreriaAntigua);

        Tienda miTienda2 = new Tienda(adaptador);

        miTienda2.checkout(45.50, "SOLES");
        miTienda2.checkout(120.00, "DOLARES");
    }
}