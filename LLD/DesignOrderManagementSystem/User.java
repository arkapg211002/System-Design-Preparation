package LowLevelDesign.DesignOrderManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {

    int userId;
    String userName;
    Address address;
    Cart userCartDetails;
    List<Integer> orderIds;

    public User(){
        userCartDetails = new Cart();
        orderIds = new ArrayList<>();
    }

    //get UserCart
    public Cart getUserCart(){
        return userCartDetails;
    }
}
