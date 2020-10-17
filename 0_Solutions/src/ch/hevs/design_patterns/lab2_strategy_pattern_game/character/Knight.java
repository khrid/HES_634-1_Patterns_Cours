package ch.hevs.design_patterns.lab2_strategy_pattern_game.character;

import ch.hevs.design_patterns.lab2_strategy_pattern_game.weapon.SwordBehavior;

/**
 * Lab 1
 * @author scz
 */
public class Knight extends Character {
    
    public Knight() {
        System.out.println("[character.Knight]");
        this.setWeapon(new SwordBehavior());
    }
}
