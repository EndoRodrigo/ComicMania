package controller;

import model.Customer;
import model.Manga;
import model.ShoppingCar;

import java.util.List;

public class DB {

    Customer[][] db_customer = new Customer[][]{
            {new Customer(2, "EndoRodrigo", "endo@gmail.com",15.5f, true)},
            {new Customer(1, "UserTest","test@gmail.com",18.9f,false)}
    };

    Manga[][] db_manga = new Manga[][]{
            {new Manga(1, "Naruto", "Masashi Kishimoto")},
            {new Manga(2, "One Piece", "Eiichiro Oda")},
            {new Manga(3, "Attack on Titan", "Hajime Isayama")},
            {new Manga(4, "My Hero Academia", "Kohei Horikoshi")},
            {new Manga(5, "Death Note", "Tsugumi Ohba")}
    };

    ShoppingCar[][] db_compra = new ShoppingCar[1][1];



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

    public Manga[][] getListManga() {
        return db_manga;
    }

    public ShoppingCar[][] createCarrito(Customer data, Manga mangs){

        for (int i = 0; i < db_compra.length; i++) {
            for (int j = 0; j < db_compra[i].length; j++) {
                    db_compra[i][j] = new ShoppingCar(data.getId(),data.getNombre(),mangs.getId(),mangs.getName(),mangs.getAuthor(),mangs.getCantidad(),mangs.getPrecio());
            }
        }

        return db_compra;
    }

    public Customer findCustomer(String user) {
        for (Customer[] customerArray : db_customer) {
            for (Customer customer : customerArray) {
                if (customer.getNombre().equalsIgnoreCase(user)) {
                    return customer;
                }
            }
        }
        return null;
    }

    public Manga findManga(int user) {
        for (Manga[] customerArray : db_manga) {
            for (Manga customer : customerArray) {
                if (customer.getId() == user) {
                    return customer;
                }
            }
        }
        return null;
    }


}
