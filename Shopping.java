import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Shopping{
    public static void main(String[] args){
        Console cons = System.console();
        List <String> cart = new ArrayList<>();
        while (true){
        String savedInput = cons.readLine("1. list cart\n 2. add items\n 3.delete item\n 4. quit\n");
        Scanner scan = new Scanner(savedInput);
        String action = scan.next();
        if (action.equalsIgnoreCase("quit")){
            System.out.println("Checking out ...\n");
            break;
        }else if(action.equalsIgnoreCase("add")){
            while (scan.hasNext()){
                String item = scan.next();
                cart.add(item);
                System.out.printf("%s added to cart\n", item);
            }
        } else if (action.equalsIgnoreCase("list")){
            if (cart.size() == 0){
                System.out.println("Cart is empty ... \n");
            }
            for (int i = 0; i < cart.size(); i ++){
                System.out.printf("%d. %s \n", i + 1, cart.get(i));
            } 
        } else if (action.equalsIgnoreCase("delete")){
            int count = Integer.parseInt(scan.next());
               if ( count > cart.size() - 1){
                System.out.println("Incorrect item index\n");
               } else{
                String item = cart.get(count - 1);
                cart.remove(count - 1);
                System.out.printf("%s removed from cart\n", item);
               }
        }
        scan.close();
        }
    }

}