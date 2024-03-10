public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Sweet", 2, "Delicious chocolate", "Milka");
        products[1] = new Coke("Beverage", 1, "Refreshing drink", "Cola");
        products[2] = new Bread("Bakery", 3, "Freshly baked bread", "Whole Wheat");

        Store store = new Store();
        store.listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showdetails();
            System.out.println("----------------------");
        }
    }
}