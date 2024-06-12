package view;

import controller.ControllerHome;
import controller.ControllerLogin;
import model.Customer;
import model.Manga;
import model.ShoppingCar;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Variables globales
        boolean status = false;
        NarBar login = NarBar.LOGIN;
        Scanner sc = new Scanner(System.in);
        ControllerLogin controller = new ControllerLogin();
        ControllerHome homeController = new ControllerHome();
        String option, username,idmanga;


        //Buble para mostrar las opciones de menu
        do{
            System.out.println(login.getDescription());
            System.out.println("Seleccione una opcion");
            option = sc.nextLine();

            switch (option){
                case "1":
                    System.out.print("Ingrese su usuario: ");
                    username = sc.nextLine();

                    if (controller.validateUser(username)) {
                        NarBar home = NarBar.HOME;

                        while(!status){
                            System.out.println();
                            System.out.println(home.getDescription());
                            System.out.println("Seleccione una opcion");
                            option = sc.nextLine();

                            switch (option){
                                case "1":
                                    System.out.println("Listado de mangas");
                                    Manga[][] lista = homeController.getMangas();
                                    for (int i = 0; i < lista.length; i++) {
                                        for (int j = 0; j < lista[i].length; j++) {
                                            System.out.println(lista[i][j]);
                                        }
                                    }
                                    System.out.println();
                                    break;
                                case "2":
                                    Customer cliente = homeController.getCustomer(username);
                                    System.out.println("Ingrese el identificador del manga ");
                                    idmanga = sc.nextLine();
                                    Manga manga = homeController.getManga(Integer.parseInt(idmanga));
                                    ShoppingCar[][] venta = homeController.agregarShoppingCar(cliente,manga);
                                    for (int i = 0; i < venta.length; i++) {
                                        for (int j = 0; j < venta[i].length; j++) {
                                            System.out.println(venta[i][j]);
                                        }
                                    }
                                    System.out.println();
                                    break;
                                case "0":
                                    System.exit(0);
                                    status = true;
                                default:
                                    System.out.println();
                            }
                        }

                    }else{
                        System.out.println("Credenciales invalidas \n");
                    }
                    break;
                case "0":
                    System.exit(0);
                    status = true;
                default:
                    System.out.println();

            }

        }while (!status);
    }
}
