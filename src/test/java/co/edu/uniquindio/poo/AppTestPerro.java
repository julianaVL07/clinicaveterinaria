/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestPerro {
    private static final Logger LOG = Logger.getLogger(AppTestPerro.class.getName());

     //Pruebas clase Perro
    @Test
    public void datosIguales() {
        LOG.info("Iniciado test datos Iguales");
        Perro perro1 = new Perro("Rex", 4, 20.5, LocalDate.of(2020, 2, 15), "Labrador", null);

        assertEquals("Labrador", perro1.getRaza());

        LOG.info("Finalizando test datos iguales");
    }

    @Test
    public void datosVacios() {
        LOG.info("Iniciado test datos vacíos");
        Perro perro2= new Perro("Max", 3, 15.3, LocalDate.of(2021, 7, 8), "Beagle", null);

        assertThrows(Throwable.class, ()-> new Perro (" ", 3, 15.3, LocalDate.of(2021, 7, 8), " ", null));

        LOG.info("Finalizando test datos vacíos");
    }

}
