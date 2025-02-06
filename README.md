**Sampath Food City - POS System**

 **About This Project**
The **Sampath Food City** POS system is a simple Java-based console application designed to simulate a basic food ordering and management system. It allows both **administrators** and **customers** to interact with the system, modify the menu, and place orders. This project demonstrates core Java programming concepts such as **arrays, loops, conditional statements, user input handling, and object manipulation**.

**Features & Functionality**

**1. User Roles**
- **Admin**
  - Logs in using admin credentials.
  - Can **add**, **remove**, or **update** items in the menu.
- **Customer**
  - Logs in using customer credentials.
  - Views available food items and their prices.
  - Selects items to order, enters quantity, and calculates total price.
  - Can place multiple orders and confirm them.

**2. Menu Management**
- The menu is stored in two **ArrayLists**:
  - items (for food names)
  - itemsPrices (for corresponding prices)
- Admins can modify these lists dynamically.

**3. Order Processing**
- Customers select food items by **case-sensitive** input.
- The system fetches the corresponding price and calculates the total.
- Customers can add multiple items before confirming their order.
- Order details, including total cost, are displayed at the end.

**How It Works**
1. Run the Java program.
2. Choose to log in as **Admin** or **Customer**.
3. If **Admin**:
   - Enter credentials (Username: Admin / admin, Password: 545).
   - Choose an option to **add, remove, or modify** menu items.
   - View updated menu.
4. If **Customer**:
   - Enter credentials (Username: Customer / customer, Password: 454).
   - View the menu and select an item by name.
   - Enter the quantity and see the total price.
   - Option to add another item or finalize the order.
   - Confirm the order to complete the transaction.

