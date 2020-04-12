import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Item {
	int id;
	String name;
	double price;

       char tax = {A, B, V};//TODO add variable.

	public Item(int ID, string Name, double Price) {//TODO constructor
		id=ID;
		name=Name;
		price=Price;
	}
E492: Not an editor command: wg!

	public void setId(int id){
		this.id=id;
	}
        public void setName(string name){
		this.name=name;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public int getID(){
		return id;
	}
	public string getName(){
		return name;
	}
	public double getPrice(){
		return price;
	}
	//TODO setters and getters

	double taxReturn (char tax, double price) {
	 double taxRet;
	 switch(tax){
		 case 'A': 
		  taxRet = price*0.18;
	          return taxRet*0.15;
		 case 'B':
                  taxRet = price*0.15;
                  return taxRet*0.15;
		 default:
                  taxRet = price*0.0;
                  return taxRet;//TODO
	}

} 
public class Receipt{
 public static List<Item> remove (List<Item> reciept)
 {

int i=0;
while(reciept.size()>7){
	reciept.size()-=1;
	i++;
}
return reciept;
 }
 
 public double TotalValue(List <Item> reciept){
	 double sum;
	 for( double price : Item){
          sum+=price;
	 }
	 return sum;
 }
 public static void main(string [] args){	
  List<Item> reciept = new ArrayList<>();
  reciept.add(new Item (1457,"Mango",121);
		  

}
}
