package ch.hevs.design_patterns.lab10_composite_pattern_ex1.leaf;

import ch.hevs.design_patterns.lab10_composite_pattern_ex1.component.Component;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public class Leaf extends Component {

    private final String name;

    public Leaf(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Leaf " + name;
    }

    @Override
    public ArrayList<Component> getChildren() {
        return new ArrayList<Component>();
    }
}
