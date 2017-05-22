package Test;

import DuckImpl.FireDuck;
import DuckImpl.MallardDuck;
import DuckImpl.RubberDuck;
import Model.Duck;

public class DuckSimulator {

	public static void main(String[] args) {
		
		System.out.println("��һֻѼ�ӣ�");
		Duck mallard = new MallardDuck();
	    mallard.performQuack();
	    mallard.performFly();
	    
	    System.out.println("�ڶ�ֻѼ�ӣ�");
	    mallard = new FireDuck();
	    mallard.performQuack();
	    mallard.performFly();
	    
	    System.out.println("����ֻѼ�ӣ�");
	    mallard = new RubberDuck();
	    mallard.performQuack();
	    mallard.performFly();
		
	}

}
