package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        if (canYouAddTheProduct(product)) {
            productList.add(product);
        } else {
            throw new IllegalArgumentException("Its int the future");
        }
    }

    private boolean canYouAddTheProduct(Product product) {

        if (((product.getDateOfPurchase().compareTo(LocalDate.now())) < 0) || (((product.getDateOfPurchase().compareTo(LocalDate.now())) == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public void write(Month month){
        try {
            Files.write(Path.of("products.txt"), findTheProducts(month));
        } catch (IOException e){
            throw new IllegalArgumentException("no write", e);
        }
    }
    public List<String> findTheProducts(Month month){
        List<String> result = new ArrayList<>();
        for (Product p:productList
             ) {
            if (p.getDateOfPurchase().getMonth().compareTo(month)==0){
                result.add(p.getName()+";"+p.getDateOfPurchase()+";"+p.getPrice());
            }
        }
    return result;}
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product("Hajlak", 1200, LocalDate.now()));
        store.addProduct(new Product("Hajlak", 1200, LocalDate.now()));
        System.out.println(store.findTheProducts(Month.NOVEMBER));
    }

}
