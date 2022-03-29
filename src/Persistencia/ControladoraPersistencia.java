
package Persistencia;

import Logica.Formulario;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    //creo instancia a FormularioJpaController para acceder a los métodos del controlador
    FormularioJpaController formuJpa = new FormularioJpaController();
    
   //método para dar de alta un formulario de la clase Formulario (lógica) y lo guarda
     public void altaProducto (Formulario formu){
        
        try {
            formuJpa.create(formu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
