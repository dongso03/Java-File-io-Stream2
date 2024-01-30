import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		// try-resource
		try (PrintWriter pw = new PrintWriter("filename.txt")) {
			pw.println("문자열출력");
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			System.out.println("필요한 추가 작업이 있다면 finally 블럭 구성이 가능");
		}
	}
}
