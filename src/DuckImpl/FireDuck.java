package DuckImpl;

import BehaviorImpl.FlyNoWay;
import BehaviorImpl.MuteQuack;
import Model.Duck;

public class FireDuck extends Duck {

	public FireDuck() {
	    quackBehavior = new MuteQuack();
	    flyBehavior = new FlyNoWay();
	}
	
	public void display(){
		System.out.println("��ֻѼ���ǻ�ɫ��");
	}
	public void swim(){
		System.out.println("��ֻѼ�ӵ���Ӿ��Ϊ");
	}
}
