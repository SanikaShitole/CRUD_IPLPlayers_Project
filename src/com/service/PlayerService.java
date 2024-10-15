package com.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.PlayerDao;
import com.entity.PlayerEntity;

public class PlayerService {
	
	 PlayerDao dao=null;  //custom v
	Scanner sc=new Scanner(System.in);
	
	 public List<PlayerEntity>getAllPlayer(){
		 dao=new PlayerDao();
		 List<PlayerEntity>db=dao.getAllPlayer();
		 
	
		return db; 
	 }
public void insertPlayer(int num) {
	dao=new PlayerDao();
	int count=1;
	while(num>0) {
		System.out.println("\nenter the jursey number");
		int jn=sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println();
		
		System.out.println("enter the Teamname of player");
		String tname=sc.nextLine();
		System.out.println();

		System.out.println("enter the role of the player ");
		String role=sc.nextLine();
		System.out.println();
		
		System.out.println("\nenter total runs");
		int runs=sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		System.out.println("\nenter total wicket number");
		int wickets=sc.nextInt();
		sc.nextLine();
		System.out.println();
		
	    dao.insertPlayer(jn,name,tname,role,runs,wickets);
		count++;
		num--;

	}
	
}
public List<PlayerEntity> teamPlayer(String team) {
	       dao=new PlayerDao();
	       List<PlayerEntity>db =dao.getAllPlayer();
	       List<PlayerEntity>teamplayer=new ArrayList<PlayerEntity>();
	       for (PlayerEntity player : db) {
	    	   
	    	   if(player.getTname().toLowerCase().equals(team.toLowerCase())) {
	    		  
	    		   teamplayer.add(player);
	    		   
	    	   }	
		}
	       return teamplayer;
}
public List<PlayerEntity> playerByRole(String role) {
	      dao=new PlayerDao();
	           List<PlayerEntity> db=dao.getAllPlayer();
	           List<PlayerEntity> byrole=new ArrayList();
	           for (PlayerEntity player : byrole) {
				
	        	   if(player.getRole().toLowerCase().equals(role.toLowerCase())) {
	        		   byrole.add(player);
	        		  
	        	   }
			}
	           return byrole;
}
public boolean updateName(int jn,String upname) {
	dao=new PlayerDao();
	dao.updateName(jn, upname);
	return true;
	 
	
}
public boolean updateTname(int jn,String tname) {
	dao=new PlayerDao();
	dao.updateTname(jn, tname);
	return true;
	
}
public boolean updateRuns(int jn,int runs) {
	dao=new PlayerDao();
	dao.updateRuns(jn, runs);
	return true;
	
}
public boolean updatewickets(int jn,int updateWicket) {
	dao=new PlayerDao();
	dao.updateWicket(jn, updateWicket);
	return true;
	
}
}
