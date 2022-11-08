package by.coolphone.dto;

import by.coolphone.entity.Comment;
import by.coolphone.entity.Phone;
import by.coolphone.entity.Shop;
import lombok.Builder;

import java.util.List;

@Builder
public class Response {
    Phone phone;
    List<Comment> comments;
    List<Shop> shops;
}
