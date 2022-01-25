package test.mypac;

public class FruitBox<T> {
	//<a> 클래스안에서의 특정 타입을 지정할때 쓴다 
	public T item;
	
	public void setItem(T item) {
		this.item=item;
	}
	
	public T getItem() {
		
		return this.item;
	}
}
