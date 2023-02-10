import java.util.*;

import static java.util.Arrays.*;

public class Utils {


    public static String printEqualStrings(String[] args) {

        HashMap<List<String>, ArrayList<Integer>> hashMap = new HashMap<>();

        for (int i = 0; i < args.length; i++) {
            List<String> letters = new ArrayList<>(asList(args[i].split("")));
            Collections.sort(letters);
            if (hashMap.get(letters) != null) {
                hashMap.get(letters).add(i);
            } else {
                hashMap.put(letters, new ArrayList<Integer>(asList(i)));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<List<String>, ArrayList<Integer>> entry : hashMap.entrySet()) {
            if (entry.getValue().size() > 1) {
                sb.append(entry);
            }
        }
        System.out.print(sb);
        return sb.toString();
    }
}
