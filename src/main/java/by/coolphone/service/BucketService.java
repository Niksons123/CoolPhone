package by.coolphone.service;

import by.coolphone.entity.Bucket;
import by.coolphone.entity.User;
import by.coolphone.repository.BucketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class BucketService {

    private final BucketRepository bucketRepository;
    private final UserService userService;

    public Bucket findOrCreateBucket(String username){
        User user = userService.findByUsername(username);
        if (user != null) {
            Bucket bucket = bucketRepository.findByUser(user);
            return Objects.requireNonNullElseGet(bucket, () -> bucketRepository.save(new Bucket(user)));
        }
        return null;
    }
}
