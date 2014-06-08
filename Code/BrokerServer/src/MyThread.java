/*
 * Author   : Zhou Cheng
 * Date     : 2014-6-8
 * Project  : BrokerServer
 * Filename : MyThread.java
 * 
 * All rights reserved.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Hashtable;

public class MyThread extends Thread {
	Socket socket = null;
	PrintWriter os = null;
	BufferedReader is = null;
	String password = null;
	Hashtable<Integer, MyProcess> processes = null;

	public MyThread(Socket socket, String password, Hashtable<Integer, MyProcess> processes) {
		this.socket = socket;
		this.password = password;
		this.processes = processes;
		try {
			this.os = new PrintWriter(this.socket.getOutputStream());
			this.is = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

	public void run() {
		try {
			String data = is.readLine();
			data = MyAES.decrypt(data, password);
			MyFIX mf = new MyFIX(data);
			int fid = Integer.parseInt(mf.getTag(101));
			String ret = null;
			MyProcess process = processes.get(fid);
			if (null == process) {
				MyAddProcess.add(fid, processes);
				process = processes.get(fid);
			}
			ret = process.procData(data);
			ret = MyAES.encrypt(ret, password);
			os.println(ret);
			os.flush();
			is.close();
			os.close();
			socket.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}
}