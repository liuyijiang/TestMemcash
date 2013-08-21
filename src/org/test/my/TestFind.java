package org.test.my;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import net.spy.memcached.MemcachedClient;

public class TestFind {

   private MemcachedClient mc = null;
	
	public TestFind(){
	  try{
		List<InetSocketAddress> list = new ArrayList<InetSocketAddress>();
		list.add( new InetSocketAddress("192.168.2.127", 11211));
		list.add( new InetSocketAddress("192.168.2.127", 11212));
		mc = new MemcachedClient(list);
		}catch(Exception e){
			e.printStackTrace();
	   }
	}
	
	public void find(){
		for(int i=0 ;i<100;i++){
			System.out.println(mc.get("key"+i));
		}
		System.out.println("ok");
	}
	
	public static void main(String[] args) {
		TestFind t = new TestFind();
		t.find();

	}

}
