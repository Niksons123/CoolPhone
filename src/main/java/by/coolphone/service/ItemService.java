package by.coolphone.service;

import by.coolphone.entity.Bucket;
import by.coolphone.entity.Item;
import by.coolphone.entity.Phone;
import by.coolphone.repository.ItemRepository;
import by.coolphone.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public List<Item> getAllItemByBucket(Bucket bucket){
        return itemRepository.findByBucket(bucket);
    }
}
