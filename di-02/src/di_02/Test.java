package di_02;

import di_02.log.MyLog;
import di_02.log.MyLogFile;

public class Test {

	public static void main(String[] args) {
		MyLog ml = new MyLog();
		ml = new MyLogFile();
		// 부모타입 변수 = new 자식타입() -> 객체의 다형성  
		
	}

}
