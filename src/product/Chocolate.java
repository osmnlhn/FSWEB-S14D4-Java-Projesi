public class Chocolate extends ProductForSale {
    private String brand;

    public Chocolate(String type, int price, String description, String brand) {
        super(type, price, description);
        this.brand = brand;
    }


    public String getBrand() {
        return brand;
    }

    @Override
    public void showdetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Color: " + brand + "\n");
        builder.append("***************************\n");
        System.out.println(result + builder.toString());
    }


}
