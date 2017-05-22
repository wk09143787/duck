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
		System.out.println("这只鸭子是白色的");
	}
	public void swim(){
		System.out.println("这只鸭子的游泳行为");
	}
	
}
