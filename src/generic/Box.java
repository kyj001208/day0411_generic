package generic;



//데이터 타입을 파라미터로 전달:타입 파라미터
public class Box<T> {

	private T obj;
	

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
	
	
	
}


