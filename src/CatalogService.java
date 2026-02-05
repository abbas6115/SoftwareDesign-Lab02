import java.util.Random;
import java.util.Scanner;


public class CatalogService {

    //so we are passing a string and we are gonna use data.split to split the string into 3, and then 
    //it will return a list


    //so in the main we will create a catalog service object, and then using that object we will pass a list  


    //this is the list we are going to use to store the items

    private DatabaseInteractor db;

    public CatalogService(DatabaseInteractor db) {
        this.db = db;
    }


    public void addItem(String name, String description) {

        //first we are checking if the name and description exisit and arent null
        if (name == null || name.isEmpty() || description == null || description.isEmpty()) {
            System.out.println("Invalid input. Name and description cannot be empty.");
            return;
        }

        //create a three item array that alls strings and append that to data 
        //(data is the list we are working with)

        //generate a random id that is 5 digits long
        Random random = new Random();

        String id = String.valueOf(10000 + random.nextInt(9999));

        //create a string that has the id name and description and append 
        //creating an array that has three of these strings 

        String[] newItem = {id, name, description};
            
        db.data.add(newItem);
        db.writeToCSV(id, name, description);

        System.out.println("New item added successfully.");
    }


    // Method to edit an existing item by ID
    //as long as the items name and description exist we will be able to edit the description and 
    //the name

    public void editItem(String id ){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < db.data.size(); i++) {
            if (db.data.get(i)[0].equals(id)) {

                System.out.print("Change name? (y/n): ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    System.out.print("New name: ");
                    db.data.get(i)[1] = scanner.nextLine();
                }

                System.out.print("Change description? (y/n): ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    System.out.print("New description: ");
                    db.data.get(i)[2] = scanner.nextLine();
                }

                System.out.println("Item updated.");
                return;
            }
        }

        System.out.println("Item not found.");
    }

    public void viewItem() {
        if (db.data.isEmpty()) {
            System.out.println("No items in catalogue.");
            return;
        }

        for (String[] item : db.data) {
            System.out.println(
                "ID: " + item[0] +
                " | Name: " + item[1] +
                " | Description: " + item[2]
            );
        }
    }
}
