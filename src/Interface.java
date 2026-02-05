import java.util.Scanner;

class Interface {

    private static DatabaseInteractor db = new DatabaseInteractor();
    private static CatalogService service = new CatalogService(db);

    public static void main(String[] args) {
        //Creating Input
        Scanner input=new Scanner(System.in);
        //SystemReadingInput

        int storageInput = 0;


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
            storageInput = input.nextInt();
            input.nextLine();

            switch(storageInput){
                case 1:
                    //View item to list logic
                    service.viewItem();
                    break;
                case 2:
                    //Add Item list logic
                    System.out.print("Enter item name: ");
                    String itemName = input.nextLine();

                    System.out.print("Enter description: ");
                    String description = input.nextLine();

                    service.addItem(itemName, description);
                    break;
                case 3:
                    //edit item logic
                    System.out.print("Enter Item ID: ");
                    String itemID = input.nextLine();

                    service.editItem(itemID);
                    break;
                case 4:
                    //Exit input it is empty
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid input");
            }//end of switch case


            //end of program
        }while(storageInput != 4) ; //end of program loop (while)
    }
}