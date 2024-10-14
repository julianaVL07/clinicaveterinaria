package co.edu.uniquindio.poo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        //creamos la veterinaria

        Veterinaria veterinaria = new Veterinaria("Love to animals");

        //creamos los duenos
        Dueno dueno1 = new Dueno("Juan Perez", "Calle 123, Ciudad A", "555-1234");
        Dueno dueno2 = new Dueno("María García", "Avenida 45, Ciudad B", "555-5678");
        Dueno dueno3 = new Dueno("Carlos Rodríguez", "Boulevard 67, Ciudad C", "555-9876");

        //creamos gatos
        Gato gato1 = new Gato("Mishi", 3, 4.5, LocalDate.of(2021, 5, 10), "Gris", dueno1);
        Gato gato2= new Gato("Felix", 5, 6.2, LocalDate.of(2019, 8, 23), "Negro", dueno2);
        Gato gato3 = new Gato("Luna", 2, 3.8, LocalDate.of(2022, 1, 14), "Blanco", dueno3);

        //creamos perros
        Perro perro1 = new Perro("Rex", 4, 20.5, LocalDate.of(2020, 2, 15), "Labrador", dueno1);
        Perro perro2= new Perro("Max", 3, 15.3, LocalDate.of(2021, 7, 8), "Beagle", dueno2);
        Perro perro3 = new Perro("Bella", 2, 18.0, LocalDate.of(2022, 10, 1), "Pastor Alemán", dueno3);

        //creamos canarios
        Canario canario1 = new Canario("Piolin", 1, 0.1, LocalDate.of(2023, 3, 10), 15, dueno1);
        Canario canario2= new Canario("Sol", 3, 0.12, LocalDate.of(2021, 8, 30), 14, dueno2);
        Canario canario3 = new Canario("Chico", 2, 0.09, LocalDate.of(2022, 5, 18), 13, dueno3);

        //creamos las habitats
        Habitat habitat1 = new Habitat("Tropical", TipoHabitat.PRADERA);
        Habitat habitat2 = new Habitat("Desértico", TipoHabitat.DESIERTO);

        //creamos los leones
        Leon leon1 = new Leon("Simba", 5, 190.5, "Carnivoro", "Espesa", habitat1);
        Leon leon2 = new Leon("Mufasa", 8, 210.3, "Carnivoro", "Grande", habitat2);

        //creamos las aguilas
        Aguila aguila1 = new Aguila("Real", 3, 4.5, "Carnivoro", "Amplias", habitat1);
        Aguila aguila2 = new Aguila("Calva", 5, 3.2, "Carnivoro", "Largas", habitat2);
        
        //agregamos dueños a veterinaria
        veterinaria.agregarDueno(dueno1);
        veterinaria.agregarDueno(dueno2);
        veterinaria.agregarDueno(dueno3);

        //agregamos habitats a veterinaria
        veterinaria.agregarHabitat(habitat1);
        veterinaria.agregarHabitat(habitat2);

        //agregar canarios a veterinaria
        veterinaria.agregarCanario(canario1);
        veterinaria.agregarCanario(canario2);
        veterinaria.agregarCanario(canario3);

        //agregar perros a veterinaria
        veterinaria.agregarPerro(perro1);
        veterinaria.agregarPerro(perro2);
        veterinaria.agregarPerro(perro3);

        //agregar gatos a veterinaria
        veterinaria.agregarGato(gato1);
        veterinaria.agregarGato(gato2);
        veterinaria.agregarGato(gato3);

        //agregar leones a veterinaria
        veterinaria.agregarLeon(leon1);
        veterinaria.agregarLeon(leon2);

        //agregar aguilas a veterinaria
        veterinaria.agregarAguila(aguila1);
        veterinaria.agregarAguila(aguila2);

        //agregar perros a dueño
        dueno1.agregarPerroDueno(perro1);
        dueno2.agregarPerroDueno(perro2);
        dueno3.agregarPerroDueno(perro3);

        //agregar gatos a dueño
        dueno1.agregarGatoDueno(gato1);
        dueno2.agregarGatoDueno(gato2);
        dueno3.agregarGatoDueno(gato3);

        //agregar canarios a dueño
        dueno1.agregarCanarioDueno(canario1);
        dueno2.agregarCanarioDueno(canario2);
        dueno3.agregarCanarioDueno(canario3);

        //agregar leones a habitat
        habitat1.agregarLeonHabitat(leon1);
        habitat2.agregarLeonHabitat(leon2);

        //agregar aguilas a habitat
        habitat1.agregarAguilaHabitat(aguila1);
        habitat2.agregarAguilaHabitat(aguila2);

        //mostrar veterinaria
        Veterinaria.mostrarMensaje(veterinaria.toString());

        //Metodos clases - abstractas 
        perro1.comer();
        perro1.cuidadosFrecuentes();
        perro1.dormir();; //este es estático

        gato1.comer();
        gato1.cuidadosFrecuentes();

        canario1.comer();
        canario1.cuidadosFrecuentes();

        leon1.comer();
        leon1.comportamientoInstintivo();

        aguila1.comer();
        aguila1.comportamientoInstintivo();
        
        //Metodos clases - estáticas
        Animal.dormir();

        boolean menu= true;
        while (menu){
            Veterinaria.mostrarMensaje("Bienvenidos;\n");
            int animalSeleccionado= Veterinaria.ingresarEntero("Selección la mascota: \n1.Perro \n2.Gato \n3.Canario \n4.León \n5.Águila \n6.Salir del programa\n");

            switch (animalSeleccionado) {
                case 1:
                    Veterinaria.mostrarMensaje("Ha seleccionado el perro "+perro1.getNombre());
                    interaccionDomestico(perro1);
                    break;
                case 2:
                    Veterinaria.mostrarMensaje("Ha seleccionado el gato "+gato1.getNombre());
                    interaccionDomestico(gato1);
                    break;
                case 3:
                    Veterinaria.mostrarMensaje("Ha seleccionado el gato "+canario1.getNombre());
                    interaccionDomestico(canario1);
                    break;
                case 4:
                    Veterinaria.mostrarMensaje("Ha seleccionado el gato "+leon1.getNombre());
                    interaccionSalvaje(leon1);
                    break;
                case 5:
                    Veterinaria.mostrarMensaje("Ha seleccionado el gato "+aguila1.getNombre());
                    interaccionSalvaje(aguila1);
                    break;
                case 6:
                    menu=false;
                    Veterinaria.mostrarMensaje("Saliendo del programa...");
                    break;
                default:
                    Veterinaria.mostrarMensaje("Error, ingrese una opción válida");
                    break;
            }
            
            Veterinaria.mostrarMensaje("-----------------------------");
        }   
    }
    public static void interaccionDomestico(AnimalDomestico animalDomestico){
        boolean menuInteraccion=true;
        while(menuInteraccion){
            int acciones=Veterinaria.ingresarEntero("Seleccione una de las siguientes opciones que quiere que haga "+animalDomestico.getNombre()+"\n1.Dormir \n2.Comer \n3.cuidados frecuentes \n4.Volver al menú principal\n");

            switch (acciones) {
                case 1:
                    animalDomestico.dormir(); 
                    break;
                case 2:
                    animalDomestico.comer();
                    break;
                case 3:
                    animalDomestico.cuidadosFrecuentes();
                case 4:
                    menuInteraccion=false;
                    Veterinaria.mostrarMensaje("Volviendo al menú principal...");
                    break;
                default:
                    Veterinaria.mostrarMensaje("Error, ingrese una opción válida");
                    break;
            }
        }

    }
    public static void interaccionSalvaje(AnimalSalvaje animalSalvaje){
        boolean menuInteraccion=true;
        while(menuInteraccion){
            int acciones=Veterinaria.ingresarEntero("Seleccione una de las siguientes opciones que quiere que haga "+animalSalvaje.getNombre()+"\n1.Dormir \n2.Comer \n3.comportamientos instintivos \n4.Volver al menú principal\n");

            switch (acciones) {
                case 1:
                    animalSalvaje.dormir(); 
                    break;
                case 2:
                    animalSalvaje.comer();
                    break;
                case 3:
                    animalSalvaje.comportamientoInstintivo();
                case 4:
                    menuInteraccion=false;
                    Veterinaria.mostrarMensaje("Volviendo al menú principal...");
                    break;
                default:
                    Veterinaria.mostrarMensaje("Error, ingrese una opción válida");
                    break;
            }
        }
    }
}
    

