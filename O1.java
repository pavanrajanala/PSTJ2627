import java.util.stream.IntStream;

public class O1{
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};
        int a=50;
        int index =1;
        IntStream.range(0,arr.length)
                .filter(i -> i == index)
                .map(i-> arr[i])
                .forEach(System.out::println);

        IntStream.range(0, arr.length)
                .filter(i-> arr[i]==a)
                .map(i->i)
                .forEach(System.out::println);

    }
}
