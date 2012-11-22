package org.test.mem;

import java.net.InetSocketAddress;
import java.util.Date;

import net.spy.memcached.MemcachedClient;

import org.test.bo.Student;

public class TesMemCashed {
   
	private MemcachedClient mc = null;
	
	public TesMemCashed(){
		try{
		mc = new MemcachedClient(
			    new InetSocketAddress("192.168.1.142", 11211));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//使用add添加 （当存储空间中不存在相同的key才保存）
	public void saveDataAdd(){
		Student s = new Student();//实体类必须是序列化
		s.setId(3);
		s.setName("kiss me and fuck");
		s.setPay(1100.0);
		s.setJoin(new Date());
		mc.add("jim", 3600, s);
	    System.out.println("ok");
	}
	
	//使用replace添加 （当存储空间中存在相同的key才保存）
	public void saveDataReplece(){
		Student s = new Student();//实体类必须是序列化
		s.setId(4);
		s.setName("kiss 19999");
		s.setPay(230.0);
		s.setJoin(new Date());
		mc.replace("jim", 3600, s);
	    System.out.println("ok");
	}
	
	//yog set
	public void saveDataSet(){
		Student s = new Student();//实体类必须是序列化
		s.setId(4);
		s.setName("kiss 19999 e333");
		s.setPay(22230.0);
		s.setJoin(new Date());
		mc.set("jim", 3600, s);
	    System.out.println("ok");
	}
	
	public void getData(String key){
		Student s = (Student) mc.get(key);
		System.out.println("name: "+ s.getName() + " id :" + s.getId());
		System.out.println("pay: "+ s.getPay());
		System.out.println("join: "+ s.getJoin());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
		TesMemCashed t = new TesMemCashed();
	    //t.saveDataSet();
		//for(int i=1;i<1000;i++){
			try{
				t.getData("key"+995);
			}catch(Exception e){
				System.out.println("--------------------------------------"+"key"+995);
			}
		//}
	    
		
	}

}
