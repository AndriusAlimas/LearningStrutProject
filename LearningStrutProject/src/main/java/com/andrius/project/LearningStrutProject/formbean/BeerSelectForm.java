package com.andrius.project.LearningStrutProject.formbean;
// Struts imports:
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;

// Form beans must extend ActionForm:
public class BeerSelectForm extends ActionForm {

	private String color;
	
	// Ussualy, you will want your Form beans to have a getters and setters
	// for all of the form params (because you know its bean):
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	
	// The ActionServlet calls validate(), Struts provides ActionErrors to 
	// manage validation errors:
	private static final String VALID_COLORS = "amber,dark,light,brown";
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
		
		ActionErrors errors = new ActionErrors();
		
		if( VALID_COLORS.indexOf(color) == -1){
	// The ActionError constructor takes a String that is a symbolic key into a resource
	// bundle. This is done to facilitate internationalisation:
			errors.add("color", new ActionMessage("error.colorField.notValid"));
		}
		
		return errors;
	}
}
