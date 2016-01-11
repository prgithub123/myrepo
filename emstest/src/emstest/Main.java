package emstest;

import com.tibco.tibjms.admin.QueueInfo;
import com.tibco.tibjms.admin.TibjmsAdmin;
import com.tibco.tibjms.admin.TibjmsAdminException;

public class Main {

	public static void main(String[] args) {
		
		String serverUrl = "tcp://localhost:7222";
		String userName = "user";
		String password = "pass;
		 
		try {
			TibjmsAdmin admin = new TibjmsAdmin(serverUrl, userName, password);
			QueueInfo[] queues = admin.getQueues();
			System.out.println("Kolejek: " + queues.length);
			System.out.println("---");
			
			for (int i = 0; i < queues.length; i++) {
				System.out.println(queues[i].getName() + ", pending msgs: " + queues[i].getPendingMessageCount());
			}
			 
		} catch (TibjmsAdminException e) {
			e.printStackTrace();
		}
		
	}

}
