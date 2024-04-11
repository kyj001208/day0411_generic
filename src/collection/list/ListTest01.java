package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add(10);
		list.add(3.14);
		list.add("문자열");

		// System.out.println("크기 : " + list.size());
		// 중간에 삽입 가능, 두번쨰에 10을 넣어라
		
		list.add(1,10);
		System.out.println("크기 : " + list.size());
		
		list.set(0,"문자열");
		
		
		System.out.println("수정 후 크기 : " + list.size());
		
		list.remove(0);
		
		
		System.out.println("삭제 후 크기 : " + list.size());
		
		// 인덱스를 활용하여 데이터를 읽을수 있다

		for (int i = 0; i < list.size(); i++) {

			System.out.println(list.get(i));

		}
		
		Object[]arr=new Object[3];
		arr[0]=10;
		
		Integer a=10;
		Number num=a;
		Object o=num;
		
		Object getData=list.get(0);
		System.out.println();

		
		
	}

}
