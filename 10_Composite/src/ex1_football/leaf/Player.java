package ex1_football.leaf;

import ex1_football.component.TeamComponent;

/**
 * Leaf
 */
public class Player extends TeamComponent {
    int id;

    public Player(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void enterField() {
        System.out.println("Player "+id+" is now playing...");
    }

    @Override
    public void shoot() {
        System.out.println("Player "+id+" kicks the ball...");
    }

    @Override
    public void cry() {
        System.out.println("Player "+id+" is crying...");
    }

    @Override
    public void simulateInjury() {
        System.out.println("Player "+id+" is hurt... maybe...");
    }
}
