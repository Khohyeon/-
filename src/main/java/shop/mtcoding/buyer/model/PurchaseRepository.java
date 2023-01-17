package shop.mtcoding.buyer.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

public interface PurchaseRepository {

    @Setter
    @Getter
    public class Purchase {
        private Integer id;
        private Integer userId;
        private Integer productId;
        private Timestamp createdAt;
    }
}
