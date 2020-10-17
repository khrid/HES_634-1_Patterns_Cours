package ch.hevs.design_patterns.lab3_decorator_pattern_ex2.decorator;

import ch.hevs.design_patterns.lab3_decorator_pattern_ex2.component.Stay;

public abstract class ServiceDecorator extends Stay {

	public abstract String getDescription();

}
