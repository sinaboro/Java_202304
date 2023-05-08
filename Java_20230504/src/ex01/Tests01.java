package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface A{
    int max(int a, int b);
}

@FunctionalInterface
interface B{
	   void printVar (String name, int i);
}

interface C {
	   int roll();
}

interface Eee{
	int sumArr(int [] arr);
}

public class Tests01 {

	public static void main(String[] args) {
		
		//1번 ->구본우 
		A aa = (a,b) ->  a>b ? a:b;  //
	    System.out.println(aa.max(1,5));
	    
	    BiFunction<Integer, Integer, Integer> bi = (a, b) -> a>b ? a : b;
	    System.out.println("최대값 : " + bi.apply(11, 5));
	    
	    BiFunction<String, Integer, String> bi2 = 
	    		(name, age) -> "이름은 "+ name+ "이고, 나이는 " + age + "입니다.";
	    String str = bi2.apply("로이", 11);
	    System.out.println(str);
	    
	    //2번 -> 원숙연
	    B b = (name, i)-> System.out.println(name + "=" + i);
	    b.printVar("kim", 20);
	    
	    BiConsumer<String, Integer> bi3 = 
	    		(name, i) -> System.out.println(name + "=" + i);
	    bi3.accept("로이", 11);
	    
	    //4번 -> 김지민
	    C cc = () -> (int)(Math.random()*6);
        System.out.println(cc.roll());
	    
        Supplier<Integer> s1 = () -> (int)(Math.random()*6);
        int num = s1.get();
        System.out.println("s1.get() : " + num);
        
        
        
        //5번 -> 정혜민
        Eee e = arr-> {
		   int sum =0;
		   for( int i : arr)
		      sum += i;
		   return sum;

        };

    	int arr []= {100,20,30,40,50};
    	
    	
    	
    	
    	
    	System.out.println(e.sumArr(arr));
        
    	Function<int[], Integer> f1 = a -> {
        	int sum =0;
 		   for( int i : a)
 		      sum += i;
 		   return sum;
        };
    	
        int num2 = f1.apply(arr);
        System.out.println("num2 : " + num2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
