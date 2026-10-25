//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Termostato termostato = new Termostato(22.0, "automatico");

    System.out.println("=== Estado inicial ===");
    System.out.println("Temperatura: " + termostato.getTemperatura() + "°C | Modo: " + termostato.getModoOperacion());

    System.out.println("\n=== Temperaturas válidas ===");
    termostato.setTemperatura(18.5);
    termostato.setTemperatura(15.0);   // límite inferior
    termostato.setTemperatura(30.0);   // límite superior

    System.out.println("\n=== Temperaturas inválidas ===");
    termostato.setTemperatura(14.9);   // apenas por debajo
    termostato.setTemperatura(45.0);   // muy alta
    termostato.setTemperatura(-10.0);  // muy baja
    System.out.println("Temperatura actual: " + termostato.getTemperatura() + "°C"); // sigue en 30.0

    System.out.println("\n=== Modos de operación ===");
    termostato.setModoOperacion("calor");
    termostato.setModoOperacion("turbo");  // inválido
    termostato.setModoOperacion(null);     // inválido

    System.out.println("\n=== Constructor con datos inválidos ===");
    try {
        new Termostato(50.0, "frio");
    } catch (IllegalArgumentException e) {
        System.out.println("No se pudo crear el termostato: " + e.getMessage());
    }

}
