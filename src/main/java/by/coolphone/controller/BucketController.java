package by.coolphone.controller;

import by.coolphone.entity.Bucket;
import by.coolphone.entity.Item;
import by.coolphone.entity.ProductPhone;
import by.coolphone.service.BucketService;
import by.coolphone.service.ItemService;
import by.coolphone.service.ProductPhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
@RequestMapping("/bucket")
public class BucketController {

    private final BucketService bucketService;
    private final ProductPhoneService productPhoneService;
    private final ItemService itemService;

    @PostMapping("/add-item")
    private String addItem(@RequestParam Long productPhoneId, @AuthenticationPrincipal User principal) {
        Bucket bucket = bucketService.findOrCreateBucket(principal.getUsername());
        ProductPhone productPhone = productPhoneService.find(productPhoneId);
        itemService.saveItem(new Item(productPhone, bucket));
        return "index";
    }

    @GetMapping("/show-bucket")
    private String showItemsInBucket(@AuthenticationPrincipal User principal, Model model){
        Bucket bucket = bucketService.findOrCreateBucket(principal.getUsername());
        model.addAttribute("items", itemService.getAllItemByBucket(bucket));
        return "bucket";
    }
}
