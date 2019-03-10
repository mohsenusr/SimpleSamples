package com.mosen.simpleSample;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote {
		public String hi(String name) throws RemoteException;
}
