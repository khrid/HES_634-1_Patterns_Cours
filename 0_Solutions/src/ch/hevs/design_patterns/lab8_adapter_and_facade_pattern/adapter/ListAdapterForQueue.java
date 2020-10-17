package ch.hevs.design_patterns.lab8.adapter;

import ch.hevs.design_patterns.lab8.interfaces.MyQueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Lab 8
 * @author scz
 */
public class ListAdapterForQueue<E> implements MyQueue<E> {

	List<E> data;
	
	public ListAdapterForQueue(List<E> data) {
		this.data = data;
	}

	public ListAdapterForQueue() {
		this(new ArrayList<E>());
	}

	public E deQueue() {
		return data.remove(0);
	}

	public void enQueue(E element) {
		data.add(element);
	}

    @Override
    public String toString() {
        return data.toString();
    }

}
