package no.hvl.dat102.traversering;

public class BinaerNode<T> {
	
	public T data;
	public BinaerNode<T> venstre;
	public BinaerNode<T> hoyre;

	public BinaerNode(T data) {
		this(data, null, null);
	}

	public BinaerNode(T data, BinaerNode<T> venstre, BinaerNode<T> hoyre) {
		this.data = data;
		this.venstre = venstre;
		this.hoyre = hoyre;
	}
}
