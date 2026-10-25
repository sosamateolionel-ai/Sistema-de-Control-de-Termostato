public class Termostato {

    private static final double TEMPERATURA_MINIMA = 15.0;
    private static final double TEMPERATURA_MAXIMA = 30.0;

    private double temperaturaActual;
    private String modoOperacion; // "frio", "calor" o "automatico"

    public Termostato(double temperaturaInicial, String modoInicial) {

        if (!esTemperaturaValida(temperaturaInicial)) {
            throw new IllegalArgumentException("La temperatura inicial debe estar entre "
                    + TEMPERATURA_MINIMA + "°C y " + TEMPERATURA_MAXIMA + "°C.");
        }
        if (!esModoValido(modoInicial)) {
            throw new IllegalArgumentException("Modo de operación inválido: " + modoInicial);
        }

        this.temperaturaActual = temperaturaInicial;
        this.modoOperacion = modoInicial;
    }


    public double getTemperatura() {
        return temperaturaActual;
    }

    public boolean setTemperatura(double nuevaTemperatura) {

        if (!esTemperaturaValida(nuevaTemperatura)) {
            System.out.println("ADVERTENCIA: " + nuevaTemperatura + "°C está fuera del rango permitido ("
                    + TEMPERATURA_MINIMA + "°C a " + TEMPERATURA_MAXIMA + "°C). Se mantiene en "
                    + temperaturaActual + "°C.");
            return false;
        }

        temperaturaActual = nuevaTemperatura;
        System.out.println("Temperatura ajustada a " + temperaturaActual + "°C.");
        return true;
    }

    public String getModoOperacion() {
        return modoOperacion;
    }

    public boolean setModoOperacion(String nuevoModo) {

        if (!esModoValido(nuevoModo)) {
            System.out.println("ADVERTENCIA: el modo \"" + nuevoModo + "\" no existe. Se mantiene en \""
                    + modoOperacion + "\".");
            return false;
        }

        modoOperacion = nuevoModo;
        System.out.println("Modo de operación cambiado a \"" + modoOperacion + "\".");
        return true;
    }

    // ----- Validaciones internas (ocultas al exterior) -----

    private boolean esTemperaturaValida(double temperatura) {
        return temperatura >= TEMPERATURA_MINIMA && temperatura <= TEMPERATURA_MAXIMA;
    }

    private boolean esModoValido(String modo) {
        return "frio".equals(modo) || "calor".equals(modo) || "automatico".equals(modo);
    }
}