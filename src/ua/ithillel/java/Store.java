package ua.ithillel.java;

public class Store {
    //alt + ctrl + L
    private User authorised;
    private String url;
    private String name;
    private User[] users;


    public Store(String name, String url, User[] users) {
        this.name = name;
        this.url = url;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User getAuthorised() {
        return authorised;
    }

    public void setAuthorised(User authorised) {
        this.authorised = authorised;
    }

    public boolean login(String name, String password) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getLogin().equals(name) && users[i].getPassword().equals(password)) {
                authorised = users[i];
                return true;
            }
        }
        return false;
    }

    public void getCurrentUserRights(User authorised) {
        switch (authorised.getRole()) {
            case DIRECTOR:
                System.out.println("Директор магазина, может управлять кадрами, и ценами");
                break;
            case ADMINISTRATION:
                System.out.println("Администратор магазина, может добавлять товары и редактировать их описание");
                break;
            case MANAGER:
                System.out.println("Менеджер магазина, может общаться с клиентами");
                break;
            case CLIENT:
                System.out.println("Клиент магазина, может покупать товары и пользоваться дисконтом");
                break;
            case ANONYM:
                System.out.println("Анонимный пользователь, может покупать товары и/или авторизоваться");
                break;
        }
    }

    public void logout(User authorised) {
        authorised = null;
        System.out.println("Пользователь вышел из системы");
    }
}