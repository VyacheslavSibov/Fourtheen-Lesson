package ua.ithillel.java;

import java.util.Scanner;
import static ua.ithillel.java.Function.*;

//alt + ctrl + L

public class Main {
    public static void main(String[] args) {
        User director = new User("Director", "asd321", "Борис", Director);
        User admin = new User("Administration", "asa123", "Алена", Administration);
        User manager = new User("Manager", "fad423", "Ярослав", Manager);
        User client = new User("Client", "zas123", "Дмитрий", Client);
        User anonym = new User("Anonym", "he13s", "untitled", Anonym);

        User[] users = {director, admin, manager, client, anonym};

        Store store = new Store("Silpo", "https://silpoonline.com", users);

        while (true) {
            Login(store);
        }
    }
    public static void Login(Store store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин:");
        String login = scanner.nextLine();
        System.out.println("Введите пароль:");
        String password = scanner.nextLine();

        if (store.login(login, password)) {
            store.getCurrentUserRights(store.getAuthorised());
            store.logout(store.getAuthorised());
        } else {
            System.out.println("Неверный логин и/или пароль");
        }
    }
}