package day46;


public class SlackUser {
	private String name, email;
	int groupNum;
	
		public SlackUser() {
		//by calling 3 args constructor
		//you may set default value to your own info
		this("classChat", "spartan1@cybertek.com", 20);
	}
	

	public SlackUser(String name, String email, int groupNum) {
		
			this.name = name;
			this.email = email;
			this.groupNum = groupNum;
		}

	//special method that being called for getting String representation of an object
	//it ll be automatically called when object is being printed using sysout
	
	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	}
	
	public void sendMessage(String channel, String content) {
		System.out.println(this.name + " send message " + content + " to channel " + channel);
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getGroupNum() {
		return groupNum;
	}

	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	
}
