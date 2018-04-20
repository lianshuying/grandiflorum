package com.ulo.rabbit.received.content;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitListener(queues = "send.Msg.No1")
    public String processMessage1(String msg) {
        System.out.println(Thread.currentThread().getName() + " 接收到来自send.Msg.No1队列的消息：" + msg);

        //这里可以把信息存储起来，后面做核对任务，在业务管理后台中查看情况

        //1.不是立即执行的业务，将数据存入数据库中，然后返回信息即可，然后通过定时器查找
        //2.时间紧急业务，那么就开设一个线程，执行后续操作业务
        return "这个是我返回的信息";
    }


    @RabbitListener(queues = "send.Msg.No2")
    public void processMessage2(String msg) {
        System.out.println(Thread.currentThread().getName() + " 接收到来自send.Msg.No2队列的消息：" + msg);
    }



}
