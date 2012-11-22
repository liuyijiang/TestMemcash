package org.test.mem;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.test.bo.Student;

import net.spy.memcached.MemcachedClient;

public class TestInitConsistentHashMemcash {
  
    private MemcachedClient mc = null;
	
	public TestInitConsistentHashMemcash(){
		List<InetSocketAddress> list = new ArrayList<InetSocketAddress>();
		list.add(new InetSocketAddress("192.168.1.142", 11211));
		list.add(new InetSocketAddress("192.168.1.142", 11212));
		try{
		mc = new MemcachedClient(list);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void saveDataAdd(){
		Student s = new Student();//实体类必须是序列化
		s.setId(3);
		s.setName("kiss me and fucksss123");
		s.setPay(1100.0);
		s.setJoin(new Date());
		mc.add("pps", 3600, s);
	    System.out.println("ok");
	}
	
	public void getData(String key){
		Student s = (Student) mc.get(key);
		System.out.println("name: "+ s.getName() + " id :" + s.getId());
		System.out.println("pay: "+ s.getPay());
		System.out.println("join: "+ s.getJoin());
	}
	
	public void showMemcashInofr(){
		//
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
		TestInitConsistentHashMemcash t = new TestInitConsistentHashMemcash();
		
	    t.saveDataAdd();
	   // t.getData("jim");
		
	}
	
	
	
}
