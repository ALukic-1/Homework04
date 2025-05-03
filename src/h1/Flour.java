package h1;

public class Flour extends PopularGrocery{


    Flour(int quantity, int discountThreshold, int popularityLevel){
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 15;
    }

    @Override
    int getBulkDiscount(){
        if (quantity >= discountThreshold){
            return 5;
        } else {
            return 0;
        }
    }

}
