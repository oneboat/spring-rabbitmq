package com.learn.rabbitmq.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ConnectionUtil {
	public static Connection getConnection() throws Exception {
		// 定义连接工厂
		ConnectionFactory factory = new ConnectionFactory();
		// 设置服务地址
		factory.setHost("localhost");
		// 端口号
		factory.setPort(5672);
		// 设置账号信息，用户名、密码、vhost
		factory.setVirtualHost("/mystore");//请注意，这个是在http://127.0.0.1:15672/#/users/learn中设置的vhost，类似一个仓库
		factory.setUsername("learn");
		factory.setPassword("learn");
		// 通过工程获取连接
		Connection connection = factory.newConnection();
		return connection;
	}
}
