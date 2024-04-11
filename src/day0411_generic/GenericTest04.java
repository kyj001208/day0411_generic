package day0411_generic;

//T는 아직 확정되지 않는 데이터타입 
class Box2<T> {

	T obj;

	public Box2(T obj) {
		this.obj = obj;
	}
}

public class GenericTest04 {

	public static void main(String[] args) {

		Box2<String> box = new Box2<>("문자열");
		
		
		
		// 타입파라미터는 class타입만 허용
		Box2<Integer> box2 = new Box2<>(10);
	}

}
