package view;

import controller.ControllerLogin;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //Variables globales
        boolean status = false;
        NarBar login = NarBar.LOGIN;
        Scanner sc = new Scanner(System.in);
        ControllerLogin controller = new ControllerLogin();
        String option, username, password;


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
                        System.out.println("Validacion de identidad exitosa");
                    }
                    break;
                case "2":
                    break;
                default:
                    System.out.println("Opcion seleciona no es la correcta");

            }


            status = true;
        }while (!status);
    }
}
