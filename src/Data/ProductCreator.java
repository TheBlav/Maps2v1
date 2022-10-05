package Data;

import java.util.*;

public class ProductCreator {


    public Map<String, TreeSet<Product>> ProductCreator(String[] contents){

        Map <String, TreeSet<Product>> productMap = new HashMap<>();
        String[] content;
        Product product;
        for (int i = 0; i<contents.length; i++){
            if (contents[i] != null) {
                String current = contents[i];
                content = current.split(";");
                String type = content[0];
                String name = content[1];
                double price = Double.parseDouble(content[2]);
                product = new Product(name, price);
                if (productMap.containsKey(type))
                    productMap.get(type).add(product);

                else
                {
                    TreeSet<Product> productSet = new TreeSet<>();
                    productSet.add(product);
                    productMap.put(type,productSet);
                }

            }
        }

        return productMap;
    }
}
