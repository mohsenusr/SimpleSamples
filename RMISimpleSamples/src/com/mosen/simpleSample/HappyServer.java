package com.mosen.simpleSample;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HappyServer extends UnicastRemoteObject implements RMIInterface {

    private static final long serialVersionUID = 1L;
    
	protected HappyServer() throws RemoteException {
		super();
	}

	@Override
	public String hi(String name) throws RemoteException {
 		System.err.println(name+ " say hi");
 		return String.format( "hi {0} , I'm  happy server ",name) ;
 		
	}
	
	public static void main(String[] args) {
		
		try {
			Naming.rebind("//localhost/HappyServer", new HappyServer());
			System.err.println("Server is ready ...");
			
			
		} catch (Exception e) {
			System.err.println(e.toString());
			e.printStackTrace();
		}
	}

	
	
}
