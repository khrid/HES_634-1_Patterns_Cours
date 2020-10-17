package ch.hevs.design_patterns.lab11_ex1;

import ch.hevs.design_patterns.lab11_state_pattern_ex1.context.CoffeeMachine;

/**
 * Lab 11
 * @author scz
 */
public class Program {

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();

        machine.coinInserted(1.0); // Insert wrong amount
        machine.coinInserted(2.2); // Insert right amount
        machine.buttonPushed(); // Make coffee with no money

        machine.coinInserted(2.4); // Insert right amount
        machine.buttonPushed(); // Make coffee right amount
        machine.cupRemoved(); // take the coffee

        machine.coinInserted(5); // Insert right amount
        machine.coinReturn(); // Make coffee right amount

        // Try to make 10 more coffees
        for (int i = 0; i < 10; i++) {
            System.out.println("\n----------------------------------");
            machine.coinInserted(2.2); // Insert right amount
            machine.buttonPushed(); // Make coffee right amount
            machine.cupRemoved(); // take the coffee
        }

        machine.coinInserted(5);
    }
}
