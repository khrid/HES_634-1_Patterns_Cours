package ch.hevs.design_patterns.lab2_strategy_pattern_game.character;

import ch.hevs.design_patterns.lab2_strategy_pattern_game.weapon.AxeBehavior;

/**
 * Lab 1
 * @author scz
 */
public class Troll extends Character {
    
    public Troll() {
        System.out.println("[character.Troll]");
        this.setWeapon(new AxeBehavior());
    }
}
