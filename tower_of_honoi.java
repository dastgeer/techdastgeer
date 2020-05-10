import java.util.Stack;

public class tower_of_honoi {
    public static void main(String[] args) {
        Stack<Integer> source = new Stack<>();
        Stack<Integer> dest = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        source.add(4);
        source.add(3);
        source.add(2);
        source.add(1);

        System.out.println("source stack before recursion-->"+source.toString());
        System.out.println("dest stack before recursion-->"+dest.toString());
        tower_of_honoi_recursivecall(source.size(),source,dest,helper);
        System.out.println("source stack after recursion-->"+source.toString());
        System.out.println("dest stack after recursion-->"+dest.toString());
    }

    private static void tower_of_honoi_recursivecall(int size, Stack<Integer> source, Stack<Integer> dest, Stack<Integer> helper) {
        if(size  <= 0 ) return;
        
        tower_of_honoi_recursivecall(size-1,source,helper,dest);
        
        moveElementSoureToEnd(source,dest);

        tower_of_honoi_recursivecall(size-1,helper,dest,source);
    }

   private static void moveElementSoureToEnd(Stack<Integer> source, Stack<Integer> dest){
        dest.push(source.pop());
   }

}
