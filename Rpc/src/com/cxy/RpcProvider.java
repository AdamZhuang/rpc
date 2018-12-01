package com.cxy;
/**
 * 
 * 
 * 服务暴露方法，需要调用服务的export方法
 * @author 15084
 *
 */
public class RpcProvider {
	public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
