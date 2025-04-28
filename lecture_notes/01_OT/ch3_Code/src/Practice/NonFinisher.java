package Practice;

import java.util.Arrays;

public class NonFinisher {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }

        // for문 끝나도 못 찾으면 마지막 참가자가 완주하지 못한 선수
        return participant[participant.length - 1];
    }

    public static void main(String[] args) {
        NonFinisher nf = new NonFinisher();

        // 테스트 1
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        System.out.println("완주하지 못한 선수: " + nf.solution(participant1, completion1));
        // 기대 출력: leo

        // 테스트 2
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        System.out.println("완주하지 못한 선수: " + nf.solution(participant2, completion2));
        // 기대 출력: vinko

        // 테스트 3
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        System.out.println("완주하지 못한 선수: " + nf.solution(participant3, completion3));
        // 기대 출력: mislav
    }
}
