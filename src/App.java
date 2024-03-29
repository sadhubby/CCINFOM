/*
CCINFOM Java App Project using DBSALES database. 

Group Code: CCINFO-007
MEMBER 1: DE GUZMAN, Evan
MEMBER 2: SANTOS, Marcus
MEMBER 3: MAULION, Ian
MEMBER 4: Tumabaga, Myrine

 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){
    
    System.out.println("DBSALES JAVA TERMINAL APP");
    System.out.println("CCINFO-007\n");
    Scanner sc = new Scanner(System.in);  
    App_Methods am = new App_Methods();

    int stopper = 1;
    while(stopper == 1){

        System.out.println("===========================");
        System.out.println("MAIN MENU");
        System.out.println("===========================\n");
        System.out.println("1. Records Management");
        System.out.println("2. Transaction Management");
        System.out.println("3. Record Generation");
        System.out.println("4. Exit\n");
        System.out.println("===========================");
        

        System.out.print("Enter choice: ");
        int inputForMainMenu = sc.nextInt();
        System.out.println("===========================");


        if (inputForMainMenu == 1){// record management
                System.out.println("RECORD MANAGEMENT MENU");
                System.out.println("===========================");
                System.out.println("\n1. Products");
                System.out.println("2. Customers");
                System.out.println("3. Employee");
                System.out.println("4. Office\n");
                System.out.println("===========================");
                System.out.print("Enter choice: ");

                int recordsInput = sc.nextInt();
                switch (recordsInput) {
                    case 1: //products
                        System.out.println("===========================");
                        System.out.println("PRODUCT MANAGEMENT MENU");
                        System.out.println("===========================\n");
                        System.out.println("1. Create a new Product");
                        System.out.println("2. Update a record of a Product");
                        System.out.println("3. Delete a record of a Product");
                        System.out.println("4. View a Product and Order List\n");
                        System.out.println("===========================");
                        System.out.print("Enter choice: ");
                        int productsInput = sc.nextInt();
                        switch (productsInput) {
                            case 1: // Create new product

                                App_Methods.product_insert();

                                break;
                            case 2: // Update record of Product

                                App_Methods.product_update();
                                
                                break;
                            
                            case 3: //delete a record of product

                                App_Methods.product_delete();

                                break;
                            case 4: // View product and order list given a  specific year




                                break;
                            default:
                                System.out.println("===========================\n");
                                System.out.println("Invalid choice. Going back to main menu\n");
                                break; 
                            }
                        break;
                    case 2: // customers 
                    // since this is not mine anymore, edit the menu as you please
                        System.out.println("===========================");
                        System.out.println("CUSTOMERS MANAGEMENT MENU");
                        System.out.println("===========================\n");
                        System.out.println("1. Create a new Customer");
                        System.out.println("2. Update a record of Customer");
                        System.out.println("3. Delete a record of Customer");
                        System.out.println("4. View a Customer and order list of Customer\n");
                        System.out.println("===========================");
                        System.out.print("Enter choice: ");
                        int customersInput = sc.nextInt();
                        switch (customersInput) {
                            case 1:



                                break;

                            case 2:




                                break;
                            case 3:




                                break;
                            case 4:




                                break;
                            default:
                                System.out.println("===========================\n");
                                System.out.println("Invalid choice. Going back to main menu\n");
                                break;
                        }
                        break;
                    case 3: // employee 
                    // since this is not mine anymore, edit the menu as you please
                        System.out.println("===========================");
                        System.out.println("EMPLOYEES MANAGEMENT MENU");
                        System.out.println("===========================\n");
                        System.out.println("1. Create a new Employee");
                        System.out.println("2. Update a record of Employee");
                        System.out.println("3. Delete a record of Employee");
                        System.out.println("4. View an Employee and Customer list \n");
                        System.out.println("===========================");
                        System.out.print("Enter choice: ");
                        int employeesInput = sc.nextInt();
                        switch (employeesInput) {
                            case 1:
                                
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("===========================\n");
                                System.out.println("Invalid choice. Going back to main menu\n");
                                break;
                            }
                        break;
                    case 4: //office
                    // since this is not mine anymore, edit the menu as you please
                        System.out.println("===========================");
                        System.out.println("OFFICE MANAGEMENT MENU");
                        System.out.println("===========================\n");
                        System.out.println("1. Create a new Office");
                        System.out.println("2. Update a record of an Office");
                        System.out.println("3. Delete a record of an Office");
                        System.out.println("4. View an Office and list of Employees \n");
                        System.out.println("===========================");
                        System.out.print("Enter choice: ");
                        int officesInput = sc.nextInt();
                        switch (officesInput) {
                            case 1:
                                

                                break;
                        
                            case 2:


                                break;
                            case 3:


                                break;
                            case 4:


                                break;
                            default:
                                System.out.println("===========================\n");
                                System.out.println("Invalid choice. Going back to main menu\n");
                                break;
                            }
                        break;





                    default:
                        System.out.println("===========================\n");
                        System.out.println("Invalid choice. Going back to main menu\n");
                }

        }
        else if(inputForMainMenu == 2){//transaction management
                System.out.println("TRANSACTION MANAGEMENT MENU");
                System.out.println("===========================");
                System.out.println("\n1. Orders management");
                System.out.println("2. Payment management\n");
                System.out.println("===========================");
                System.out.print("Enter choice: ");
                int inputForTransanction = sc.nextInt();
                switch (inputForTransanction) {
                    case 1: //orders
                        
                        break;
                
                    case 2: //payment


                        break;





                    default:
                        System.out.println("===========================\n");
                        System.out.println("Invalid choice. Going back to main menu\n");
                        break;
                }

        }
        else if(inputForMainMenu == 3){ //report generation
                System.out.println("REPORT GENERATION MENU");
                System.out.println("===========================");
                System.out.println("\n1. Sales Report for different sales per status");
                System.out.println("2. Sales Report for different sales per product\n");
                System.out.println("===========================");
                System.out.print("Enter choice: ");
                int inputForReports = sc.nextInt();
                switch (inputForReports) {
                    case 1:
                        
                        break;
                
                    case 2:


                        break;
                    
                        


                    default:
                        System.out.println("===========================\n");
                        System.out.println("Invalid choice. Going back to main menu\n");
                        break;
                }
        }
        else if(inputForMainMenu == 4){
                System.out.println("\nEnding program...\n");
                System.out.println("===========================");
                stopper = 0;
        }
        else{
                System.out.println("\nInvalid choice\n");
        }
        }// end of while loop
    sc.close();



        

    
}
}
