package com.mosen.simpleSample;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class PoorClient {
	
	private static RMIInterface iRMIInterface;
	
	
	public static void main(String[] args) 
			throws MalformedURLException,RemoteException,NotBoundException   {
		
		
		iRMIInterface=(RMIInterface) Naming.lookup("//localhost/HappyServer");
		System.out.println("what is your Name? ");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		
		String response=iRMIInterface.hi(name);
		System.err.println(" ****** ");
		System.err.println(response);
		
		
	}

}
