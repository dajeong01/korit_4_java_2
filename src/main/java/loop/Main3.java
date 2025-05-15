package loop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {

        // 중복된 단어를 제거하고 출력하시오
        List<String> words = List.of("apple", "banana", "apple", "grape", "banana");
        List<String> differentWord = new ArrayList<>();

        for (String word : words) {
            if (differentWord.contains(word)) {
                continue;
            }
            differentWord.add(word);
        }
        System.out.println(differentWord);

        // set 쓰는 방법(근데 순서가 달라짐)
//        Set<String> answer = new HashSet<>();
//        answer.addAll(words);
//        System.out.println(answer);
    }
}
