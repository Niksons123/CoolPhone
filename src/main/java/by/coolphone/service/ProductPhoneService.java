package by.coolphone.service;

import by.coolphone.entity.ProductPhone;
import by.coolphone.repository.ProductPhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductPhoneService {
    private final ProductPhoneRepository productPhoneRepository;

    public ProductPhone find(Long id) {
        return productPhoneRepository.findById(id).orElse(null);
    }
}
