
/* author @richard*/
public class MyApp {
 public static void main(String[] args) {
 Product product = new Product("Edam", 3.3, 120);
 product.changeBalance(20);
 product.changePrice();
 System.out.println("Product value is " + product.countValue());
 product.printProduct();
 
 }
}
class Product {
private String name;
private double price;
private int amount; //Amount in storage
public Product(String name, double price, int amount) {
this.name = name;
this.price = price;
this.amount = amount;
}
public double countValue() {
double result;
result = amount * price;
return result;
}
public void printProduct() {
System.out.printf("Product %s, price %4.1f and balance %d pcs",
name,price,amount);
}
public int changeBalance(int newvalue){
    newvalue = this.amount;
    return newvalue;
    
}
public int changePrice(){
    int newprice = 0;
    return newprice;
}

}