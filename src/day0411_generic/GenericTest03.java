package day0411_generic;

import java.util.ArrayList;
import java.util.List;

class Box {

	Object obj;

	int disp() {
		return (int) obj + 10;
	}

	public Box(Object obj) {
		this.obj = obj;
	}
}

class IntBox {

	int obj;

}

class DoubleBox {

	Double obj;

}

public class GenericTest03 {

	public static void main(String[] args) {

		// List<String> list=new ArrayList<>(); 만능주머니: 특정 데이터만 담는다는 의미/뒤에 String은 생략가능
		// <타입> : 타입파라미터

		List<String> list = new ArrayList<>();

		int[] arr = new int[3];
		// Object >Integer >10
		Object aa = 10;
		Box box = new Box(10);
		System.out.println(box.disp());
		
		Box box1 = new Box(3.14);
		//System.out.println(box1.disp());
		//Object는 모든 타입을 담을수(오토박싱)있지만 언박싱하여 사용하려면 캐스팅이 필요하지만 캐스팅은 안에 있는 내용에따라 매번 다르게 구현해야한다.
		
	}

}
