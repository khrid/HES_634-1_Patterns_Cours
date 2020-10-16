package ex2_algorithms.algorithms;

import ex2_algorithms.component.Component;

import java.util.ArrayList;

public class BFSSearch extends TraversalAlgorithm {
    @Override
    public void addSuccessor(ArrayList<Component> q, ArrayList<Component> s) {
        q.addAll(s);
    }
}
