package DataStructure.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicsOfStream {
    public BasicsOfStream() {
    }

    public static void main(String[] args) {
//        Stream stream = Stream.of(1,2,"Rohit");
//        stream.forEach(e-> System.out.println(e));

//
//        int[] arr = {1,2,32};
//        Stream<Integer> stream22 = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
//        Stream<Integer>stream1 = Stream.of(new Integer[]{1,2,3} );
//        stream1.forEach(q-> System.out.println(q));

//        Stream<Integer> stream1 = Stream.generate(()->new Random().nextInt(10));
//        stream1.limit(10).forEach(q-> System.out.println(q));
//        IntStream intStream = "abcd".chars();
//        intStream.forEach(q-> System.out.println(q));

//        Stream<String> stream = Stream.of("Rohit Gour".split("\\ "));
//        stream.forEach(a-> System.out.println(a));


//        List<Integer> listOfNumber = new ArrayList<>();
//        for(int i=0;i<11;i++){
//            listOfNumber.add(i);
//        }
//
//        List<Integer> listOfEven = listOfNumber.stream().filter(a->a%2==0).collect(Collectors.toList());
//        System.out.println(listOfEven);

        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");

//        memberNames.stream().filter(p->p.startsWith("R")).forEach(System.out::println);
//        memberNames.stream().filter(w->w.startsWith("L")).map(String::toUpperCase).forEach(System.out::println);
//        System.out.println("------------");
//        memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);

        //match
//
//        Boolean name = memberNames.stream().map(String::toUpperCase).anyMatch((w)->w.startsWith("Y"));
//        System.out.println(name);
    }
}
