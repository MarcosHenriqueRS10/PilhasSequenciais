package pilhas;

public class PilhaInt {
	
	public final int N=6;
	int dados[] = new int[N];
	int topo;
	
	
	public void init() {
		topo=0;
	}
	
	public boolean isFull() {
		if (topo == N)
			return (true);
		else
			return (false);
	}
	
	public void push(int elem) {
		if(isFull())
			System.out.println("Stack OverFlow");
		else {
		dados[topo] = elem;
		topo++;
		}
	}
	
	public boolean isEmpty() {
		if (topo == 0)
			return (true);
		else
			return (false);
	}
	
	public int pop() {
		topo--;
		return(dados[topo]);
	}
	
	public int top() {
		return (dados[topo - 1]);	
	}
	
	public void esvaziar() {
		while (!isEmpty())  
			System.out.println(" "+ pop());
	}

}
