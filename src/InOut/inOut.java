package InOut;

import Data.Product;
import Data.ProductCreator;
import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class inOut {
    Scanner scan = new Scanner(System.in);

    public String getText(){
        return scan.nextLine();
    }

    public void printItemsByType(TreeSet<Product> set){
        for (Product product : set) {
            System.out.println(product);
        }
    }

    public TreeSet<Product> getTreeSetFromMap(Map<String, TreeSet<Product>> map){
        System.out.println("Please provide category to display: ");
        String type = scan.nextLine();
        TreeSet<Product> productsSet = map.get(type);
        return productsSet;
    }

    public void printOperations(TreeSet<Product> set){
        double sum  = 0;
        for (Product product : set) {
            sum += product.getPrice();
        }
        System.out.printf("Average price: "+ "%5.2f%n" , (sum/set.size()));
        System.out.println("Cheapest item: " + set.first());
        System.out.println("Most Expensive item: " + set.last());
    }
}
