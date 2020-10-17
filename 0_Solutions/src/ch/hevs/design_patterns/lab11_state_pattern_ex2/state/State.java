package ch.hevs.design_patterns.lab11_state_pattern_ex2.state;

/**
 * Lab 11
 * @author scz
 */
public interface State {
	State leave();
	State enter();
	State ask();
	State over();
	State handover();
}
