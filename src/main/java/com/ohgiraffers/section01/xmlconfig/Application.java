package com.ohgiraffers.section01.xmlconfig;
import com.ohgiraffers.section01.xmlconfig.controller.MenuController;

import java.util.HashMap;
import java.util.Map;

import static com.ohgiraffers.common.Template.*;

public class Application {
    public static void main(String[] args){
        //항상 개발을 시작하기 전에 환경정보를 확인하는 습관을 들이자
        System.out.println(getSqlSession());


        //------------------------------

//        MenuController menuController = new MenuController();
//        Map<String, String> test = new HashMap<>();
//        test.put("name", "테스트 메뉴");
//        test.put("price", "3000");
//        test.put("category", "4");
//
//        menuController.registMenu(test);



        MenuController menuController = new MenuController();
        Map<String, String> test = new HashMap<>();
//        test.put("name", "테스트 메뉴");
//        test.put("price", "7777");
//        test.put("code", "4");
//        test.put("status", "Y");
//        test.put("category", "4");
//
//        menuController.modifyMenu(test);

        menuController.selectAllMenu();

//        menuController.deleteMenuByCode(4);
    }
}
