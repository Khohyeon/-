package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository { // CRUD
    // Create
    public int insert(String username, String password, String email);

    // Read
    public List<User> findAll();

    public User findById();

    // Update
    public int updateById(int id, String password);

    // Delete
    public int deleteById(int id);

}
