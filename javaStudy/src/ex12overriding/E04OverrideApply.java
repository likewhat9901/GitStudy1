package ex12overriding;

public class E04OverrideApply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * err를 사용하면 콘솔에 빨간색으로 표시된다. 주로 디버깅용으로 사용하거나 출력 문장을
		 * 구분할때 사용한다.
		 */
		System.err.println("Child형 참조변수로 Child객체 참조");
		//자식 인스턴스를 자식 참조변수를 통해 참조.(동일한 타입)
		DeChild child =
				new DeChild("율곡이이", 49, "00학번");
		
		child.exercise();
		child.sleep();
		child.printParent();
		child.study();
		child.walk();
		child.walk(25);
//		child.eat(); //에러
		child.sleep();
		DeChild.staticMethod();
		
		System.err.println("Parent형 참조변수로 Child객체 참조");
		/*
		 * 부모타입의 참조변수를 통해 자식 인스턴스를 참조한다. 두 클래스가 상속관계에 있기 때문에
		 * 가능하다.(서로 타입이 틀림)
		 */
		DeParent parent =
				new DeChild("퇴계이황", 35, "99학번");
		
		parent.exercise();
		parent.sleep();
		parent.printParent();
//		parent.study();
		parent.walk();
//		parent.walk(20);
		DeParent.staticMethod();
		
	}
}
