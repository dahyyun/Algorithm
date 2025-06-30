import java.io.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 서울 기준 날짜
        LocalDate today = LocalDate.now(ZoneId.of("Asia/Seoul"));

        // 날짜 포맷 지정
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // 포맷 적용
        String formattedDate = today.format(formatter);

        // 출력
        bw.write(formattedDate);

        bw.flush();
        bw.close();
    }
}
