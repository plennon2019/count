package ie.atu.week5;

public class Counter {
    private int countValue;

    public Counter() {
        countValue = 0;
    }
//add number
    public int increment()
    {
        countValue++;
        return countValue;
    }
//test decrement method and extra
    public int decrement()
    {
        countValue--;
        return countValue;
    }

    
       public Counter(int startingValue) {
         if (startingValue > 5) {
             countValue = startingValue;
         }
         else
         {
             throw new IllegalArgumentException("This is not a valid number");
         }
     }


}
