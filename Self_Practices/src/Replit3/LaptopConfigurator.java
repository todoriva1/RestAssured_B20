package Replit3;
/*
First ask user for a screen size.
 If screen size is equals to 13.3, add  $200 to the laptop price.
  If screen size is equals to  15.0 - add  $300 to the laptop price.
  If screen size is equals to  17.3 - add  $400 to the laptop price.
  Then ask user for CPU type. If CPU type equals to i3, add  $150 to the laptop price.
  If CPU type equals to i5, add  $250 to the laptop price. If CPU type equals to i7, add  $350 to the laptop price.
  Then ask user for RAM size. Add  $50 for every 4GB of ram to the laptop price. Then, ask user for storage type.
   There are 2 options: SSD and HDD. If it's HDD - add $50 to the laptop price for every 500gb.
     If it's SSD - add $100 to the laptop price for every 500GB. Then ask user for for screen resolution.
     There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.
Example:

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0

 */

import java.util.Scanner;

public class LaptopConfigurator {
    public static void main(String[] args) {
        double laptopPrice = 0;
        double screenSize = 5;
        String cpuType = "i7";
        String storageType = "SSD";
        String screenResolution = "4K";
        int memorySize = 1000;
        int ramSize = 4;

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        if(screenSize == 13.3){
            laptopPrice+=200;
        }if(screenSize == 15.0){
            laptopPrice+=300;
        }if(screenSize == 17.3){
            laptopPrice+=400;
        }
        System.out.println("Select CPU type:");
        cpuType = scan.next();
        if( cpuType.equalsIgnoreCase("i3")){
            laptopPrice+= 150;
        }if( cpuType.equalsIgnoreCase("i5")){
            laptopPrice+= 250;
        }if( cpuType.equalsIgnoreCase("i7")){
            laptopPrice+= 350;
        }
        System.out.println("Select RAM size:");
        ramSize = scan.nextInt();

            laptopPrice+= (ramSize/4)* 50;

        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        if(storageType.equalsIgnoreCase("HDD")){
            laptopPrice+=(memorySize/500)* 50;
        }if(storageType.equalsIgnoreCase("SSD")){
            laptopPrice+=(memorySize/500)*100;
        }
        System.out.println("Enter screen resolution");
        screenResolution = scan.next();
        if(screenResolution.equalsIgnoreCase("FULLHD")){
            laptopPrice+=100;
        }if(screenResolution.equalsIgnoreCase("4K")){
            laptopPrice+=200;
        }

        System.out.println("Laptop price is: "+"$"+laptopPrice);
    }
}
