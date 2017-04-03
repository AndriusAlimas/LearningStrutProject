package com.andrius.project.LearningStrutProject.model;
import java.util.*;

public class BeerExpert {

	// that passed color to argument it will choose and add some brands name (String)
	// in the List and it will retrieve this list to the caller object: 
	public List getBrands(String color){
		List brands = new ArrayList();
		
		if(color.equals("amber")){
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}else{
			brands.add("Jail Pale Ale");
			brands.add("Gout Stout");
		}
		return brands;
	}
}
