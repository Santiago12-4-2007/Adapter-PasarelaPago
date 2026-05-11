package adapter;

import adaptee.LegacyPayLib;
import target.PasarelaPago;

public class LegacyPayAdapter implements PasarelaPago {
    private LegacyPayLib legacyLib;

    public LegacyPayAdapter(LegacyPayLib legacyLib) {
        this.legacyLib = legacyLib;
    }

    @Override
    public void procesarPago(double monto, String moneda) {
        int centavos = (int) (monto * 100);

        String divisaAdaptada = moneda.toUpperCase();

        System.out.println("[Adapter] Adaptando " + monto + " " + moneda + " a centavos...");

        // Delegación a la clase legacy
        legacyLib.realizarTransaccion(centavos, divisaAdaptada);
    }
}
