public class ASampleClsUser {
	public static void main(String[] args) {
		//obj1 is a reference to ASampleCls object
		//obj1 is an instance of ASampleCls
		//new keyword is used to instantiate a class
		ASampleCls obj1 = new ASampleCls();
		obj1.doSomething();
		obj1.doSomethingElse();
		System.out.println(obj1.i);
	}
}