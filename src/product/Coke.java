public class Coke extends ProductForSale {

    private String flavour;

    public Coke(String type, int price, String description, String flavour) {
        super(type, price, description);
        this.flavour = flavour;
    }

    public String getFlavour() {
        return flavour;
    }

    @Override
    public void showdetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Color: " + flavour + "\n");
        builder.append("***************************\n");
        System.out.println(result + builder.toString());
    }
}
