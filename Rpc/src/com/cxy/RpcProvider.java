package com.cxy;
/**
 * 
 * 
 * ����¶��������Ҫ���÷����export����
 * @author 15084
 *
 */
public class RpcProvider {
	public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }

}
