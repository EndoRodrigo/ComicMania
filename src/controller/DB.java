package controller;

import model.Customer;

public class DB {

    Customer[][] db_customer = new Customer[][]{
            {new Customer(2, "EndoRodrigo", "endo@gmail.com",15.5f, true)},
            {new Customer(1, "UserTest","test@gmail.com",18.9f,false)}
    };

    public boolean findUser(String name){

        for (int i = 0; i < db_customer.length; i++) {
            for (int j = 0; j < db_customer[i].length; j++) {
                if (name.equals(db_customer[i][j].getNombre())) {
                    return true;
                }
            }
        }
        return false;
    }
}
