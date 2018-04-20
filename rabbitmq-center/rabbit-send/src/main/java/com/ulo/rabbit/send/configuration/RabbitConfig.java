package com.ulo.rabbit.send.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfig {

    //声明队列
    @Bean
    public Queue queueNo1(){
        return new Queue("send.Msg.No1",true);//true表示持久化该队列
    }

    @Bean
    public Queue queueNo2(){
        return new Queue("send.Msg.No2",true);
    }

    //声明交换器
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }

    //绑定
    @Bean
    public Binding bindingNo1(){
        return BindingBuilder.bind(queueNo1()).to(topicExchange()).with("queue.key.No1");
    }

    @Bean
    public Binding bindingNo2(){
        return BindingBuilder.bind(queueNo2()).to(topicExchange()).with("queue.key.No2");
    }















}
