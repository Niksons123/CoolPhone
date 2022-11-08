package by.coolphone.repository;

import by.coolphone.entity.Bucket;
import by.coolphone.entity.Item;
import by.coolphone.entity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findByBucket(Bucket bucket);


}
