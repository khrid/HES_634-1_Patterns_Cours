package ch.hevs.design_patterns.lab11_state_pattern_ex2;

import ch.hevs.design_patterns.lab11_state_pattern_ex2.context.Person;

/**
 * Lab 11
 * @author scz
 */
public class Discussion {

	public static void main(String[] args) {
		Person jean = new Person();
		jean.enter();
		jean.leave();
		jean.ask();
		jean.enter();
		jean.ask();
		jean.leave();
		jean.enter();
		jean.ask();
		jean.handOver();
		jean.over();
		jean.leave();
	}
}
