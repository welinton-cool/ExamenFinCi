/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.examenfinciclo;

/**
 *
 * @author LAPTOP DELL
 */
public class ExamenFinCiclo {

    private final boolean mostrarEdad;

    public ExamenFinCiclo nombre, int edad, String tipo) {
    this.nombre = nombre;
    this.edad = edad;
    this.tipo= tipo;
    this.mostrarEdad = false;
}

public String getNombre() {
    return nombre;
}

public String getTipo() {
    return tipo;
}

public void actualizarEdad(int nuevaEdad) {
    this.edad = nuevaEdad;
}

public void setMostrarEdad(boolean mostrar) {
    this.mostrarEdad = mostrar;
}

public String obtenerEdad() {
    return mostrarEdad ? edad + " años" : "Edad oculta";
}

}

// Clase ConsultaVeterinaria import java.util.Date;

public class ExamenFinCiclo { private Date fecha; private String motivo; private Mascota mascota; private double[] pesosDiasPrevios;

public ExamenFinCiclo(Date fecha, String motivo, Mascota mascota, double[] pesosDiasPrevios) {
    this.fecha = fecha;
    this.motivo = motivo;
    this.mascota = mascota;
    this.pesosDiasPrevios = pesosDiasPrevios;
}

public String evaluarPeso() {
    double suma = 0;
    for (double peso : pesosDiasPrevios) {
        suma += peso;
    }
    double promedio = suma / pesosDiasPrevios.length;

    if (mascota.getTipo().equalsIgnoreCase("Perro")) {
        if (promedio >= 8 && promedio <= 15) return "Peso ideal";
        else return "Problemas de peso";
    } else if (mascota.getTipo().equalsIgnoreCase("Gato")) {
        if (promedio >= 3 && promedio <= 6) return "Peso ideal";
        else return "Problemas de peso";
    } else {
        return "Tipo de mascota no evaluado";
    }
}

}

// Clase Principal import java.util.*;

public class VeterinariaApp { public static void main(String[] args) { Mascota m1 = new Mascota("Firulais", 4, "Perro"); m1.setMostrarEdad(true); System.out.println("Edad de " + m1.getNombre() + ": " + m1.obtenerEdad());

double[] pesos = {10.2, 9.8, 10.0, 10.5, 9.9};
    ConsultaVeterinaria consulta = new ConsultaVeterinaria(new Date(), "Chequeo anual", m1, pesos);

    System.out.println("Evaluación del peso: " + consulta.evaluarPeso());
}

}
    

