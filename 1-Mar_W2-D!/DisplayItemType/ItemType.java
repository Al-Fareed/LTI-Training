package DisplayItemType;

/*
 * Display Item Type
The International Film Festival of India (IFFI), founded in 1952, is one of the most significant film festivals in Asia. The festival is for a week and arrangements have to be made for food, chairs, tables, etc. The organizing committee plans to deposit the advance amount to the contractors on confirmation of booking.

Write a Java program to get item type, cost per day, and deposit amount from the user and display these details in a detailed view using the following classes and methods.
[Note :Strictly adhere to the object-oriented specifications given as a part of the problem statement.
Follow the naming conventions as mentioned. Create separate classes in separate files.]

Consider a class named ItemType.
It must have the following private member variables/attributes.
Data Type	Variable
String	name
Double	costPerDay
Double	deposit

Include the appropriate getters and setters.

The ItemType class includes the following method.
Method name	Description
public void display()	This method should display ‘Item type details’ followed by the details of the ItemType in the format as shown in the sample output.

Consider the class Main. It includes the method main
Write a code in the main method to test the ItemType class.
The following must be done inside the main method to test the ItemType class.
Get the item type details as input.
Create an ItemType Object with the given details using the setters of ItemType and call the display( ) method.
The itemType details need to be displayed in the display() method
 

Please use the below sample convention to create getters and setters of the class ItemType

private String name; 
public String getName( ) {
         return name;
 }
 public void setName(String name) { 
        this.name = name; 
} 
 

Input and Output Format:
Refer sample input and output for formatting specifications.

Note:
Cost per day and Deposit value should be displayed up to 2 decimal places.

[All text in bold corresponds to input and the rest corresponds to output.]

Sample Input and Output 1:
Enter the item type name
Catering
Enter the cost per day
25000.00
Enter the deposit
10000.50
Item type details
Name : Catering
CostPerDay : 25000.00
Deposit : 10000.50
 */

/**
 * ItemType
 */
public class ItemType {
        private Double costPerDay;
        private Double deposit;
        private String name;

        ItemType() {
                name = "";
                costPerDay = 0.0;
                deposit = 0.0;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setCostPerDay(Double costPerDay) {
                this.costPerDay = costPerDay;

        }

        public void setDeposit(Double deposit) {
                this.deposit = deposit;
        }

        public String getName() {
                return name;
        }

        public Double getCost() {
                return costPerDay;
        }

        public Double getDeopsit() {
                return deposit;
        }

        public void display() {
                System.out.println("Item type details\nName : " + getName());
                System.out.printf("CostPerDay : %.2f", getCost());
                System.out.printf("\nDeposit : %.2f",getDeopsit());
        }
}