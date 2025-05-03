package h1;

abstract public class PopularGrocery extends GroceryItem {

    int popularityLevel;
    int quantity;


    PopularGrocery(int popularityLevel){
        isPopular = true;
        this.popularityLevel = popularityLevel;
    }

    public boolean showWarning(){
        if (quantity > householdLimit){
            return true;
        }else
            return false;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
