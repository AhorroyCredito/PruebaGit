package model.imc;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class ManagerImc {

    /**
     * Default constructor. 
     */
    public ManagerImc() {
        // TODO Auto-generated constructor stub
    }
    public  String CalcularImc(double peso,double estatura) {
    	double imc = peso/(estatura*estatura);
    	if (imc<=18.5) {
    		return "Delgado";
    	}else if(imc >18.5 & imc <= 24.9) {
    		return "Normal";
    	}else{
    		return "Robusto";
    	}
    	
    }

}
