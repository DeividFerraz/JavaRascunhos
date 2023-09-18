import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma lista de usuários
        List<User> userList = new ArrayList<>();

        // Criando alguns objetos User
        User user1 = new User("João");
        User user2 = new User("Maria");
        User user3 = new User("Pedro");

        // Adicionando os usuários à lista
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        // Acessando os elementos da lista
        User firstUser = userList.get(0);
        System.out.println("Primeiro usuário: " + firstUser.getName());

        // Iterando sobre a lista
        for (User user : userList) {
            System.out.println("Usuário: " + user.getName());
        }

        // Removendo um usuário da lista
        userList.remove(user2);

        // Verificando o tamanho da lista
        int size = userList.size();
        System.out.println("Tamanho da lista: " + size);
    }
}

class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

