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
	        //��������
	        Light light = new Light();
	        TV tv = new TV();
	        //��������
	        LightOnCommand lightOnCommand = new LightOnCommand(light);
	        TVCommond tvOnCommand = new TVCommond(tv);
	        //��С���ֻ���������
	        //���õ�һ����ťΪ����
	        miPhone.setCommand(lightOnCommand);
	        //���õڶ�����ťΪ������
	        miPhone.setCommand(tvOnCommand);

	        //����
	        miPhone.onButtonWasPushed(1);
	        //������
	        miPhone.onButtonWasPushed(2);
	    }
}
