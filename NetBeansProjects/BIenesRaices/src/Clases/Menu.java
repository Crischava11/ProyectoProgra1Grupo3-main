package Clases;

import javax.swing.JOptionPane;

import static Clases.Persona.nuevoPersona;
import static Clases.Persona.editarPersona;
import static Clases.Persona.consultarPersona;

import static Clases.Edificio.nuevoEdificio;
import static Clases.Edificio.editarEdificio;
import static Clases.Edificio.consultarEdificio;

import static Clases.Alquiler.nuevoAlquiler;
import static Clases.Alquiler.editarAlquiler;
import static Clases.Alquiler.consultarAlquiler;

public class Menu {
    public static void menu(){
        String[] opciones = {"Alquiler", "Edificio", "Persona", "Salir"};
        String[] submenus = {"Agregar", "Editar", "Consultar", "Volver"};
        
        int opcion;

        int submenu;
        
        do {
            opcion = JOptionPane.showOptionDialog(null, "Bienveniddo a Alquileres Bienes Raices el Encanto\nPor favor seleccione el tipo de servicio:", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ver"); 
            
            switch (opcion) {
                case 0:
                    
                    do { 
                        submenu = JOptionPane.showOptionDialog(null, "Ha Seleccionado Alquiler\nque actividad desea realizar?", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, submenus, "Ver");
                        switch (submenu){
                            case 0: 
                                nuevoAlquiler();
                                break; 
                                
                            case 1:
                                editarAlquiler();
                                
                                break; 
                            case 2:
                                consultarAlquiler();
                                break;
                        }
                    
                    } while (submenu !=3);


                    break;
         
                case 1:
                    
                    do { 
                        submenu = JOptionPane.showOptionDialog(null, "Ha Seleccionado Edificio\nque actividad desea realizar?", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, submenus, "Ver");
                        switch (submenu){
                            case 0: 
                                nuevoEdificio();
                                break; 
                                
                            case 1:
                                editarEdificio();
                                
                                break; 
                            case 2:
                                consultarEdificio();
                                break;
                        }
                    
                    } while (submenu !=3);

                    
                    break;
                case 2:
                    
                    do { 
                        submenu = JOptionPane.showOptionDialog(null, "Ha Seleccionado Persona\nque actividad desea realizar?", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null, submenus, "Ver");
                        switch (submenu){
                            case 0: 
                                nuevoPersona();
                                break; 
                                
                            case 1:
                                editarPersona();
                                
                                break; 
                            case 2:
                                consultarPersona();
                                break;
                        }
                    
                    } while (submenu !=3);


                    break;

            }
        } while (opcion != 3);
        JOptionPane.showMessageDialog(null,"Gracias por utilizar los servicios de Alquileres Bienes Raices el Encanto");
        System.exit(0); //Termina la aplicación
    }
}