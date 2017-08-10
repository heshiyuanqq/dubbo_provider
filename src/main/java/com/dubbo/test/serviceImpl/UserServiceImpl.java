package com.dubbo.test.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dubbo.test.pojo.User;
import com.dubbo.test.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{

	public static ArrayList<User>  db=new ArrayList<User>();
	
	static{
		  db.add(new User("0001", "何世远", "15801636814", "15801636814@163.com", "河南省信阳市", 0, 27,new String[]{"琴","棋","书","画","诗","词","歌","赋"}));
		  db.add(new User("0002", "何世兴", "15801636815", "15801636815@163.com", "河南省信阳市", 0, 28,new String[]{"画","诗","词"}));
		  db.add(new User("0003", "何世广", "15801636816", "15801636816@163.com", "河南省信阳市", 0, 29,new String[]{"琴","棋","书"}));
		  db.add(new User("0004", "何世洋", "15801636817", "15801636817@163.com", "河南省信阳市", 0, 35,new String[]{"棋","书","画","诗","词"}));
		  db.add(new User("0005", "何世玉", "15801636818", "15801636818@163.com", "河南省信阳市", 0, 29,new String[]{"棋","书","画","诗","词","歌","赋"}));
		  db.add(new User("0006", "何世昌", "15801636819", "15801636819@163.com", "河南省信阳市", 0, 33,new String[]{"琴","棋"}));
		  db.add(new User("0007", "zhangsan ", "15801636820", "15801636820@163.com", "河南省漯河市", 0, 45,new String[]{"书","画","词","赋"}));
		  db.add(new User("0008", "lisi", "15801636821", "15801636821@163.com", "河南省洛河市", 0, 67,new String[]{"画","词"}));
		  db.add(new User("0009", "wangwu", "15801636822", "15801636822@163.com", "河南省驻马店市", 0, 23,new String[]{"书","画","词"}));
		  db.add(new User("0010", "zhangfei", "15801636823", "15801636823@163.com", "河南省驻马店市", 0, 34,new String[]{"书","诗","词"}));
		  db.add(new User("0011", "songjiang", "15801636824", "15801636824@163.com", "河南省驻马店市", 0, 56,new String[]{"书","画","诗"}));
		  db.add(new User("0012", "wuyong", "15801636825", "15801636825@163.com", "河南省郑州市", 0, 13,new String[]{"书","画"}));
		  db.add(new User("0013", "guanyu", "15801636826", "15801636826@163.com", "河南省郑州市", 0, 24,new String[]{"棋","书"}));
		  db.add(new User("0014", "貂蝉", "15801636827", "15801636827@163.com", "河南省郑州市", 1, 45,new String[]{"棋","书"}));
		  db.add(new User("0015", "王昭君", "15801636828", "15801636828@163.com", "河南省郑州市", 1, 23,new String[]{"词","歌"}));
		  db.add(new User("0016", "yangguifei", "15801636829", "15801636829@163.com", "河南省郑州市", 1, 23,new String[]{"词","歌"}));
		
	}
	
	
	public User getUserById(String id) {
		for (User user : db) {
			  if(user.getId().equals(id)){
				  return user;
			  }
		}
		return null;
	}

	public List<User> getUserListByAge(Integer age) {
		ArrayList<User> arrayList = new ArrayList<User>();
		for (User user : db) {
			  if(user.getAge()==age){
				  arrayList.add(user);
			  }
		}
		if(arrayList.size()>0){
			return arrayList;
		}
		return null;
	}

	public List<User> getUserListByAddress(String address) {
		ArrayList<User> arrayList = new ArrayList<User>();
		for (User user : db) {
			  if(user.getAddress().equals(address)){
				  arrayList.add(user);
			  }
		}
		if(arrayList.size()>0){
			return arrayList;
		}
		return null;
	}

	public List<User> getUserListByGender(Integer gender) {
		ArrayList<User> arrayList = new ArrayList<User>();
		for (User user : db) {
			  if(user.getGender()==gender){
				  arrayList.add(user);
			  }
		}
		if(arrayList.size()>0){
			return arrayList;
		}
		return null;
	}

	public List<User> getUserListByHobby(String hobby) {
		ArrayList<User> arrayList = new ArrayList<User>();
		for (User user : db) {
			    String[] hobbys = user.getHobbys();
			    if(hobbys==null||hobbys.length==0){
			    	continue;
			    }else{
			    	for(int i=0;i<hobbys.length;i++){
			    		if(hobbys[i].equals(hobby)){
			    			arrayList.add(user);
			    			break;
			    		}
			    	}
			    }
		}
		if(arrayList.size()>0){
			return arrayList;
		}
		return null;
	}

	public List<User> getUserListByHobbys(String[] hobby) {
		return null;
	}

	public String getString() {
		return "hello";
	}

	public int getint() {
		return 13;
	}

	public Integer getInteger() {
		return new Integer(13);
	}

	public float getfloat() {
		return 1.33f;
	}

	public Float getFloat() {
		return new Float(1.33f);
	}

	public boolean getboolean() {
		return true;
	}

	public Boolean getBoolean() {
		return new Boolean(true);
	}

}
