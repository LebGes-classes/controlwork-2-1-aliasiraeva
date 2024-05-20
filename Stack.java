package stack;

public interface Stack<E> {
    void push(E elem);
    E pop();
    E peek();
    void clear();
}
