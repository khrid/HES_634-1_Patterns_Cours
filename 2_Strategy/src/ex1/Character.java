package ex1;

import ex1.behaviors.AxeBehavior;
import ex1.behaviors.WeaponBehavior;

public abstract class Character {
    WeaponBehavior wp = new AxeBehavior();
    //public abstract void fight();

    public void fight() {
        wp.useWeapon();
    }

    public void setWeapon(WeaponBehavior wp) {
        this.wp = wp;
    }
}
