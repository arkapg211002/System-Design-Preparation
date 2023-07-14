package LowLevelDesign.DesignOrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){
        Main mainObj = new Main();

        //1. create warehouses in the system
        List<Warehouse> warehouseList = new ArrayList<>();
        warehouseList.add(mainObj.addWarehouseAndItsInventory());

        //2. create users in the system
        List<User> userList = new ArrayList<>();
        userList.add(mainObj.createUser());

        //3. feed the system with the initial informations
        ProductDeliverySystem productDeliverySystem = new ProductDeliverySystem(userList, warehouseList);


        mainObj.runDeliveryFlow(productDeliverySystem, 1);
    }



    private Warehouse addWarehouseAndItsInventory(){

        Warehouse warehouse = new Warehouse();

        Inventory inventory = new Inventory();

        inventory.addCategory(0001, "Peppsii Large Cold Drink" , 100);
        inventory.addCategory(0004, "Doovee small Soap" , 50);

        //CREATE 3 Products

        Product product1 = new Product();
        product1.productId = 1;
        product1.productName = "Peepsii";

        Product product2 = new Product();
        product2.productId = 2;
        product2.productName = "Peepsii";

        Product product3 = new Product();
        product1.productId = 3;
        product1.productName = "Doovee";


        inventory.addProduct(product1, 0001);
        inventory.addProduct(product2, 0001);
        inventory.addProduct(product3, 0004);

        warehouse.inventory = inventory;
        return warehouse;
    }


    private User createUser(){
        User user = new User();
        user.userId = 1;
        user.userName = "SJ";
        user.address = new Address(230011, "city", "state");
        return user;
    }

    private void runDeliveryFlow(ProductDeliverySystem productDeliverySystem, int userId){


        //1. Get the user object
        User user = productDeliverySystem.getUser(userId);

        //2. get warehouse based on user preference
       Warehouse warehouse = productDeliverySystem.getWarehouse(new NearestWarehouseSelectionStrategy());

        //3. get all the inventory to show the user
        Inventory inventory = productDeliverySystem.getInventory(warehouse);

        ProductCategory productCategoryIWantToOrder = null;
        for(ProductCategory productCategory : inventory.productCategoryList){

            if(productCategory.categoryName.equals("Peppsii Large Cold Drink")){
                productCategoryIWantToOrder = productCategory;
            }
        }


        //4. add product to the cart
        productDeliverySystem.addProductToCart(user, productCategoryIWantToOrder, 2);


        //4. place order
        Order order = productDeliverySystem.placeOrder(user, warehouse);


        //5. checkout
        productDeliverySystem.checkout(order);

    }
}
