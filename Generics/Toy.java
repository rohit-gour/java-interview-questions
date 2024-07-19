package Generics;

public class Toy<T> {

    private T item;

    public void setItem(T item){
            this.item = item;
    }
    public T getItem(){
        return this.item;
    }

    public void printBox(Toy<?> toy){
        System.out.println(toy.getItem());
    }
    public static void main(String[] args) {
        Toy<String> toy = new Toy<>();
        toy.setItem("Hey its Tomm");
//        System.out.println(toy.getItem());
        toy.printBox(toy);

        Toy<Integer> toy1 = new Toy<>();
        toy1.setItem(125);
//        System.out.println(toy1.getItem());
        toy.printBox(toy1);

    }
}
