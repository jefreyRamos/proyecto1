package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Parqueadero {
   
   public String nombre;
   public Collection <Vehiculo> vehiculos ;
    public Parqueadero(String nombre)
    {
        this.nombre=nombre;
        vehiculos = new LinkedList<>();
        

    }


    public String ocupado(Vehiculo parqueadero){
       
       String a;
        if(parqueadero!=null){

            a= "Ocupado";

        }
        else{

        a= "desocupado";
        }
        return a;
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        assert verificarPlacaExiste(vehiculo.placa()) == false;
        vehiculos.add(vehiculo);
    }

    private boolean verificarPlacaExiste(String placa){
        boolean existe = false;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.placa().equals(placa)){
                existe = true;
            }
        }
        return existe;
    }

       // función para imprimir matriz
public String imprimirMatriz(Vehiculo[][] matriz){	
	String resultado = "";
	for(int i = 0; i < matriz.length; i++){
		for(int j = 0; j < matriz.length; j++){
			resultado += matriz[i][j] + "  ";
		}
		resultado = resultado + "\n";
	}
	return resultado;
}

// procedimiento para imprimir una matriz en un JoptionPane
public void imprimirMatrizResultado(String mensaje){
	JOptionPane.showMessageDialog(null, mensaje);
}



    
    
    

   
  


    
}
