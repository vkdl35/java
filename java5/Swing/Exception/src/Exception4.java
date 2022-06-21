public class Exception4 {

	public static void main(String[] args) {
		try {			
			ex e = new ex();
			e.loader("ok");
			
			/* !-강제오류 : 자기 자신을 바로 예외상황으로 만듬-!
			Exception aaa = new Exception();
			throw aaa;	//throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 class로 return
			*/
		}
		catch (Exception e) {
			if(e.getMessage() != null) {				
				System.out.println(e);
			}
		}
//		catch (IOException e1) {	//리더할 게 없는 상태에선 에러표시 뜸
//			System.out.println(e1);
//		}
		
		/*
		 * 예외Exception을 다른 메소드로 넘길 때, 받는 메소드에 해당 예외Exception를 선언해줘야함. 
		 * 예외처리한 메소드에서 값을 다시 main으로 리턴시 main 메소드에도 throws 해당Exception를 사용해야함
		 * catch(예외Exception)를 사용시 오류나는 이유는 try 안에 해당 문법이나 계산식이 없기 때문 */

	}

}

class ex{
	Exception ep = null;
	//IOException io = null;
	public void loader(String data) throws Exception {	//throws는 try-catch를 받기 위한 class를 로드
		/*잘못된 문법사항 (자신의 오류를 상위 main class에 모두 전달하는 상황임)*/
//		if(data=="ok") {			
//			int keycode = Integer.valueOf(data);	//정상적이지만, loader class 자체적인 오류가 발생
//		}
//		else {
//			/* 예외처리받을 메소드에서 오류나는 경우 해당 메소드에서 try를 사용해서 해당 메소드 오류만 확인할 수 있음 */
//			//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우
//			this.ep = new Exception();
//			throw this.ep;
//			//this.io = new IOException();
//			//throw this.io;	
//			/* throw가 없으면 main try-catch에서 해당 메소드 오류까지 전부 떠버리기 때문에
//			   (main 메소드에서 문제가 없어도 예외처리가 뜨기 때문에 어디서 오류가 난지 확인하기 어려움) */
//		}
		try {
			if(data=="ok") {			
				int keycode = Integer.valueOf(data);	
			}
			else {
				System.out.println("test");
			}
		}
		catch (Exception e3) {
			System.out.println(e3.getMessage());
			//자신의 오류 사항을 리턴 받아서 확인함
			this.ep = new Exception();	
			throw this.ep;
		}
		
	}
}