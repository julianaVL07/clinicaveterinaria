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
public class AppTestHabitat {
    private static final Logger LOG = Logger.getLogger(AppTestHabitat.class.getName());

     //Pruebas clase Hábitat
    @Test
    public void datosIguales() {
        LOG.info("Iniciado test datos iguales");

        Habitat habitat1 = new Habitat("Tropical", TipoHabitat.PRADERA);

        assertEquals("Tropical", habitat1.getClima());

        LOG.info("Finalizando test datos iguales");
    }

    @Test
    public void agregarAguila() {
        LOG.info("Iniciado test agregar Aguila");

        Habitat habitat1 = new Habitat("Tropical", TipoHabitat.PRADERA);

        Aguila aguila1 = new Aguila("Real", 3, 4.5, "Carnivoro", "Amplias", habitat1);
        Aguila aguila2 = new Aguila("Calva", 5, 3.2, "Carnivoro", "Largas", habitat1);

        habitat1.agregarAguilaHabitat(aguila1);
        habitat1.agregarAguilaHabitat(aguila2);

        assertTrue(habitat1.getAguilas().contains(aguila1));
        assertTrue(habitat1.getAguilas().contains(aguila2));

        assertEquals(2, habitat1.getAguilas().size());

        LOG.info("Finalizando test agregar Aguila");
    }

    @Test
    public void obetenerListaAguilaNombre() {
        LOG.info("Iniciado test obetenerListaAguilaNombre");

        Habitat habitat2 = new Habitat("Desértico", TipoHabitat.DESIERTO);

        Aguila aguila1 = new Aguila("Real", 3, 4.5, "Carnivoro", "Amplias", habitat2);
        Aguila aguila2 = new Aguila("Calva", 5, 3.2, "Carnivoro", "Largas", habitat2);

        habitat2.agregarAguilaHabitat(aguila1);
        habitat2.agregarAguilaHabitat(aguila2);

        var listaEsperada=List.of(aguila1);

        assertIterableEquals(listaEsperada, habitat2.aguilaNombre("Real"));
        
        LOG.info("Finalizando test obetenerListaAguilaNombre");
    }

}
