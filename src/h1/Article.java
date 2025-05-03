package h1;

abstract public class Article{

   protected int discountThreshold;
   protected int householdLimit;


    abstract int getBulkDiscount();
    abstract boolean showWarning();

}