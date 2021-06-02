package fp.daw.exprog20210602.ejercicio3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(2);
		q.offer(13);
		q.offer(-42);
		q.offer(21);
		q.offer(4);
		q.offer(9);
		q.offer(14);
		q.offer(-3);
		q.offer(11);
		q.offer(5);

		System.out.println(q);
		System.out.println(invertir(4, q));
	}

	private static Deque<Integer> invertir(int n, Queue<Integer> q) {
		Deque<Integer> aux = null;
		try {
			if (!q.isEmpty() && q.size()>n) {
				aux = new LinkedList<Integer>();
				for (int i = 0; i < n; i++) {
					aux.push(q.poll());
				}
				aux.addAll(q);
			} else {
				throw new IllegalArgumentException("");
			}
		} catch (IllegalArgumentException e) {
			if (!q.isEmpty()) {
				System.out.println("La no tiene " + n + " elementos");
			} else {
				System.out.println("La cola es nula. q= " + q);
			}
		}
		return aux;

	}

}
