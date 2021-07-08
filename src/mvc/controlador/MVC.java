/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controlador;

import mvc.modelo.Logica;
import mvc.vista.VentanaRegistro;
import mvc.vista.VentanaBuscar;
import mvc.vista.VentanaPrincipal;

/**
 *
 * @author topor
 */
public class MVC {
     Logica miLogica;
     VentanaPrincipal miVentanaPrincipal;
     VentanaBuscar miVentanaBuscar;
     VentanaRegistro miVentanaRegistro;
     Coordinador miCoordinador;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        MVC miPrincipal=new MVC();
        miPrincipal.iniciar();
        
    }
    
    private void iniciar() {
		/*Se instancian las clases*/
		miVentanaPrincipal=new VentanaPrincipal();
		miVentanaRegistro=new VentanaRegistro();
		miVentanaBuscar= new VentanaBuscar();
		miLogica=new Logica();
		miCoordinador= new Coordinador();
		
		/*Se establecen las relaciones entre clases*/
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaBuscar.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		/*Se establecen relaciones con la clase coordinador*/
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
		miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
		miCoordinador.setMiLogica(miLogica);
				
		miVentanaPrincipal.setVisible(true);
	}  
    
}
