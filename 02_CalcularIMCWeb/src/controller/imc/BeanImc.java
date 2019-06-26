package controller.imc;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import model.imc.ManagerImc;

@Named
@SessionScoped
public class BeanImc implements Serializable{
	private static final long serialVersionUID = 1L;
	@EJB
	private ManagerImc managerImc;
	private double peso;
	private double estatura;
	private String resultado;
	
	public String actionCalcular() {
		resultado= managerImc.CalcularImc(peso, estatura);
		return "resultado";
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	

	
}
