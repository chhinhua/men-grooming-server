package com.example.mengrooming.payload;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import java.util.Date;
import java.util.Set;

/**
 * @author Chhin_Hua - 12/05
 **/

@Data
public class ProductDto {
    private long id;

    @NotBlank
    @Size(min = 1, max = 255)
    private String name;

    private String brand;

    @Positive
    @Digits(integer = 10, fraction = 2)
    private double price;

    @NotNull
    private Date createdAt;

    private String description;

    @NotBlank
    @URL
    private String imageURL;

    private Set<CommentDto> comments;

    private Long categoryId;
}
