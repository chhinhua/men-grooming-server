package com.example.mengrooming.payload;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Chhin_Hua - 29/03
 **/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
    private Long id;

    @Size(min = 2, message = "Category name should have at least 2 characters")
    private String name;

    private String description;
}
