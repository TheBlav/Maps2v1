package App;
import Data.Product;
import Data.ProductCreator;
import Files.fileLoader;
import InOut.inOut;

import java.io.IOException;
import java.util.Map;
import java.util.TreeSet;

public class AppControler {
    inOut io = new inOut();
    fileLoader fl = new fileLoader();
    Map<String, TreeSet<Product>> productsMap;
    ProductCreator pd = new ProductCreator();
    String[] data;
    public void AppControler(){
        try {
            data = fl.fileLoader();
            productsMap = pd.ProductCreator(data);
            appOperations(productsMap);



        }
        catch  (IOException e){
            System.err.println("File not loaded");
        }
    }

    private void appOperations(Map<String, TreeSet<Product>> productsMap) {

       TreeSet<Product> productsSet = io.getTreeSetFromMap(productsMap);
       io.printItemsByType(productsSet);
        io.printOperations(productsSet);
    }
}
