package controller;

import model.Customer;
import model.Manga;
import model.ShoppingCar;

public class ControllerHome {

    private DB db = new DB();

    public Manga[][] getMangas(){
        return db.getListManga();
    }

    public ShoppingCar[][] agregarShoppingCar(Customer customer, Manga manga) {
        return db.createCarrito(customer,manga);
    }

    public Customer getCustomer(String user){
        Customer foundCustomer = db.findCustomer(user);
        if (foundCustomer != null) {
            return foundCustomer;
        }
        return null;
    }

    public Manga getManga(int user){
        Manga foundCustomer = db.findManga(user);
        if (foundCustomer != null) {
            return foundCustomer;
        }
        return null;
    }
}
