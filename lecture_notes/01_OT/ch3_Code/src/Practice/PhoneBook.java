package Practice;

import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};

        boolean result = solution(phone_book);

        System.out.println(result);
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book); // 전화번호 정렬

        for (int i = 0; i < phone_book.length - 1; i++) {
            // 현재 번호가 다음 번호의 접두사인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }

        return true;
    }
}
