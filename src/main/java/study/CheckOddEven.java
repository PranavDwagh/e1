package study;

public class CheckOddEven {
	/*
	public static void main(String[] args) {
		
		System.out.println("!!!....Result :"+checkOddEven(22)+"....!!!");
		
	}*/
	public static boolean checkOddEven(int num)
	{
		return num%2 == 0;
	}
	
	public static boolean checkThreeDivisibility(int num)
	{
		boolean res = (num%3==0);
		return res;
	}
}
