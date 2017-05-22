package DuckImpl;

import BehaviorImpl.FlyWithRocket;
import BehaviorImpl.Quack;
import Model.Duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
	      quackBehavior = new Quack();
	      flyBehavior = new FlyWithRocket();
	}
	
	public void display(){
		System.out.println("��ֻѼ���ǰ�ɫ��");
	}
	public void swim(){
		System.out.println("��ֻѼ�ӵ���Ӿ��Ϊ");
	}
	
}
