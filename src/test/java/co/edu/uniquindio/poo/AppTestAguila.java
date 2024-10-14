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
public class AppTestAguila {
    private static final Logger LOG = Logger.getLogger(AppTestAguila.class.getName());

     //Pruebas clase Águila
    @Test
    public void datosIguales() {
        LOG.info("Iniciado test datos iguales");

        Aguila aguila1 = new Aguila("Real", 3, 4.5, "Carnivoro", "Amplias", null);

        assertEquals("Real", aguila1.getNombre());

        LOG.info("Finalizando test datos iguales");
    }

    @Test 
    public void edadNegativa(){
        LOG.info("Iniciado test edad negativa");

        Aguila aguila1 = new Aguila("Real", 3, 4.5, "Carnivoro", "Amplias", null);

        assertThrows(Throwable.class, ()-> new Aguila("Real",-3, 4.5, "Carnivoro", "Amplias", null));

        LOG.info("Finalizando test edad negativa");
    }



}
