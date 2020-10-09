package ex1_football.composite;

import ex1_football.component.TeamComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Composite
 */
public class Team extends TeamComponent {
    ArrayList<TeamComponent> teamComponents = new ArrayList<>();

    @Override
    public void add(TeamComponent teamComponent) {
        teamComponents.add(teamComponent);
    }

    @Override
    public void remove(TeamComponent teamComponent) {
        teamComponents.remove(teamComponent);
    }

    @Override
    public TeamComponent getChild(int i) {
        return teamComponents.get(i);
    }

    @Override
    public void cry() {
        Iterator<TeamComponent> iterator = teamComponents.iterator();
        while (iterator.hasNext()) {
            TeamComponent teamComponent = iterator.next();
            teamComponent.cry();
        }
    }

    @Override
    public void enterField() {
        Iterator<TeamComponent> iterator = teamComponents.iterator();
        while (iterator.hasNext()) {
            TeamComponent teamComponent = iterator.next();
            teamComponent.enterField();
        }
    }

    @Override
    public void simulateInjury() {
        Iterator<TeamComponent> iterator = teamComponents.iterator();
        while (iterator.hasNext()) {
            TeamComponent teamComponent = iterator.next();
            teamComponent.simulateInjury();
        }
    }

    @Override
    public void shoot() {
        Iterator<TeamComponent> iterator = teamComponents.iterator();
        while (iterator.hasNext()) {
            TeamComponent teamComponent = iterator.next();
            teamComponent.shoot();
        }
    }
}
