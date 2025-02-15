import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class InventoryManagementSystem{
    static ArrayList<Product> products = new ArrayList<>();
       static Scanner sc = new Scanner(System.in);
    
    private static void display(){
        String str = " " +
                "1. add an item\n" + //
                "2. display all the items\n" + //
                "3. search an item\n" + //
                "4. delete an item\n" + //
                "5. update an item\n" + //
                "6. calculate the inventory value\n" + //
                "7. exit the applicationjust input!";

        System.out.println(str);
    }
    
    private static void addItems(){
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.println("Enter price: ");
            Double price = sc.nextDouble();

            Product product = new Product(id, name, quantity, price);
            products.add(product);

            System.out.println("Product Added");

    } 

    private static void displayItems(){
        for(Product product : products){
            System.out.println("Id is: " + product.getId());
            System.out.println("Name is: " + product.getName());
            System.out.println("price is: " + product.getPrice());
            System.out.println("Quantity is: " + product.getQuantity());
        }
    }

    private static void search(){
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        for(Product product : products){
            if(product.getId() == id){
                System.out.println("Id is: " + product.getId());
                System.out.println("Name is: " + product.getName());
                System.out.println("price is: " + product.getPrice());
                System.out.println("Quantity is: " + product.getQuantity());
            }
        }
    }

    private static void deleteItem(){
        System.out.println("Enter id for Deletion: ");
        boolean found=false;
        int id = sc.nextInt();
        for(Product product : products){
            if(product.getId() == id){
                products.remove(product);
                found=true;
            }
        }
        System.out.println("Product Deleted");
    }

    private static void updateItem(){
        System.out.print("ID: ");
        int id = sc.nextInt();
        boolean found = false;
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.print("Name :");
                product.setName(sc.next());
                System.out.print("Quantity :");
                product.setQuantity(sc.nextInt());
                System.out.print("Price :");
                product.setPrice(sc.nextFloat());
                found = true;
            }
        }
        if (!found) {
            System.out.println("ID not found");
        }
    }
    private static void calculateTotal(){
        double total=0;
        for(Product product : products){
            total=total+(product.getQuantity()*product.getPrice());
            System.out.println("total is"+total);
        }
    }
    public static void main(String[] args) {
        
        int choice;
        do{
            display();
            choice = sc.nextInt();

        switch (choice){
            case 1:
                addItems();
                break;
            case 2:
                displayItems();
                break;
            case 3:
                search();
                break;
            case 4:
                deleteItem();
                break;
            case 5:
                updateItem();
                break;
            case 6:
                 calculateTotal();
                break;
            case 7:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Choice"); 
        }
    }while (choice!=7);
}
}