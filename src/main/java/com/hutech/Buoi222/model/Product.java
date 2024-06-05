package com.hutech.Buoi222.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String description;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private String avatar;
    private List<String> avatars = new ArrayList<>();

    public void addAvatar(String avatar) {
        this.avatars.add(avatar);
    }
    @Transient
    private MultipartFile avatarFiles; // thêm trường này
}