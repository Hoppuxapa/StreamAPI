package com.kravchuk;


import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {


//        Stream<String> streamEmpty = Stream.empty();
//
//        Collection<Integer> collection = Arrays.asList(1, 2, 3);
//
//        collection.stream().filter(x->x>1).forEach(System.out::print);
//
//        collection.stream().forEach(System.out::print);
//
        Collection<String> collection2 = Arrays.asList("a1", "a2", "a3");

        System.out.println(collection2.stream().filter(x -> x.equals("a1")).findFirst().get());

        collection2.stream().forEach(System.out::print);


//        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
//
//        String[] array = {"a1", "a2", "a3"};
//        Stream<String> streamFromArrays = Arrays.stream(array);
//
//        Stream.builder().add("a1").add("a2").add("a3").build();


//        Stream<Integer> stream;
//        Stream.generate(() -> 100).forEach(System.out::print);
//        collection.stream().reduce((s1, s2) -> s1 + s2).orElse("10"); (???) (Позволяет выполнять агрегатные функции
//                                                                             на всей коллекцией и возвращать один результат)
//        collection.stream().forEach(System.out::print);
//        collection.stream().map((s) -> s + "_g").collect(Collectors.toList()).forEach(System.out::print);
//        collection.stream().map(String::toUpperCase).peek((e) -> System.out.print(e + ",")).
//                collect(Collectors.toList());
/*

        Collection<People> peoples = Arrays.asList(
                new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN),
                new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN)
        );
        Collection<People> bySexAndAge = peoples.stream().sorted((o1, o2) -> o1.getSex() != o2.getSex() ? o1.getSex().
                compareTo(o2.getSex()) : o1.getAge().compareTo(o2.getAge())).collect(Collectors.toList());
        System.out.println("bySexAndAge = " + bySexAndAge);

        Collection<People> byName = peoples.stream().sorted((o1,o2) -> -o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
        Collection<People> byNameReverse = peoples.stream().sorted()
        System.out.println("byName = " + byName);*/


//        Collection<String> collection = Arrays.asList("a1", "b2", "c3", "a1");
//        Map<String, String> map = collection
//                .stream()
//                .distinct()
//                .collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
//        System.out.println("map = " + map);
//
//        Map<String, List<String>> groups = collection.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
//        System.out.println("groups = " + groups);

//        IntStream intStream = IntStream.range(1, 10);
//        LongStream longStream = LongStream.rangeClosed(1, 10);
//
//        intStream.forEach(System.out::print);
//
//        longStream.forEach(System.out::println);
//
//        int reducedParams = Stream.of(1, 2, 3)
//                .reduce(10, (a, b) -> a + b, (a, b) -> {
//                    return a + b;
//                });
//
//        System.out.println(reducedParams);
//
//
//
//        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
//                .reduce(10, (a, b) -> a + b, (a, b) -> {
//                    return a + b;
//                });
//
//        System.out.println(reducedParallel);
//
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .flatMap(x -> {
//                    switch (x % 9) {
//                        case 0:
//                            return Stream.of(x, x*x, x*x*3);
//                        case 1:
//                            return Stream.of(x);
//                        case 2:
//                        default:
//                            return Stream.empty();
//                    }
//                })
//                .forEach(System.out::println);
//


     /*   Stream.of(120, 410, 85, 32, 314, 12)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        Stream.of(120, 410, 85, 32, 314, 12)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
*/


    /*    List list = new ArrayList();

        Stream.of(0, 3, 0, 0, 5)
                .peek(x -> System.out.format("before distinct: %d%n", x))
                .distinct()
                .peek(x -> System.out.format("after distinct: %d%n", x))
                .peek(x->list.add(x))
                .map(x -> x * x)
                .forEach(x -> System.out.format("after map: %d%n", x));

        list.stream().forEach(System.out::print);*/

//        List<String> list = Stream.of("a", "b", "c", "d")
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        list.stream().forEach(System.out::print);

//
//
//        int product = IntStream.range(0, 10)
//                .filter(x -> x++ % 4 == 0)
//                .reduce((acc, x) -> acc * x)
//                .getAsInt();
////        System.out.println(product);


     /*   int firstSeq = IntStream.range(4, 65536)
                .filter(x->x==100)
                .findFirst()
                .getAsInt();
        System.out.println(firstSeq);*/

       /* LongSummaryStatistics stats = LongStream.range(2, 16)
                .summaryStatistics();
        System.out.format("  count: %d%n", stats.getCount());
        System.out.format("    sum: %d%n", stats.getSum());
        System.out.format("average: %.1f%n", stats.getAverage());
        System.out.format("    min: %d%n", stats.getMin());
        System.out.format("    max: %d%n"+ stats.getMax());*/

/*
        Map<Integer, String> map4 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i -> i % 5,
                        i -> String.format("<%d>", i),
                        (a, b) -> String.join(", ", a, b)
                ));
        for (Map.Entry entry : map4.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }*/

        

        Stream.iterate(
                new BigInteger[]{BigInteger.ZERO, BigInteger.ONE},
                t -> new BigInteger[]{t[1], t[0].add(t[1])})
                .map(t -> t[0])
                .limit(10)
                .forEach(System.out::println);

        /*
        Stream.iterate(
                new BigInteger[]{
                        BigInteger.ZERO, BigInteger.ONE
                },
                x -> new BigInteger[]{x[1], x[0].add(x[1])})
                .map(x -> x[0])
                .limit(15)
                .forEach(System.out::println);*/


//        IntStream.rangeClosed(2, 9)
//                .boxed()
//                .flatMap(i -> IntStream.rangeClosed(2, 9)
//                        .mapToObj(j -> String.format("%d * %d = %d", i, j, i * j))
//                )
//                .forEach(System.out::println);

//
//        IntStream.range(5, 30)
//                .limit(12)
//                .skip(3)
//                .limit(6)
//                .skip(2)
//                .forEach(System.out::println);

//
//        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
//        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
//                Collectors.partitioningBy(i -> i % 2 == 0));


    }
}