package object;

public class BoxTest {

	public static void main(String[] args) {
	
		Box box=new Box();
		//Object obj=new Apple();
		//box.setObj(obj)
		box.setObj(new Apple("곡성 사과"));
	

		//Object obj=box.getObj();
		//Apple apple=(Apple) obj;
		Apple apple=(Apple)box.getObj();
		
		//언박싱할때 캐스팅이 필요한데 잘못된 캐스팅도 체크 못해줌
		System.out.println(apple.brand);
	}

}
