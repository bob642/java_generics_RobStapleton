package csci3444.generics;

public class MainEntry {

	public static void main(String[] args) {


	       MyGenInterface<Integer, String> mgi1;

	       MyGenInterface<Integer, Integer> mgi2;

	       mgi1 = new MyGenClass<>(1, "Rob");
	       mgi2 = new MyGenClass<>(1, 2017);

	       Integer i1 = MyRegularClass.getSum(10, 20);
	       Float f1 = MyRegularClass.getSum(100f, 200f);

	       System.out.println("mgi1 Key: " + mgi1.getKey() + ", Value: " + mgi1.getValue());
	       System.out.println("mgi2 Key: " + mgi2.getKey() + ", Value: " + mgi2.getValue());

	       System.out.println("i1: " + i1);
	       System.out.println("f1: " + f1);

	   }
}
