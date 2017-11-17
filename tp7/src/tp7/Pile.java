package tp7;

public class Pile<T> {
	private T data;
	private Pile<T> next;

	private Pile(T data, Pile<T> next) {
		this.data = data;
		this.next = next;
	}

	public void push(T data) {
		Pile newPile = new Pile(data, this.next);
		this.next = newPile;
	}

	public Pile() {
		data = null;
		next = null;
	}

	public T peek() {
		if (next == null) {
			return null;
		}
		return next.data;
	}

	public T pop() {
		if (next == null) {
			return null;
		}
		T var = next.data;
		this.next = next.next;
		return var;
	}

	public int count1() {
		if (next == null) {
			return 0;
		} else {
			return 1 + next.count1();
		}
	}

	public int count2() {
		int i = 0;
		Pile<T> tempNext = next;
		while (tempNext != null) {
			tempNext = tempNext.next;
			i++;
		}
		return (i);
	}
}
