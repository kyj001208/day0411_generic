package day0411_generic;

class Box01{
	
	Object a;
	
	
}

class Super{}
class Sub extends Super{}

public class GenericTest02 {
	
	public static void main(String[] args) {
		
		
		Object obj=null;
		obj=10;
		obj=3.14;
		
		int a=10; 
		
		Integer Obj =new Integer(10); //현재는 허용하지만 추후에는 없어질수도 있어요
		
		Integer Obj2 =Integer.valueOf(10);
		
		
		//자바 1.5버전 부터 오토박싱,오토언박싱 제공
		
		Integer Obj3=1000; //오토박싱 : 정수 리터럴이 Integer 객체로 자동 변환
		int num=Obj3; //오토언박싱: Integer 객체에서 해당 기본 자료형 값으로 자동 변환
	
		
		//Wrap 클래스-기본 데이터 타입 객체로 다루기 위해 사용되는 클래스 
		//자바는 순수한 객체 지향 언어지만, 효율성가 성능을 위해 기본 데이터 타입을 제공합니다.
		//그러나 프로그래밍을 하다보면 기본 타입의 데이터도 객체로 다뤄야 할 필요가 종종 
		Integer intObj;
		Short shortObj;
		Byte byteobj;
		Long longobj;
		Boolean boolObj;
		Character charobj;
		Double doubleobj;
		Float floatObj;
		
		
		
		Super su=new Sub();
		//Object su=new Sub();
		Sub sub=(Sub)su;
		
		
		
		
		//모든 클래스는 objest 타입으로 박싱이 가능하다.
		//언박싱 하려면 캐스팅하여 진행 -----> 오토언방식을 지원해주지 않는다		
		
		//Generic을 쓰면 캐스팅코드가 필요 없음
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
