public class ProductProgram {
    public static void main(String[] args) {
        var products = new ProductCollection();

        products.add(new Product(729001111, "shampoo"));
        products.add(new Product(729001345, "corn-flakes"));
        products.add(new Product(729009111, "milk"));
        products.add(new Product(729006775, "perfume"));
        products.add(new Product(729008900, "chocolate-bar"));
        products.add(new Product(729006578, "knife"));
        products.add(new Product(729000248, "pencil"));

        var iterator = products.getEnumerator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
