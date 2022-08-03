package ua.ithillel.java;

import java.util.Scanner;
import static ua.ithillel.java.Function.*;

//alt + ctrl + L

public class Main {
    public static void main(String[] args) {
        User director = new User("Director", "asd321", "Борис", DIRECTOR);
        User admin = new User("Administration", "asa123", "Алена", ADMINISTRATION);
        User manager = new User("Manager", "fad423", "Ярослав", MANAGER);
        User client = new User("Client", "zas123", "Дмитрий", CLIENT);
        User anonym = new User("Anonym", "he13s", "untitled", ANONYM);

        User[] users = {director, admin, manager, client, anonym};

        Store store = new Store("Silpo", "https://silpoonline.com", users);

        while (true) {
            tryLogin(store);
        }
    }

    public static void tryLogin(Store store) {
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