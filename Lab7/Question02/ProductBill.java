public class ProductBill {

    private String priceText;
    private String quantityText;

    public ProductBill(String priceText, String quantityText) {
        this.priceText = priceText;
        this.quantityText = quantityText;
    }

    public double calculateTotal() {

        double price = Double.parseDouble(priceText);
        int quantity = Integer.parseInt(quantityText);

        return price * quantity;
    }
}