package org.test.mem;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import net.spy.memcached.MemcachedClient;

import org.test.bo.Student;

public class TestMenCashedSaveMore {
	
	private MemcachedClient mc = null;
	
	/**
	 * InetSocketAddress.class
	 * 
	 *  此类实现 IP 套接字地址（IP 地址 + 端口号）。它还可以是一个对（主机名 + 端口号），
	 *  在此情况下，将尝试解析主机名。如果解析失败，则该地址将被视为未解析 地址，但是其在某些情形下仍然可以使用，比如通过代理连接。
	 *  它提供不可变对象，供套接字用于绑定、连接或用作返回值。 
	 */
	public TestMenCashedSaveMore(){
		List<InetSocketAddress> list = new ArrayList<InetSocketAddress>();
		list.add(new InetSocketAddress("192.168.1.142", 11211));
		list.add(new InetSocketAddress("192.168.1.142", 11212));
		try{
		mc = new MemcachedClient(list);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 批量插入
	 */
	public void moreSave(){
		for(int i=0;i<1000;i++){
			Student s = new Student();
			s.setId(i+1);
			s.setName("user" + i);
			s.setJoin(new Date());
			s.setPay(10.0);
			String key = "key" + i;
			mc.set(key, 3600, s);
		}
		System.out.println("ok");
	}
	
	/**
	 * 批量获得
	 */
	public void moreGet(){
		List<String> keys = new ArrayList<String>();
//		for(int i=0;i<10;i++){
//			String key = "key" + i;
//			keys.add(key);
//		}
		Student s = (Student) mc.get("key995");
		System.out.println("name: "+ s.getName() + " id :" + s.getId());
		System.out.println("pay: "+ s.getPay());
		System.out.println("join: "+ s.getJoin());
		//mc.d
		//Map<String,Student> map = mc.getBulk(keys);
		//map.get("key2");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMenCashedSaveMore t = new TestMenCashedSaveMore();
		//t.moreSave();
        t.moreGet();
	}

}
