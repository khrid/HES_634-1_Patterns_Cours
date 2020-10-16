package ex2_algorithms.algorithms;

import ex2_algorithms.component.Component;

import java.util.ArrayList;
import java.util.List;

public class DFSSearch extends TraversalAlgorithm {
    @Override
    public void addSuccessor(ArrayList<Component> q, ArrayList<Component> s) {
        q.addAll(0, s);
    }
}
