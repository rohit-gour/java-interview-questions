//package StreamExample;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class PlayerMain {
//    public static void main(String[] args) {
//        List<Player> listOfEmployee = new ArrayList<>();
//        listOfEmployee.add(new Player("1",200.0));
//        listOfEmployee.add(new Player("2",250.0));
//        listOfEmployee.add(new Player("3",100.0));
//        listOfEmployee.add(new Player("4",50.0));
//        listOfEmployee.add(new Player("5",500.0));
//
//        listOfEmployee.sort(Comparator.comparingDouble(Player::getScore));
//        System.out.println(listOfEmployee.toString());
//
//        int[] arr = {2,4,3,3,3,};
//        Arrays.stream(arr);
//        Arrays.stream(arr).forEach(w-> System.out.println(w));
//    }
//
//
//    //
//    public void getExample(){
//        Stream s = Stream.of(2,2,5,5,5,5,2);
//        IntStream i = IntStream.
//    }
//}
