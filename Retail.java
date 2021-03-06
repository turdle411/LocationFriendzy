public class Retail extends Attractions {
   // Constructor
   public Retail(int id, String phoneNum, String name, String address, int corx, int cory, double minP, double maxP, int open, int close) {
      super(id, phoneNum, name, address, corx, cory, maxP,minP, open, close);	
   }
   
   // Accessor
   public Block getAttraction(){
      return this;
   }
   
   // Deducts money from the account of the user after they have 
   // visited this location
   public void deductMoney(double amount, NormalUser user) {
      if (checkPrice(amount)) {
         user.deductBalance(amount);
      }
   }
}