class Item{
    String ItemName;
    String Price;
    String quantity;

    public Item(String ItemName, String Price, String quantity){
        this.ItemName = ItemName;
        this.Price = Price;
        this.quantity = quantity;
    }
}


class Order {
   private String orderId;
   private List<Item> items = new ArrayList<>();   // fix (import java.util.ArrayList)
    
   public Order(String orderId){
       this.orderId = orderId;
   }
   
   public void addItem(Strign ItemName, String Price, String quantity){
       Item item = new Item(ItemName, Price, quantity);
       this.items.add(item);
   }

   public void removeItem(String ItemName){
    items.removeIf(item -> item.ItemName.equals(ItemName));
   }
   
   public int getTotalItems(){
       return items.size();
   }
  
   public double getTotalPrice(){
       double totalPrice = 0;
       for(Item item : items){
           totalPrice += Double.parseDouble(item.Price) * Integer.parseInt(item.quantity);
       }
       return totalPrice;
   }

}

class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.addItem("Item1", "10.5", "2");
        order.addItem("Item2", "5.0", "3");
        System.out.println("Total Items: " + order.getTotalItems());
        System.out.println("Total Price: " + order.getTotalPrice());
    }
}