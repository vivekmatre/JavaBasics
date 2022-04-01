package OOPSConcepts;

public class CallByValueAndCallByRef {
	int m=10;
	int n=20;
	int s=50;
	int d=70;
	public static void main(String[] args) {

		
		CallByValueAndCallByRef obj = new CallByValueAndCallByRef();
		
		int x = 10;
		int y = 20;
		int z = obj.sum(x, y);
		
		System.out.println("Calculated Sum by Call by Value is : "+z);
		
		int s,d;
		//obj.m=10;
		//obj.n=20;
		obj.swap(obj,obj,obj,obj);

	}
		public int sum(int a, int b) {
			int c=a+b;
			return c;
			
		}
		
		public void swap(CallByValueAndCallByRef t1, CallByValueAndCallByRef t2,CallByValueAndCallByRef t3,CallByValueAndCallByRef t4) {
			
			int t5 = t1.s+t2.d+t3.m+t4.n;
			System.out.println("Calculated Sum by Call by Ref : " +t5);
			
			
		}
}
