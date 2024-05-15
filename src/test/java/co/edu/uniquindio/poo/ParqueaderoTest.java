package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    

    
    /**
     * Crear parqueadero
     */
    @Test
    public void shouldAnswerWithTrue() {
        
        Parqueadero parqueadero = new Parqueadero("LA CASA");
        Propietario propietario1 = new Propietario("Carlos", "10001");
        Propietario propietario2 = new Propietario("Maria", "10002");
        Auto auto1= new Auto("123", "2020", propietario1);
        Moto moto1= new Moto("321", "2021", TipoMoto.HÍBRIDA , propietario2, 150);
        parqueadero.agregarVehiculo(auto1);
        parqueadero.agregarVehiculo(moto1);

        Vehiculo [][] parqueadero1 = new Vehiculo [3][4];
        parqueadero.imprimirMatrizResultado("La matriz es: \n" + parqueadero.imprimirMatriz(parqueadero1));
        
        parqueadero1[0][0]= auto1;
        parqueadero1[0][1]=moto1;
        JOptionPane.showMessageDialog(null,"esta ocupado con el vehiculo"+parqueadero1[0][0].getPlaca());
        JOptionPane.showMessageDialog(null,"esta ocupado con el vehiculo"+parqueadero1[0][1].getPlaca());
            

        JOptionPane.showMessageDialog(null,"El lugar esta "+ parqueadero.ocupado(parqueadero1[0][0]));
        JOptionPane.showMessageDialog(null,"El propietario de esa posición es "+ parqueadero1[0][0].getPropietario());

       
        String a="";
        for ( int i = 0; i < parqueadero1.length; i++ ){                 //El primer índice “i” recorre las filas 
            for ( int j = 0; j < parqueadero1.length; j++ ){      //El segundo índice “j” recorre las columnas.
            // procesamos cada elemento de la matriz
            
            if(parqueadero1[i][j]!=null){
                a=a+" "+parqueadero1[i][j].getPlaca();
            }
            
        }
        }
        JOptionPane.showMessageDialog(null,a);
    }
    @Test
    public void testAgregarPuesto() {
        // Crear un parqueadero con 3 filas y 3 columnas
        Parqueadero parqueadero = new Parqueadero("doña marta", 3, 3);
        Propietario propietario1 = new Propietario("Carlos", "10001");
        Propietario propietario2 = new Propietario("Maria", "10002");
        Auto auto = new Auto("ABC123", "Toyota", propietario1);
        Auto auto2 = new Auto("XYZ789", "Honda", propietario2);
        
        // Agregar un vehículo al parqueadero
        parqueadero.agregarPuesto(auto, 0, 0);
        
        // Verificar que el vehículo se agregó correctamente en el puesto (0, 0)
        assertEquals(auto, parqueadero.getPuestos()[0][0]);
        
        // Intentar agregar otro vehículo en el mismo puesto (0, 0)
        // Debería fallar ya que el puesto ya está ocupado
        assertThrows(AssertionError.class, () -> {
            parqueadero.agregarPuesto(auto2, 0, 0);
        });
        
        // Verificar que el vehículo no se agregó en el mismo puesto (0, 0)
        assertNotEquals(auto2, parqueadero.getPuestos()[0][0]);
        
        // Intentar agregar otro vehículo en un puesto fuera del rango (5, 5)
        // Debería fallar ya que la ubicación del puesto es inválida
        assertThrows(AssertionError.class, () -> {
            parqueadero.agregarPuesto(auto2, 5, 5);
        });
    }
}