public class new_ {
    public static void main(String[] args) {
//        String s= "My name is Rohit Gour";
//        List<String> list = List.of(s.split(" "));
//        System.out.println(list);
//        String st = list.stream().min(Comparator.comparing(String::length)).get();
//        System.out.println(st);

        String name = "nihal";
        String temp = "";
            for (int i=0;i<name.length();i++) {
                temp += name.charAt(name.length()-1-i);
            }
            System.out.println("name in reverse "+temp);

        }
}
//    For(int i=0;i>str.size();i++)
//        {
//
//        tempstr[str.size()-1-i] = str[i];
//
//
//        }
