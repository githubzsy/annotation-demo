package com.example.profiledemo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Fruit {

    // 当前环境名称
    private String name;

    @Override
    public String toString() {
        return "当前环境:"+name;
    }
}