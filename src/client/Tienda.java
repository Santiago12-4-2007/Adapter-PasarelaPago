package client;

import target.PasarelaPago;

public class Tienda {
    private PasarelaPago pasarela;

    public Tienda(PasarelaPago pasarela) {
        this.pasarela = pasarela;
    }

    public void checkout(double total, String moneda) {
        System.out.println("[Tienda] Iniciando pago de la orden...");
        pasarela.procesarPago(total, moneda);
    }
}