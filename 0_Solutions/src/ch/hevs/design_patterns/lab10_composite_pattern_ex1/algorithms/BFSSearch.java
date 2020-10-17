package ch.hevs.design_patterns.lab10_composite_pattern_ex1.algorithms;

import ch.hevs.design_patterns.lab10_composite_pattern_ex1.component.Component;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public class BFSSearch extends TraversalAlgoritm {
	
	//Overrided method (q = q+s).
	protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s)
	{
            q.addAll(s);
	}		
}
