package ch.hevs.design_patterns.lab10_composite_pattern_ex1.algorithms;

import ch.hevs.design_patterns.lab10_composite_pattern_ex1.component.Component;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public class DFSSearch extends TraversalAlgoritm {

    //Overrided method (q = s+q).
    protected void addSuccessors(ArrayList<Component> q, ArrayList<Component> s) {
        q.addAll(0, s);
    }
}
