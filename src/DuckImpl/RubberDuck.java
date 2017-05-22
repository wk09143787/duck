package DuckImpl;

import BehaviorImpl.FlyWithWings;
import BehaviorImpl.Squeak;
import Model.Duck;

public class RubberDuck extends Duck {

	public RubberDuck() {
	    quackBehavior = new Squeak();
	    flyBehavior = new FlyWithWings();
	}
	
	public void display(){
		System.out.println("��ֻѼ���ǻ�ɫ��");
	}
	public void swim(){
		System.out.println("��ֻѼ�ӵ���Ӿ��Ϊ");
	}
}
