package week1.day1;

import org.apache.poi.common.usermodel.fonts.FontHeader.PanoseWeight;

public class Mobile {
	void makeCall() {
	     String mobileModel = "Samsung";
	     float mobileWeight = 100.20f;
	
	System.out.println("My mobile is:" + mobileModel + " & the mobileWeight is :" + mobileWeight);
	
	
	}
	
	void sendMsg() {
	    boolean isFullyCharged = true;
	    int mobileCost = 50000;
	
	 System.out.println("My mobile is :" + isFullyCharged + " & The cost is :" + mobileCost);

   }  

     public static void main(String[] args) {
//     create object for class
       Mobile object = new Mobile();
       object.makeCall();
       object.sendMsg();
       
       System.out.println("This is my mobile");
     
       

		

	}

}
