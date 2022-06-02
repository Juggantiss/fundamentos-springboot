package com.fundamentos.springboot.fundamentos.bean;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyBean2Implement implements MyBean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion 2 propia del bean 2");
        log.info("Probando log de lombok");
        log.error("Error en log de lombok");
    }
}
