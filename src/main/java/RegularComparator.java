//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//class Product {
//    int id;
//    String name;
//    float price;
//
//    public Product( int id, String name, float price) {
////        super();
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//}
//
//class SortByName implements Comparator<Product> {
//    @Override
//    public int compare(Product o1, Product o2) {
//        return o1.name.toLowerCase().compareTo(o2.name.toLowerCase());
//    }
//}
//
//public class RegularComparator {
//
//    public static void main(String[] args) {
//        List<Product> list = new ArrayList<Product>();
//        list.add(new Product(1110, "Television", 999f));
//        list.add(new Product(1111, "HP Mouse", 100f));
//        list.add(new Product(1112, "Samsung X", 5000f));
//        list.add(new Product(1113, "iPhone", 10f));
//
//        System.out.println("unsorted: ---");
//        for (Product p : list) {
//            System.out.println(p.name);
//        }
//
//        System.out.println("sorting base on Name: ---");
//        Collections.sort(list, new SortByName());
//        for (Product p : list) {
//            System.out.println(p.name);
//        }
//
//
//    }
//
//}
