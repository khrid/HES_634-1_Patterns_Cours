package ch.hevs.design_patterns.lab11_state_pattern_ex1.state;

/**
 * Lab 11
 * @author scz
 */
public interface State {

    void coinInserted();
    void coinReturn();
    void rightAmountEntered();
    void buttonPushed();
    void cupRemoved();
    void problemDetected();
    void resetButton();
}
