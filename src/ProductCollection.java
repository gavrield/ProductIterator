import java.util.ArrayList;

public class ProductCollection implements IEnumerable{

    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product product){
        this.products.add(product);
    }

    @Override
    public IEnumerator<Product> getEnumerator() {
        return new IEnumerator() {
            int cur = 0;
            @Override
            public boolean hasNext() {
                return cur < products.size();
            }

            @Override
            public void next() {
                cur++;
            }

            @Override
            public Product current() {
                return products.get(cur);
            }
        };
    }
}
