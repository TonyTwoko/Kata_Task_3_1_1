package tony_twoko.spring_boot_crud.dao;


import tony_twoko.spring_boot_crud.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();
    User show(int id);
    void save(User user);
    void update(int id, User userUpdate);
    void delete(int id);
}
