package org.test.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TestJson t = new TestJson();
		t.bean2json();

	}
	
	 public void arr2json() {  
	        boolean[] boolArray = new boolean[] { true, false, true };  
	        JSONArray jsonArray = JSONArray.fromObject(boolArray);  
	        System.out.println(jsonArray);  
	        // prints [true,false,true]  
	    }  
	  
	    public void list2json() {  
	        List list = new ArrayList();  
	        list.add("first");   
	        list.add("second");  
	        JSONArray jsonArray = JSONArray.fromObject(list);  
	        System.out.println(jsonArray);  
	        // prints ["first","second"]  
	    }  
	  
	    public void createJson() {  
	        JSONArray jsonArray = JSONArray.fromObject("['json','is','easy']");  
	        System.out.println(jsonArray);  
	        // prints ["json","is","easy"]  
	    }  
	  
	    public void map2json() {  
//	        map.put("name", "json");  
//	        map.put("bool", Boolean.TRUE);  
//	        map.put("int", new Integer(1));  
//	        map.put("arr", new String[] { "a", "b" });  
//	        map.put("func", "function(i){ return this.arr[i]; }");  
//	  
//	        JSONObject json = JSONObject.fromObject(map);  
//	        System.out.println(json);  
	        // prints  
	        // ["name":"json","bool":true,"int":1,"arr":["a","b"],"func":function(i){  
	        // return this.arr[i]; }]  
	    }  
	  
	    public void bean2json() { 
	    	Man m = new Man();
	    	m.setId(1);
	    	m.setName("jimliy");
	        JSONObject jsonObject = JSONObject.fromObject(m);  
	        System.out.println(jsonObject.toString());  
	        /* 
	         * prints  
	         * {"func1":function(i){ return this.options[i]; 
	         * },"pojoId":1,"name":"json","func2":function(i){ return 
	         * this.options[i]; }} 
	         */  
	    }  
	    
//	    public void json2bean(){
//	    	String str = "{\"id\":1,\"name\":\"jimliy\"}";
//	    	JSONObject.
//	    }
	  
//	    public void json2bean() {  
//	    	String str = "{\"id\":1,\"name\":\"jimliy\"}";  
//	        JSONObject jb = JSONObject.
//	        JSONObject.toBean(jb, Man.class);  
//	        System.out.println();  
//	    }  

}
