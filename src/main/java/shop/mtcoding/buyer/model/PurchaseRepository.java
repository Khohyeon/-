package shop.mtcoding.buyer.model;

import java.util.List;

public interface PurchaseRepository { // CRUD
    // Create
    public int insert(int userId, int productId);

    // Read
    public List<Purchase> findAll();

    public Purchase findById();

    // Update
    public int updateById(int userId, int productId);

    // Delete
    public int deleteById(int id);

}
