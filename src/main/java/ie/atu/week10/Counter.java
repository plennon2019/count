package ie.atu.week10;

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
//test decrement method.
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

 public int getCount()
   {
       return countValue;
   }
}
