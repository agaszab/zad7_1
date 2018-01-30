import java.util.Scanner;

public class ConverterTest {
    public static void main(String[] args) {
        String day;

        for (int i=1; i<8; i++) {
          day= CalandarConverter.convertDayToString(i);
          System.out.println(i+ " dzień tygodnia to "+day);
        }
    }
}
