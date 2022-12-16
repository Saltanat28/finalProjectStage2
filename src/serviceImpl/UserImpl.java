package serviceImpl;

import model.Book;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserImpl implements UserService {
    private List<User> user = new ArrayList<>();



    @Override
    public String createUser(List<User> users) {
        user.addAll(users);

        return this.user.toString();
    }

    @Override
    public List<User> findAllUsers() {
        return user;
    }

    @Override
    public User findUserById(Long id) {

        return user.stream().filter(user1 -> user1.getId().equals(id)).findAny().orElseThrow();
    }

    @Override
    public String removeUserByName(String name) {

        return null;
    }

    @Override
    public void updateUser(Long id) {

    }

    @Override
    public void groupUsersByGender() {

    }

    @Override
    public String buyBooks(String name, List<Book> books) {
        return null;
    }
}
