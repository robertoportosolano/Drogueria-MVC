/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controlador;

import mvc.modelo.Logica;
import mvc.modelo.vo.PersonaVo;
import mvc.vista.VentanaBuscar;
import mvc.vista.VentanaPrincipal;
import mvc.vista.VentanaRegistro;

/**
 *
 * @author topor
 */
public class Coordinador {
        
    private Logica miLogica;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaBuscar miVentanaBuscar;
	
	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;	}
	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;	}
	public VentanaRegistro getMiVentanaRegistro() {
		return miVentanaRegistro;	}
	public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;	}
	public VentanaBuscar getMiVentanaBuscar() {
		return miVentanaBuscar; 	}
	public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
		this.miVentanaBuscar = miVentanaBuscar;	}
	public Logica getMiLogica() {
		return miLogica;	}
	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
       
        ///////////////////////////////////////////////////////
        public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);	}
	public void mostrarVentanaConsulta() {
		miVentanaBuscar.setVisible(true);	}
	public void registrarPersona(PersonaVo miPersona) {
		miLogica.validarRegistro(miPersona); }
	public PersonaVo buscarPersona(String codigoPersona) {
		return miLogica.validarConsulta(codigoPersona);	}
	public void modificarPersona(PersonaVo miPersona) {
		miLogica.validarModificacion(miPersona);
	}
	public void eliminarPersona(String codigo) {
		miLogica.validarEliminacion(codigo);
	}




}
