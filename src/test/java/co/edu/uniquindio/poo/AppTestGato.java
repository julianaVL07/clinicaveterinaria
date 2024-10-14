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
public class AppTestGato {
    private static final Logger LOG = Logger.getLogger(AppTestGato.class.getName());

     //Pruebas clase Gato
    @Test
    public void datosDoblesIguales() {
        LOG.info("Iniciado test datos dobles iguales");

        Gato gato1 = new Gato("Mishi", 3, 4.5, LocalDate.of(2021, 5, 10), "Gris", null);

        assertEquals(4.5, gato1.getPeso());

        LOG.info("Finalizando test datos dobles iguales");
    }

    @Test
    public void datosVacíos(){
        LOG.info("Iniciado test datos vacíos");

        Gato gato2= new Gato("Felix", 5, 6.2, LocalDate.of(2019, 8, 23), "Negro", null);

        assertThrows(Throwable.class, ()-> new Gato(" ", 5, 6.2, LocalDate.of(2019, 8, 23), " ", null));

        LOG.info("Finalizando test datos vacíos");
    }
}
