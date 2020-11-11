package com.atguigu.springcloud.lb;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author
 * @create 2020-11-07 15:27
 */
@Component
public class MyLB implements com.atguigu.lb.LoadBalancer {


    private AtomicInteger atomicInteger = new AtomicInteger(0);

    public final int getAndIncrement(){
        int current;
        int next;
        do{
            current =this.atomicInteger.get();
            next =current >= 2147483647 ? 0 :current +1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("第幾次訪問***next:"+next+"\t"+"***current:"+current);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
        int index=getAndIncrement() % serviceInstances.size();
        System.out.println("index:"+index+"\t"+serviceInstances.get(index));
        return serviceInstances.get(index);
    }
}
