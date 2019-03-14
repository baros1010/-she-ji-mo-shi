package Command;

import java.util.ArrayList;

public class Client {
	ArrayList commands;

	public Client() {
		commands = new ArrayList();
	}
	public void setCommand(Command command){
		commands.add(command);
	}
	 public void onButtonWasPushed(int slot) {
	        ((Command)commands.get(slot-1)).execute();
	    }
	 public static void main(String[] args) {
		 Client miPhone = new Client();
	        //创建电器
	        Light light = new Light();
	        TV tv = new TV();
	        //创建命令
	        LightOnCommand lightOnCommand = new LightOnCommand(light);
	        TVCommond tvOnCommand = new TVCommond(tv);
	        //给小米手机设置命令
	        //设置第一个按钮为开灯
	        miPhone.setCommand(lightOnCommand);
	        //设置第二个按钮为开电视
	        miPhone.setCommand(tvOnCommand);

	        //开灯
	        miPhone.onButtonWasPushed(1);
	        //开电视
	        miPhone.onButtonWasPushed(2);
	    }
}
