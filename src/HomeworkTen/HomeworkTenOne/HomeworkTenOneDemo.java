package HomeworkTen.HomeworkTenOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomeworkTenOneDemo {

    public static void main(String[] args) {

        String text = "London is the capital of Great Britain, its political, economic and cultural centre. " +
                "It's one of the largest cities in the world. Its population is more than million people. " +
                "London is situated on the river Thames. The city is very old and beautiful. It was founded more " +
                "than two thousand years ago. Traditionally London is divided into several parts: the City, " +
                "the West End, the East End and Westminster.";

        Set<String> hashSetList = new HashSet<>(Arrays.asList(HomeworkTenOne.textWithoutPunctuationMarks(text).split(" ")));
        System.out.println(hashSetList.toString());
        System.out.println("Количество различных слов в тексте: " + hashSetList.size());
        System.out.println();

        List<String> arrayList = new ArrayList<>(Arrays.asList(HomeworkTenOne.textWithoutPunctuationMarks(text).split(" ")));
        System.out.println("Общее количество слов в тексте: " + arrayList.size());
        System.out.println();

        quantityOfUniqueWords(hashSetList, arrayList);
    }

    private static void quantityOfUniqueWords(Set<String> hashSetList, List<String> arrayList) {
        for (int i = 0; i < hashSetList.size(); i++) {
            String[] uniqueWords = hashSetList.toArray(new String[hashSetList.size()]);
            int size = arrayList.size();
            while (arrayList.contains(uniqueWords[i])) {
                arrayList.remove(uniqueWords[i]);
            }
            int quality = size - arrayList.size();
            System.out.println("Слово " + uniqueWords[i] + " встречается " + quality + " раз");
        }
    }
}