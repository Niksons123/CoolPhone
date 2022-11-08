package by.coolphone.repository;

import by.coolphone.entity.Phone;
import by.coolphone.entity.ProductPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductPhoneRepository extends JpaRepository<ProductPhone, Long> {
    List<ProductPhone> findProductPhonesByPhone(Phone phone);
}
