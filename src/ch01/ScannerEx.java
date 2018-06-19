package ch01;
import java.io.PrintStream;
import java.util.*;


/**
 * Created by kirk on 2018. 6. 19..
 */
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리 정수를 하나 입력해주세요.> ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d%n", num);
    }
}
