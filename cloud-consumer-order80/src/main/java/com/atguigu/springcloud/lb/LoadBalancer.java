package com.atguigu.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author
 * @create 2020-11-07 15:25
 */

public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
