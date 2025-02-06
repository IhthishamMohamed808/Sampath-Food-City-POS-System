import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        String login;
        String newitem = null;
        int newprice = 0;

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> itemsPrices = new ArrayList<>();

        Scanner sc = new Scanner(System.in);



        //Item name(s) and price(s) in the menu


        items.add("Chicken");
        itemsPrices.add(500);

        items.add("Beef");
        itemsPrices.add(650);

        items.add("Fish");
        itemsPrices.add(300);

        items.add("Fresh Milk");
        itemsPrices.add(210);

        items.add("Vanilla Milk");
        itemsPrices.add(180);

        items.add("Chocolate Milk");
        itemsPrices.add(190);

        items.add("Biscuits");
        itemsPrices.add(280);

        items.add("Water");
        itemsPrices.add(300);

        items.add("Mineral Water");
        itemsPrices.add(450);



        // Printing menu and item detail(s)


        System.out.println("\n**************** Sampath Food City ****************\n");

        System.out.println(" \t ----------------------------------------------------------------");
        System.out.println(" \t ----\t\t\t\tItems List\t\t\t\t----");
        System.out.println(" \t ----------------------------------------------------------------");
        System.out.println(" \t ---------------------------------");
        System.out.println("\t| \tChicken            \t500 /= \t\t|");
        System.out.println("\t| \tBeef               \t650 /= \t\t|");
        System.out.println("\t| \tFish               \t300 /= \t\t|");
        System.out.println("\t| \tFresh Milk         \t210 /= \t\t|");
        System.out.println("\t| \tVanilla Milk       \t180 /= \t\t|");
        System.out.println("\t| \tChocolate Milk     \t190 /= \t\t|");
        System.out.println("\t| \tBiscuits           \t280 /= \t\t|");
        System.out.println("\t| \tWater              \t300 /= \t\t|");
        System.out.println("\t| \tMineral Water      \t450 /= \t\t|");
        System.out.println(" \t ---------------------------------");

        System.out.println("Admin login - 1");
        System.out.println("Customer login - 2");
        login = sc.next();



        //Print Admin and customer


        System.out.println("Admin name \t\t: Admin / admin");
        System.out.println("Admin password \t: 545\n");

        if (login.equals("1")) {

            System.out.println("\n*************** ADMIN ID ***************");



            //Admin login


            Scanner Admin_ID1 = new Scanner(System.in);
            String admin_name;
            int admin_Password;

            do {
                System.out.println("Admin name \t\t\t\t\t\t: ");
                admin_name = Admin_ID1.nextLine();

                System.out.println("Admin password \t\t\t\t\t: ");
                admin_Password = Admin_ID1.nextInt();
                Admin_ID1.nextLine();

                if (admin_name.equals("Admin") || admin_name.equals("admin")) {
                    if (admin_Password == 545) {
                        break;
                    } else {
                        System.out.println("Incorrect password. Please try again.");
                    }
                } else {
                    System.out.println("Invalid admin name. PLease try again.");
                }
            } while (true);



            //Customize item list


            {
                System.out.println("\n----------------- CUSTOMIZE -----------------\n");
                Scanner cstmItem = new Scanner(System.in);
                String cstmchoice;

                do {
                    System.out.println("[ Yes / No ]");
                    System.out.print("Do you want to customize \t\t: ");
                    cstmchoice = cstmItem.nextLine();



                    //Add,remove or update item(s)


                    if (cstmchoice.equalsIgnoreCase("Yes")) {
                        Scanner adminMenu = new Scanner(System.in);
                        System.out.println("\n[Add news items and prices (1) / Remove items (2) / Modify existing items (3)]\n");
                        System.out.print("Select one \t\t\t\t\t\t: ");
                        int modchoice = adminMenu.nextInt();



                        //Addition of new item(s)


                        if (modchoice == 1) {
                            Scanner addItem = new Scanner(System.in);
                            System.out.print("Add item \t\t\t\t\t: ");
                            newitem = addItem.nextLine();

                            System.out.println("Add price \t\t\t\t\t: ");
                            newprice = addItem.nextInt();



                            //Adding items and its prices into Arraylist(s)


                            items.add(newitem);
                            itemsPrices.add(newprice);

                            System.out.println("\nAdded item \t\t\t\t\t: " + newitem);
                            System.out.println("Added price \t\t\t\t\t: " + newprice + "/=\n");
                        }



                        //Remove item(s)


                        else if (modchoice == 2) {
                            Scanner removeItems = new Scanner(System.in);
                            System.out.print("Remove food \t\t\t\t\t: ");
                            String removeItem = removeItems.nextLine();

                            int index = items.indexOf(removeItem);
                            if (index != -1) {
                                items.remove(index);
                                itemsPrices.remove(index);
                                System.out.println("Removed item \t\t\t\t\t: " + removeItem + "\n");
                            } else {
                                System.out.println("Item not found in the list");
                            }
                        }



                        //Update item(s)


                        else if (modchoice == 3) {
                            Scanner updateItems = new Scanner(System.in);
                            System.out.print("Update item \t\t\t\t\t: ");
                            String updateItem = updateItems.nextLine();

                            int index = items.indexOf(updateItem);
                            if (index != -1) {
                                System.out.print("New item name \t\t\t\t\t: ");
                                String newItemName = updateItems.nextLine();

                                System.out.print("New price \t\t\t\t\t\t: ");
                                int newItemPrice = updateItems.nextInt();

                                items.set(index, newItemName);
                                itemsPrices.set(index, newItemPrice);

                                System.out.println("Updated item \t\t\t\t\t: " + newItemName);
                                System.out.println("Updated price \t\t\t\t\t: " + newItemPrice + "/=\n");

                            } else {
                                System.out.println("Item not found in the list");
                            }
                        } else {
                            System.out.println("Invalid choice");
                        }
                    } else if (!cstmchoice.equalsIgnoreCase("No")) ;
                    {
                        System.out.println("Invalid input");
                    }
                } while (!cstmchoice.equalsIgnoreCase("No"));



                //Print customize item list detail(s)


                {
                    System.out.println("\n**************** Sampath Food City ****************\n");

                    System.out.println(" \t ----------------------------------------------------------------");
                    System.out.println(" \t ----\t\t\t\tItems List\t\t\t\t----");
                    System.out.println(" \t ----------------------------------------------------------------");
                    System.out.println(" \t ---------------------------------");
                    System.out.println("\t| \tChicken            \t500 /= \t\t|");
                    System.out.println("\t| \tBeef               \t650 /= \t\t|");
                    System.out.println("\t| \tFish               \t300 /= \t\t|");
                    System.out.println("\t| \tFresh Milk         \t210 /= \t\t|");
                    System.out.println("\t| \tVanilla Milk       \t180 /= \t\t|");
                    System.out.println("\t| \tChocolate Milk     \t190 /= \t\t|");
                    System.out.println("\t| \tBiscuits           \t280 /= \t\t|");
                    System.out.println("\t| \tWater              \t300 /= \t\t|");
                    System.out.println("\t| \tMineral Water      \t450 /= \t\t|");
                    System.out.println(" \t -------------------------------------------------------------------");

                }
            }}else if (login.equals("2")) {
            System.out.println("\nCustomer name \t\t: Customer / customer");
            System.out.println("Customer password \t: 454\n");



            //Customer login


            Scanner cstmr_ID = new Scanner(System.in);
            System.out.println("Customer name \t\t: ");
            String cstmr_Name = cstmr_ID.nextLine();

            System.out.println("Customer password \t: ");
            int cstmr_pass = cstmr_ID.nextInt();

            if (cstmr_Name.equals("Customer") || cstmr_Name.equals("customer")) {
                if (cstmr_pass == 454) {
                    int ttl1 = 0;
                    int ttl2 = 0;
                    int final_ttl = 0;
                    int qnty_item2 = 0;
                    String select_Item2 = null;



                    //Selection for Item no 1


                    System.out.println("\nOrder No [1]");
                    Scanner List = new Scanner(System.in);
                    System.out.println("What item do you want (***ITEMS ARE CASE SENSITIVE***)\t\t: ");
                    String Select_Item = List.nextLine();



                    //Calculation of item's price for order no 1


                    int selectedItemPrice = itemsPrices.get(items.indexOf(Select_Item));
                    System.out.println("Price is \t\t\t\t\t\t: " + selectedItemPrice + " /=");

                    Scanner Quantity_item = new Scanner(System.in);
                    System.out.println("Quantity of your item \t\t\t: ");
                    int Qnty_item = Quantity_item.nextInt();

                    ttl1 = Qnty_item * selectedItemPrice;
                    System.out.println("Total price is \t\t\t\t\t: " + ttl1 + " /=");



                    //Additional item order  (order no 2)


                    Scanner more_Item1 = new Scanner(System.in);
                    System.out.println("\nAdd more items Yes / No \t\t: ");
                    String more_Item = more_Item1.nextLine();

                    if (more_Item.equalsIgnoreCase("Yes")) {
                        System.out.println("\n Order no [2]");
                        Scanner Menu2 = new Scanner(System.in);
                        System.out.print("What item do you want \t\t\t: ");
                        select_Item2 = Menu2.nextLine();

                        int selectedItemPrice2 = itemsPrices.get(items.indexOf(select_Item2));
                        System.out.println("Price is \t\t\t\t\t\t: " + selectedItemPrice2 + " /=");

                        Scanner Quantity_Item2 = new Scanner(System.in);
                        System.out.print("Quantity of your item \t\t\t: ");
                        qnty_item2 = Quantity_Item2.nextInt();

                        ttl2 = qnty_item2 * selectedItemPrice2;
                        System.out.println("Total price is \t\t\t\t\t: " + ttl2 + " /=");

                        final_ttl = ttl1 + ttl2;
                        System.out.println("\nTotal amount is \t\t\t\t: " + final_ttl + " /=");

                    } else if (more_Item.equalsIgnoreCase("No")) {
                        System.out.println("\nTotal amount is \t\t\t\t\t: " + ttl1 + " /=");
                    }



                    //Confirmation of Order


                    Scanner Confirm = new Scanner(System.in);
                    System.out.println("Confirm your order Yes / No \t: ");
                    String Conf = Confirm.nextLine();

                    if (Conf.equalsIgnoreCase("Yes")) {
                        System.out.println("Please wait");



                        //Printing out the order detail(s)


                        System.out.println("\n************ ORDER DETAILS ************\n");

                        System.out.println("Customer Name \t\t\t\t\t: " + cstmr_Name + "\n");

                        System.out.println("Order no [1]");
                        System.out.println("What item they ordered \t\t\t: " + Select_Item);
                        System.out.println("Quantity of item they ordered \t: " + Qnty_item);
                        System.out.println("Total price \t\t\t\t\t: " + ttl1 + " /=" + "\n");

                        if (more_Item.equalsIgnoreCase("Yes")) {
                            System.out.println("Order no [2]");
                            System.out.println("What item they ordered \t\t\t: " + select_Item2);
                            System.out.println("Quantity of item they ordered \t: " + qnty_item2);
                            System.out.println("Total price \t\t\t\t\t: " + ttl2 + " /=" + "\n");

                            System.out.println("Total price of item(s) \t\t\t: " + final_ttl + " /=");
                        }
                    } else {
                        System.out.println("THANK YOU!");
                    }
                } else {
                    System.out.println("Invalid user password!");
                }
            } else {
                System.out.println("Invalid user name!");
            }

        }


    }
}


