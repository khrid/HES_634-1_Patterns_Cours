package ex2_algorithms.algorithms;

import ex2_algorithms.component.Component;

import java.util.ArrayList;

public abstract class TraversalAlgorithm {
    public final Component search(Component startingNode, String target) {

        ArrayList<Component> q = new ArrayList<>();
        q.add(startingNode);
        while (!q.isEmpty()) {
            Component n = q.remove(0);
            if (n.getName() == target) {
                return n;
            } else {
                ArrayList<Component> s = n.getChildren();
                addSuccessor(q, s);
            }
        }
        return null;
    }

    public abstract void addSuccessor(ArrayList<Component> q, ArrayList<Component> s);
}
