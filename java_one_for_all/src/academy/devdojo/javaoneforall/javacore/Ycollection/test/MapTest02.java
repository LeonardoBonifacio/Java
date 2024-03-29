package academy.devdojo.javaoneforall.javacore.Ycollection.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Customer;
import academy.devdojo.javaoneforall.javacore.Ycollection.domain.Manga;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("William Suane");
        Customer customer2 = new Customer("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Pokemon", 19.99);
        Manga manga2 = new Manga(3L, "Hellsing ultimate", 59.99);
        Manga manga3 = new Manga(1L, "Berserk", 29.99);
        Manga manga4 = new Manga(2L, "Attack on titan", 39.99);
        Manga manga5 = new Manga(4L, "Dragon Ball Z", 89.99);

        Map<Customer,Manga> custumerMangaMap = new HashMap<>();
        custumerMangaMap.put(customer1, manga2);
        custumerMangaMap.put(customer2, manga5);

        for(Entry<Customer,Manga> entry : custumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getTitle());
        }
        
    }
}
