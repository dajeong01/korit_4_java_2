package loop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {

        // 문자열의 길이가 5이상인 단어
        List<String> words = List.of("apple", "cat", "banana", "dog", "grapes");

        List<String> moreFiveWordList = new ArrayList<>();
        for (String data : words) {
            if (data.length() > 4) moreFiveWordList.add(data);
        }
        System.out.println(moreFiveWordList.size());

    }
}
