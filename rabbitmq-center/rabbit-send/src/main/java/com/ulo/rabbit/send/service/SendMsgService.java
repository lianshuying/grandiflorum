package com.ulo.rabbit.send.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SendMsgService {

        @Autowired
        private RabbitTemplate rabbitTemplate;

        public Boolean SendMsg(String msg){

            String message1 = "队列1信息是"+msg;
            String message2 = "队列2信息是"+msg;


              CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
//            rabbitTemplate.convertAndSend("topicExchange","queue.key.No1",message1,correlationId);
//            System.out.println(message1);
//            rabbitTemplate.convertAndSend("topicExchange","queue.key.No2",message2,correlationId);
//            System.out.println(message2);


            System.out.println("开始发送消息");
            Object  response = rabbitTemplate.convertSendAndReceive("topicExchange", "queue.key.No1", msg, correlationId);
            System.out.println("结束发送消息" );
            System.out.println("消费者响应 : " + response + " 消息处理完成");

            return true;

        }


}
