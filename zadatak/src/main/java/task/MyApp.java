package task;

import java.util.Map;
import java.util.TreeMap;

public class MyApp {
   public static void main(String[] args) {
      if (args.length != 1) {
         System.out.println("Invalid argument structure");
         return;
      }

      Map<Character, Long> data = new TreeMap<>();
      for (char c : args[0].toLowerCase().toCharArray()) {
         if (c >= 'a' && c <= 'z') {
            if (data.isEmpty() || !data.containsKey(c)) {
               data.put(c, 1L);
            } else {
               long value = data.get(c);
               data.put(c, ++value);
            }
         }
      }
      System.out.println("Counted letters:");
      for (Map.Entry<Character, Long> entry : data.entrySet()) {
         System.out.println(entry.getKey() + " = " + entry.getValue());
      }
   }
}
