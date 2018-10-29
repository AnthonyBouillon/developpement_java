package Client;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 80010-37-15
 */
public class Main_client{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_line;
        String name = "";
        String firstname = "";
        String address = "";
        String city = "";
        System.out.println("Combien de personne voulez vous saisir ?");
        number_line = sc.nextInt();
        for (int i = 0; i < number_line; i++) {
            System.out.println("Saisissez les informations de la personne ");
            name = sc.nextLine();
            firstname = sc.nextLine();
            address = sc.nextLine();
            city = sc.nextLine();
            new Client(name, firstname, address, city); 
        }
          
    }
}
