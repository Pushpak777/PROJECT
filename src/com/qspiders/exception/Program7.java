package com.qspiders.exception;

import java.io.IOException;

class Developer
{
	void startWorking () throws IOException
	{
		System.out.println("start working...");
		throw new IOException();
		
	}
}
class TeamLead
{
	void assignProject() throws IOException
	{
		System.out.println("assign the project to the team");
		Developer d1=new Developer();
		d1.startWorking();
		
		
	}
}
class Manager
{
	void allocateProject() throws IOException
	{
		System.out.println("allocates Prject");
		TeamLead t1=new TeamLead();
		t1.assignProject();
	}
}
public class Program7 {

	public static void main(String[] args) {
		Manager m=new Manager();
		try
		{
			m.allocateProject();
		}
		catch (IOException e) {
			e.printStackTrace();
			
		}
	

	}

}
