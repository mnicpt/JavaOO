import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingTest {

  public static void main(String[] args) {
    // create a List, then sort it
    List<String> names = new ArrayList<String>();
    names.add("Tina");
    names.add("Jason");
    names.add("Linda");
    System.out.println("Names unsorted:");
    for (String name : names) {
      System.out.println(name);
    }
    
    Collections.sort(names);
    System.out.println("\nNames sorted:");
    for (String name : names) {
      System.out.println(name);
    }
    
    // create a SortedSet, which maintains order at all times
    Collection<Integer> scores = new TreeSet<Integer>();
    scores.add(90);
    scores.add(66);
    scores.add(75);
    System.out.println("\nScores sorted:");
    for (int score : scores) {
      System.out.println(score);
    }
    
    // create a SortedMap, which maintains order (of keys) at all times
    Map<Date, String> events = new TreeMap<Date, String>();
    events.put(Date.valueOf("2012-01-18"), "Seattle snowstorm");
    events.put(Date.valueOf("2000-02-20"), "Move to NYC");
    events.put(Date.valueOf("1966-12-06"), "Birth");
    events.put(Date.valueOf("2005-12-07"), "Wedding");
    System.out.println("\nEvents sorted:");
    Set entries = events.entrySet();
    for (Object entry : entries) {
      System.out.println(entry);
    }
  }
}