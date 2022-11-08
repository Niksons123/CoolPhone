package by.coolphone.service;

import by.coolphone.dto.ProductDto;
import by.coolphone.entity.Comment;
import by.coolphone.entity.Phone;
import by.coolphone.entity.ProductPhone;
import by.coolphone.repository.CommentRepository;
import by.coolphone.repository.PhoneRepository;
import by.coolphone.repository.ProductPhoneRepository;
import by.coolphone.repository.ShopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final PhoneRepository phoneRepository;
    private final CommentRepository commentRepository;
    private final ProductPhoneRepository productPhoneRepository;

    public ProductDto get(Long id) {
        Phone phone = phoneRepository.findById(id).orElse(null);
        List<Comment> comments;
        List<ProductPhone> productPhones;
        if (phone != null) {
            comments = commentRepository.findCommentsByPhone(phone);
            productPhones = productPhoneRepository.findProductPhonesByPhone(phone);
        } else {
            comments = Collections.emptyList();
            productPhones = Collections.emptyList();
        }
        return new ProductDto(phone, comments, productPhones);
    }


}
