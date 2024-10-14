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

import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTestVeterinaria {
    private static final Logger LOG = Logger.getLogger(AppTestVeterinaria.class.getName());

    //Pruebas clase Veterinaria
    @Test
    public void datosIguales() {
        LOG.info("Iniciado test datos Iguales");

        Veterinaria veterinaria = new Veterinaria("Love to animals");

        assertEquals("Love to animals", veterinaria.getNombre());
        LOG.info("Finalizando test datos Iguales");
    }

    @Test
    public void agregarHabitat() {
        LOG.info("Iniciado test agregar Habitat");

        Veterinaria veterinaria = new Veterinaria("Love to animals");

        Habitat habitat1 = new Habitat("Tropical", TipoHabitat.PRADERA);
        Habitat habitat2 = new Habitat("Desértico", TipoHabitat.DESIERTO);

        veterinaria.agregarHabitat(habitat1);
        veterinaria.agregarHabitat(habitat2);

        assertTrue(veterinaria.getHabitats().contains(habitat1));
        assertTrue(veterinaria.getHabitats().contains(habitat2));

        assertEquals(2, veterinaria.getHabitats().size());

        LOG.info("Finalizando test agregar Habitat");
    }

    @Test
    public void obtenerLeonPesoMenor() {
        LOG.info("Iniciado test obtener leon peso menor");

        Veterinaria veterinaria = new Veterinaria("Love to animals");

        Leon leon1 = new Leon("Simba", 5, 300.5, "Carnivoro", "Espesa", null);
        Leon leon2 = new Leon("Mufasa", 8, 210.3, "Carnivoro", "Grande", null);

        veterinaria.agregarLeon(leon1);
        veterinaria.agregarLeon(leon2);

        var listaEsperada= List.of(leon2);

        assertIterableEquals(listaEsperada, veterinaria.leonPesoMenor() );

        LOG.info("Finalizando test obtener leon peso menor");
    }


}
