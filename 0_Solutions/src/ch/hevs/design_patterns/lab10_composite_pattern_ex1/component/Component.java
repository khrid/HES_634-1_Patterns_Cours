package ch.hevs.design_patterns.lab10_composite_pattern_ex1.component;

import java.util.ArrayList;

/**
 * Lab 10
 * @author scz
 */
public abstract class Component {

    public abstract String getName();

    public void add(Component c) {
        throw new UnsupportedOperationException();
    }

    public void remove(Component c) {
        throw new UnsupportedOperationException();
    }

    public Component getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public ArrayList<Component> getChildren() {
        throw new UnsupportedOperationException();
    }
}
