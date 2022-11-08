package by.coolphone.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SaveCommentDto {

    LocalDateTime createDate;
    int rating;
    String description;
    String model;
}
