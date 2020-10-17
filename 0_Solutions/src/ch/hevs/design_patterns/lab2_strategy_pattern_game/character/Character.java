package ch.hevs.design_patterns.lab2_strategy_pattern_game.character;

import ch.hevs.design_patterns.lab2_strategy_pattern_game.weapon.WeaponBehavior;

/**
 * Lab 1
 *
 * @author scz
 */
public abstract class Character {

    private WeaponBehavior weapon = null;

    public void fight() {
        if (this.weapon == null) {
            System.out.println("no weapon for this caracter");
        } else {
            this.weapon.useWeapon();
        }
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
