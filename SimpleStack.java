package stack;

import lists.LinkedListElement;

import java.util.EmptyStackException;

public class SimpleStack<E> implements Stack<E> {
    private LinkedListElement<E> currentElem = null;

    @Override
    public void push(E elem) {
        LinkedListElement<E> newElem = new LinkedListElement<>(elem);
        if (!isEmpty()) {
            currentElem.setNextElem(newElem);
            newElem.setPreviousElem(currentElem);
        }
        currentElem = newElem;
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        LinkedListElement<E> elem = currentElem;
        currentElem = currentElem.getPreviousElem();
        if (currentElem != null) {
            currentElem.setNextElem(null);
        }
        return elem.getElem();
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return currentElem.getElem();
    }

    @Override
    public void clear() {
        currentElem = null;
    }

    private boolean isEmpty() {
        return (currentElem == null);
    }
}
