import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        sc.nextLine(); 

        Set<String> wordSet = new HashSet<>();
        
        for (int i = 0; i < N; i++) {
            wordSet.add(sc.nextLine());
        }

        List<String> wordList = new ArrayList<>(wordSet);

        Collections.sort(wordList, (a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
            return a.length() - b.length(); 
        });

        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
