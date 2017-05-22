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
		System.out.println("这只鸭子是灰色的");
	}
	public void swim(){
		System.out.println("这只鸭子的游泳行为");
	}
}
