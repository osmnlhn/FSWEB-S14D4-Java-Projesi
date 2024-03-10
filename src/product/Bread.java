public class Bread extends ProductForSale{

    private String typeOf;

    public Bread(String type, int price, String description, String typeOf) {
        super(type, price, description);
        this.typeOf = typeOf;
    }

    public String getTypeOf() {
        return typeOf;
    }

    @Override
    public void showdetails() {
        String result = super.toString();
        StringBuilder builder = new StringBuilder();
        builder.append("Color: " + typeOf + "\n");
        builder.append("***************************\n");
        System.out.println(result + builder.toString());
    }
}
