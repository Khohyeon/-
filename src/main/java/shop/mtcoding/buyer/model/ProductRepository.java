package shop.mtcoding.buyer.model;

import java.util.List;

public interface ProductRepository { // CRUD
    // Create
    public int insert(String name, int price, int qty);

    // Read
    public List<Product> findAll();

    public Product findById();

    // Update
    public int updateById(int id, String name, int price, int qty);

    // Delete
    public int deleteById(int id);

}
