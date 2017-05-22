package Test;

import DuckImpl.FireDuck;
import DuckImpl.MallardDuck;
import DuckImpl.RubberDuck;
import Model.Duck;

public class DuckSimulator {

	public static void main(String[] args) {
		
		System.out.println("第一只鸭子：");
		Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();
	    
	    System.out.println("第二只鸭子：");
	    mallard = new FireDuck();
	    mallard.performQuack();
	    mallard.performFly();
	    
	    System.out.println("第三只鸭子：");
	    mallard = new RubberDuck();
	    mallard.performQuack();
	    mallard.performFly();
		
	}

}
