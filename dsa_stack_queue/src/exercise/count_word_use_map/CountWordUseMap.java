package exercise.count_word_use_map;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CountWordUseMap {
    public static void main(String[] args) {
        String str = "Nếu có đẩy key này vào map và tăng " +
                "value lên 1 Nếu key này chưa " +
                "có trong map thì đẩy key vào map mặc định gán value là 1";

        Map<String, Integer> hashMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = hashMap.get(word);

            if (integer == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}