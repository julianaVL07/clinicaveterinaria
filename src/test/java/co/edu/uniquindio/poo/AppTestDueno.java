/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestDueno {
    private static final Logger LOG = Logger.getLogger(AppTestDueno.class.getName());

     //Pruebas clase Dueño
    @Test
    public void datosIguales() {
        LOG.info("Iniciado test datos iguales");

        Dueno dueno1 = new Dueno("Juan Perez", "Calle 123, Ciudad A", "555-1234");

        assertEquals("555-1234", dueno1.getTelefono());

        LOG.info("Finalizando test datos iguales");
    }

    @Test 
    public void agregarPerro() {
        LOG.info("Iniciado test agregar Perro");

        Dueno dueno1 = new Dueno("Juan Perez", "Calle 123, Ciudad A", "555-1234");

        Perro perro1 = new Perro("Rex", 4, 20.5, LocalDate.of(2020, 2, 15), "Labrador", dueno1);
        Perro perro2= new Perro("Max", 3, 15.3, LocalDate.of(2021, 7, 8), "Beagle", dueno1);
        Perro perro3 = new Perro("Bella", 2, 18.0, LocalDate.of(2022, 10, 1), "Pastor Alemán", dueno1);

        dueno1.agregarPerroDueno(perro1);
        dueno1.agregarPerroDueno(perro2);
        dueno1.agregarPerroDueno(perro3);

        assertTrue(dueno1.getPerros().contains(perro1));
        assertTrue(dueno1.getPerros().contains(perro2));
        assertTrue(dueno1.getPerros().contains(perro3));

        assertEquals(3, dueno1.getPerros().size());

        LOG.info("Finalizando test agregar Perro");

    }

    @Test 
    public void obtenerListaGatosMayoresEdad() {
        LOG.info("Iniciado test obtener lista gatos mayores edad");

        Dueno dueno2 = new Dueno("María García", "Avenida 45, Ciudad B", "555-5678");

        Gato gato1 = new Gato("Mishi", 3, 4.5, LocalDate.of(2021, 5, 10), "Gris", dueno2);
        Gato gato2= new Gato("Felix", 6, 6.2, LocalDate.of(2019, 8, 23), "Negro", dueno2);
        Gato gato3 = new Gato("Luna", 8, 3.8, LocalDate.of(2022, 1, 14), "Blanco", dueno2);

        dueno2.agregarGatoDueno(gato1);
        dueno2.agregarGatoDueno(gato2);
        dueno2.agregarGatoDueno(gato3);

        var listaEsperada= List.of(gato2,gato3);

        assertIterableEquals(listaEsperada, dueno2.gatosMayores5());

        LOG.info("Finalizando test obtener lista gatos mayores edad");

    }




    

}
