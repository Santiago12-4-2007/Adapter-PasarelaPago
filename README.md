# Adapter-PasarelaPago
Una tienda online moderna tiene su propia interfaz PasarelaPago con el método
procesarPago(double monto, String moneda). Sin embargo, el proveedor de pagos contratado
usa una librería antigua (LegacyPayLib) con el método realizarTransaccion(int centavos, String
codigoDivisa).

Problema a resolver: Implemente una solución con el patrón Adapter que permita al sistema de
la tienda usar LegacyPayLib a través de la interfaz PasarelaPago, sin modificar ninguna de las
dos clases existentes.
# Adapter-PasarelaPago