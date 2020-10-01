package ex1;

import ex1.behaviors.AxeBehavior;
import ex1.behaviors.WeaponBehavior;

public class King extends Character{

    public King() {
        wp = new AxeBehavior();
    }

    public void fight() {
        super.fight();
        System.out.println("A king shall protects its people");
        //wp.useWeapon(); pas nécessaire car existe déjà dans le Character
    }
}
