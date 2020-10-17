package ch.hevs.design_patterns.lab8.adapter;

import ch.hevs.design_patterns.lab8.interfaces.MyStack;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 8
 * @author scz
 */
public class ListAdapterForStack<E> implements MyStack<E> {

	List<E> data;
	
	public ListAdapterForStack()
	{
		this(new ArrayList<E>());
	}
	
	public ListAdapterForStack(List<E> data) {
		this.data = data;
	}

	public E pop() {
		E element = data.get(0);
		data.remove(0);
		return element;
	}

	public void push(E element) {
		data.add(0, element);
	}

    @Override
    public String toString() {
        return data.toString();
    }

}
