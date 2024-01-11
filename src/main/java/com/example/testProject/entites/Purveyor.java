//package com.example.testProject.entites;
//import com.example.demo.enums.Type;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//public class Purveyor {
//
//}
//package com.example.demo.entites;
//
//
//import com.example.demo.enums.Type;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@Table(name = "users_table")
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//    private Integer age;
//    private String course;
//    @OneToMany(cascade = CascadeType.ALL)
//    List<Product> userProducts;
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
//    private String name;
//    @Enumerated(EnumType.STRING)
//    private Type type;
//    private String description;
//    private int price;
//    private String created_date;
//    @ManyToOne
//    User owner;