class DiscountCalculator {
    public double calculateDiscount(Object product) {
        if (product instanceof FoodProduct) {
            FoodProduct foodProduct = (FoodProduct) product;
            return foodProduct.price * 0.1;  // 10% discount for food products
        } else if (product instanceof ElectronicsProduct) {
            ElectronicsProduct electronicsProduct = (ElectronicsProduct) product;
            return electronicsProduct.price * 0.05;  // 5% discount for electronics
        } 
        return 0;
    }
}

class FoodProduct {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }
}

class ElectronicsProduct {
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }
}
