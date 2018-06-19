package Oops;

public class Encap {

	private String name;
	private int id;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getId(){
		return id;
	}
	public void  setId(int id){
		this.id=id;
		
	}
	
	// (Or)
	/*private String username;
	 private String password;
	 
	 public void setUsername(String username){
		 this.username=username;
	 }
	 public void setPassword(String password){
		 this.password=password;
	 }
	 public String getUsername(){
		 return username;
	 }
	 public String getPassword(){
	     return password;		
		}*/

}
