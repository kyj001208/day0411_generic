package generic;

import object.Apple;

public class BoxExam {

	public static void main(String[] args) {
		
		Box<Apple> box=new Box<>();
		
		box.setObj(new Apple("충주 사과"));
		
		//캐스팅 없이 사용 가능
	    Apple apple=box.getObj();
	    System.out.println(apple.brand);
	
	}

}
