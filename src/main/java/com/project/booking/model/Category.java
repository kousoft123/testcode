package com.project.booking.model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
@Data
@EqualsAndHashCode
@ToString
public class Category {

    @Id
    private String id;

    private String name;
}