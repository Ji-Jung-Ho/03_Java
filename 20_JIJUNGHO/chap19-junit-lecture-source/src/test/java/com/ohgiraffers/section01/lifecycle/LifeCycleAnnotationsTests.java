package com.ohgiraffers.section01.lifecycle;

import org.junit.jupiter.api.*;

/* 테스트 메소드의 실행 전 후에 동작하는 어노테이션을 사용할 수 있다. */
public class LifeCycleAnnotationsTests {

    /* 테스트 수행 전 필요한 자원을 설정하는 역할의 메소드 */
    @BeforeAll // : 테스트 수행 전 한번만 실행
    static void beforeAll() {
        System.out.println("before all 동작...");
    }

    @BeforeEach
        // : 테스트 수행 전 반복 실행
    void beforeEach() {
        System.out.println("before each 동작...");
    }

    @AfterAll // : 테스트 후 한번 실행
    static void afterAll() {
        System.out.println("affter all 동작...");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each 동작...");
    }

    @Test
    void test1() {
        System.out.println("테스트 코드 1");
    }

    @Test
    void test2() {
        System.out.println("테스트 코드 2");
    }

}
