package muneca;

import java.util.Stack;

public class Pila {
    private Stack<Muneca> pila;

    public Pila() {
        pila = new Stack<>();
    }

    public void push(Muneca m) {
        pila.push(m);
    }

    public Muneca pop() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }

    public Muneca peek() {
        if (!pila.isEmpty()) {
            return pila.peek();
        }
        return null;
    }

    public boolean isEmpty() {
        return pila.isEmpty();
    }

    public int size() {
        return pila.size();
    }
}