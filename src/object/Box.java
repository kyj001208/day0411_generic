package object;

public class Box {
	
	private Object obj; //모든 클래스의 최상위 클래스:모든 객체의 부모타입
	
	public void setObj(Object obj) {
		
		this.obj=obj;
	}
	
	public Object getObj() {
		
		return obj;
	}

}
