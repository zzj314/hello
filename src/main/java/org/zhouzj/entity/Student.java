package org.zhouzj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {

    private static final long serialVersionUID = 343698732506724476L;
    private String name;
    private int age;

    public static void main(String[] args) {
        System.out.println();
      
    }


}
