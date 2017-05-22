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
		System.out.println("这只鸭子是黄色的");
	}
	public void swim(){
		System.out.println("这只鸭子的游泳行为");
	}
}
