package ex1;

import ex1.behaviors.BowAndArrowBehavior;
import ex1.behaviors.KnifeBehavior;
import ex1.behaviors.SwordBehavior;

public class StrategyEx1Main {
    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character troll = new Troll();
        Character knight = new Knight();

        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        queen.fight();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();

        troll.fight();
        troll.setWeapon(new KnifeBehavior());
        troll.fight();

        knight.fight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }
}
