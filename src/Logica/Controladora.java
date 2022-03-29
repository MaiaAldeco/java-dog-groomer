
package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    //creo instancia a la controladora de la persistencia
     ControladoraPersistencia controlPersis = new ControladoraPersistencia();
     
    //creo el método para dar de alta el formulario

    public void altaForm(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        Formulario formu = new Formulario();
        formu.setNum_cliente(num_cliente);
        formu.setNombre_perro(nombre_perro);
        formu.setRaza(raza);
        formu.setColor(color);
        formu.setAlergico(alergico);
        formu.setAtencion_especial(atencion_especial);
        formu.setNombre_duenio(nombre_duenio);
        formu.setCelular_duenio(celular_duenio);
        formu.setObservaciones(observaciones);
        //mando a la controladora de persistencia mi nuevo formulario
        controlPersis.altaProducto(formu);
                
    }
     
    
}
