package com.scispike.adapter;

public abstract class Logger {
	
	abstract public void trace(String str);
	abstract public void debug(String str);
	abstract public void log(String str);
	public static Logger create() {
		return new ApacheCommonsLogAdapter();
	}
}
