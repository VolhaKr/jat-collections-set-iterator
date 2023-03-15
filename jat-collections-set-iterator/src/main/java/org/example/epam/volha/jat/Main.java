package org.example.epam.volha.jat;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    Set<String> names = Stream.of("Tom", "Jane", "Karen")
        .collect(Collectors.toCollection(HashSet::new));

    Iterator<String> namesIterator = names.iterator();

    while(namesIterator.hasNext()) {
      System.out.println(namesIterator.next());
    }

    //since Java 8
    namesIterator.forEachRemaining(System.out::println);

    //Stream since Java8
    names.stream().forEach(System.out::println);

    //more complex example with stream
    String namesJoined = names.stream()
        .map(String::toUpperCase)
        .peek(System.out::println)
        .collect(Collectors.joining("-"));

    System.out.println(namesJoined);
  }
}