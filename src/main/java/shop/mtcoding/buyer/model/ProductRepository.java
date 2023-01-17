package shop.mtcoding.buyer.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

public interface ProductRepository {

    @Setter
    @Getter
    public class Product {
        private Integer id;
        private String name;
        private Integer price;
        private Integer qty;
        private Timestamp createdAt;
    }
}
