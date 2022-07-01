import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.util.Scanner;

public class S_server {
	
	public static void main(String[] args) {
		
		int port = 8003;
		ch c = null;
		c = new ch(port);
		c.start();
		
	}

}
class ch extends Thread {
	ServerSocket server = null;
	BufferedWriter bs = null;
	BufferedReader br = null;
	BufferedReader br1 = null;
	Scanner sc = null;
	public ch(int p) {
		
	}
	@Override
	public void run() {

		try {
	
			
			
		}catch (Exception e) {
			
			
		}
	}
}