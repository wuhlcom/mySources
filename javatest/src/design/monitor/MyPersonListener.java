package com.sp.client.protocol.event.monitor;

//实现监听器接口中的方法
class MyPersonListener implements PersonListener {

    @Override
    public void dorun(Even even) {
        Person person = even.getPerson();//拿到事件源
        System.out.println("人在跑之前执行的动作");
    }

    @Override
    public void doeat(Even even) {
        System.out.println("人在吃之前执行的动作");
    }

}