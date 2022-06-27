import java.net.InetAddress;
import java.net.UnknownHostException;

public class net1 {
	//UnknownHostException : HOST 정보가 확인되지 않을 경우
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress : IPnetworkAddress
		//getByName : 접속할 도메인 주소명
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);
		//System.out.println(ia.getHostName());	//도메인명
		//System.out.println(ia.getHostAddress());	//DNS에 연결된 IP
		
		//InetAddress : 도메인에 IP정보 확인 (배열로 구성해야 합니다.)
		InetAddress ia2[] = InetAddress.getAllByName("nexon.com");
		//System.out.println(ia2[1].getHostAddress());
		//System.out.println(ia2.length);	//해당 DNS에 IP갯수
		int w = 0;
		while(w < ia2.length) {
			System.out.println(ia2[w]);
			w++;
		}
		
	}

}
