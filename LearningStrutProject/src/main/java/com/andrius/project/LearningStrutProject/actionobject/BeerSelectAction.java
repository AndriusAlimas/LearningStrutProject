package com.andrius.project.LearningStrutProject.actionobject;
import com.andrius.project.LearningStrutProject.formbean.BeerSelectForm;
// Model import:
import com.andrius.project.LearningStrutProject.model.BeerExpert;
// util:
import java.util.*;
// struts:
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
// servlet:
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Your controllers MUST extend the Action class:
public class BeerSelectAction extends Action{

	// Sent from the ActionServlet, so we can return the right view:
	public ActionForward execute(ActionMapping mapping, ActionForm form, // provides access to the validate user form params
			HttpServletRequest request, HttpServletResponse response){
		
		// Cast the form to the application-specific form:
		BeerSelectForm myForm = (BeerSelectForm)form;
		
		// Process the business logic:
		BeerExpert model = new BeerExpert();
		// Sending a user form param to the model component:
		List result = model.getBrands(myForm.getColor());
		
		// Forward  to the Results view ( and store the data in the request-scope):
		request.setAttribute("styles", result);
		// The executes method returns an ActionForward to the ActionServlet that 
		// directs Struts to dispatch to the next appropriate view. These symbolic
		// "forwards" are declared in the struts-config.xml file:
		return mapping.findForward("show_results");
	}
}
