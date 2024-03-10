public abstract class ProductForSale {
    private String type;
    private int price;
    private String description;

    public ProductForSale(String type, int price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public int getSalesPrice(int quantity){
        return quantity*price;
    }



    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public abstract void showdetails();


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("***************************\n");
        builder.append("Type: " + getType() + "\n");
        builder.append("Price: " + getPrice() + "\n");
        builder.append("Description: " + description + "\n");
        builder.append("Class Type: " + getClass().getSimpleName() + "\n");
        return builder.toString();
    }


}
