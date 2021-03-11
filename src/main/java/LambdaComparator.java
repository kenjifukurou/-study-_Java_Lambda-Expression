//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class ProductL {
//    int id;
//    String name;
//    float price;
//
//    public ProductL( int id, String name, float price) {
////        super();
//        this.id = id;
//        this.name = name;
//        this.price = price;
//    }
//}
//
//public class LambdaComparator {
//
//    public static void main(String[] args) {
//        List<ProductL> list = new ArrayList<ProductL>();
//        list.add(new ProductL(1110, "Television", 999f));
//        list.add(new ProductL(1111, "HP Mouse", 100f));
//        list.add(new ProductL(1112, "Samsung X", 5000f));
//        list.add(new ProductL(1113, "iPhone", 10f));
//
//        System.out.println("unsorted: ---");
//        for (ProductL p : list) {
//            System.out.println(p.name);
//        }
//
//        Collections.sort( list, (p1, p2) -> {
//            return p1.name.toLowerCase().compareTo(p2.name.toLowerCase());
//        });
//
//        System.out.println("sorted with lambda: ---");
//        for (ProductL p : list) {
//            System.out.println(p.name);
//        }
//
//
//    }
//
//}
