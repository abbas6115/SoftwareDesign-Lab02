import java.util.Scanner;

class Interface {
    public static void main(String[] args) {
        //Creating Input
        Scanner input=new Scanner(System.in);
        //SystemReadingInput

        int storageInput=0;


        do{
            //print file
            System.out.print("Catalogue Interface: " +
                    "\n\t1). View Items" +
                    "\n\t2). Add Items" +
                    "\n\t3). Edit items" +
                    "\n\t4). End Program" +
                    "\nEnter input: "

            );

            //take input
            storageInput=input.nextInt();

            switch(storageInput){
                case 1:
                    //View item to list logic
                        viewItem();
                    break;
                case 2:
                    //Add Item list logic
                    System.out.print("Enter the name of the item: ");
                    String itemName=input.nextLine();
                    itemName=input.nextLine();

                    System.out.print("Enter the description of the item: ");
                    String description=input.nextLine();

                    addItem(itemName,description);
                    break;
                case 3:
                    //edit item logic
                        System.out.print("Enter Item ID: ");
                        String itemID=input.nextLine();
                        editItem(itemID);
                    break;
                case 4:
                    //Exit input it is empty
                    break;

                default:
                    System.out.println("Invalid input");
            }//end of switch case


            //end of program
        }while(storageInput!=4) ; //end of program loop (while)
    }

    //functions
    public static void viewItem(){
        //
    }

    public static void addItem(String itemName, String itemDesc){

    }

    public static void editItem(String ID){
        
    }
}