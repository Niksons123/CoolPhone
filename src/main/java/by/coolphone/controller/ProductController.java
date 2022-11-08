package by.coolphone.controller;

import by.coolphone.dto.ProductDto;
import by.coolphone.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    private String getProduct(@PathVariable Long id, Model model) {
        ProductDto productDto = productService.get(id);
        model.addAttribute("product", productDto);
        return "product";
    }


}
