package by.coolphone.dto;

import by.coolphone.entity.Comment;
import by.coolphone.entity.Phone;
import by.coolphone.entity.ProductPhone;
import by.coolphone.entity.enums.DisplayType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Phone phone;
    private List<Comment> comments;
    private List<ProductPhone> productPhones;
}
