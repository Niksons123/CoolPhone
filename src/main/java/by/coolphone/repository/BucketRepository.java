package by.coolphone.repository;

import by.coolphone.entity.Bucket;
import by.coolphone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketRepository extends JpaRepository<Bucket, Long> {

    Bucket findByUser(User user);
}
