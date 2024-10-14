/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestCanario {
    private static final Logger LOG = Logger.getLogger(AppTestCanario.class.getName());

     //Pruebas clase Canario
    @Test
    public void datosEnterosIguales () {
        LOG.info("Iniciado test datos enteros iguales");

        Canario canario1 = new Canario("Piolin", 1, 0.1, LocalDate.of(2023, 3, 10), 15, null);

        assertEquals(1, canario1.getEdad());

        LOG.info("Finalizando test datos enteros iguales");
    }

    @Test
    public void datosVacios(){
        LOG.info("Iniciado test datos vacios");

        Canario canario2= new Canario("Sol", 3, 0.12, LocalDate.of(2021, 8, 30), 14, null);

        assertThrows(Throwable.class, ()-> new Canario (" ", 3, 0.12, LocalDate.of(2021, 8, 30), 14, null));

        LOG.info("Finalizando test datos vacios");
    }

}
