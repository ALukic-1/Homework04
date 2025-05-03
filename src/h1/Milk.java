package h1;

public class Milk extends PopularGrocery{


    Milk(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 20;

    }

    @Override
    int getBulkDiscount() {
        if(quantity >= discountThreshold ){
            return 12;
        } else {
            return 0;
        }

    }
}
