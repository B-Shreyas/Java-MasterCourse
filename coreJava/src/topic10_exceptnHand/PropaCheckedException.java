package topic10_exceptnHand;

import java.io.FileInputStream;
import java.io.IOException;

public class PropaCheckedException {

	public void task1() throws IOException {
		task2();
	}

	public void task2() throws IOException {
		// task3();
	}

	@SuppressWarnings("resource")
	public void task3() throws Exception {
		FileInputStream fin = null;
		fin = new FileInputStream("/home/shri/Desktop/Literature2.txt");
		int ch;
		ch = fin.read();
		while (ch != -1) {
			System.out.println((char) ch);
			ch = fin.read();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropaCheckedException o = new PropaCheckedException();
		try {
			o.task1();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
