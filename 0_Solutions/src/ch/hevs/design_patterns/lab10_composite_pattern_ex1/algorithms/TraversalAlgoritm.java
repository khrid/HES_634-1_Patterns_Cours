package ch.hevs.design_patterns.lab10_composite_pattern_ex1.algorithms;

import ch.hevs.design_patterns.lab10_composite_pattern_ex1.component.Component;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public abstract class TraversalAlgoritm {

    public final Component search(Component startingNode, String searchedValue) {
        ArrayList<Component> q = new ArrayList<Component>();
        q.add(startingNode);

        while (!q.isEmpty()) {
            Component n = q.get(0);
            q.remove(0);
            System.out.println(n.getName() + " visited");
            if (isASolution(n, searchedValue)) {
                return n;
            } else {
                ArrayList<Component> s = n.getChildren();
                addSuccessors(q, s);
            }
        }
        return null;
    }

    private boolean isASolution(Component c, String searchedValue) {
        return c.getName() == searchedValue;
    }

    //Abstract method returning a list of nodes for the next treatment.
    protected abstract void addSuccessors(ArrayList<Component> q, ArrayList<Component> s);
}
