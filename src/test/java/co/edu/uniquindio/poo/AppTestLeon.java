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
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestLeon {
    private static final Logger LOG = Logger.getLogger(AppTestLeon.class.getName());

     //Pruebas clase León
    @Test
    public void datosIguales() {
        LOG.info("Iniciado test datos Iguales");

        Leon leon1 = new Leon("Simba", 5, 190.5, "Carnivoro", "Espesa", null);

        assertEquals("Espesa", leon1.getMelena());

        LOG.info("Finalizando test datos iguales");
    }

    @Test
    public void pesoNegativo() {
        LOG.info("Iniciado test peso Negativo");

        Leon leon2 = new Leon("Mufasa", 8, 210.3, "Carnivoro", "Grande", null);

        assertThrows(Throwable.class, ()-> new Leon("Mufasa", 8, -207.5, "Carnivoro", "Grande", null));

        LOG.info("Finalizando test peso Negativo");
    }


}
