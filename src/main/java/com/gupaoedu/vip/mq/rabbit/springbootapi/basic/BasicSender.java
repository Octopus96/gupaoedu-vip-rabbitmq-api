package com.gupaoedu.vip.mq.rabbit.springbootapi.basic;


import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.gupaoedu.vip.mq.rabbit.springbootapi.basic")
public class BasicSender {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasicSender.class);
        RabbitAdmin rabbitAdmin = context.getBean(RabbitAdmin.class);
        RabbitTemplate rabbitTemplate = context.getBean(RabbitTemplate.class);

        rabbitTemplate.convertAndSend("","GP_BASIC_FIRST_QUEUE_FORM_SPRINGBOOT","-------- a direct msg");

        rabbitTemplate.convertAndSend("GP_BASIC_TOPIC_EXCHANGE_FORM_SPRINGBOOT","shanghai.gupao.teacher","-------- a topic msg : shanghai.gupao.teacher");
        rabbitTemplate.convertAndSend("GP_BASIC_TOPIC_EXCHANGE_FORM_SPRINGBOOT","changsha.gupao.student","-------- a topic msg : changsha.gupao.student");

        rabbitTemplate.convertAndSend("GP_BASIC_FANOUT_EXCHANGE_FORM_SPRINGBOOT","","-------- a fanout msg");

    }
}
