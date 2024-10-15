package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.entity.PlayerEntity;
import com.utility.Utility;
//import com.service.Player;

public class PlayerDao {
	
    PlayerEntity player=null;     
    ResultSet rs = null;
	List<PlayerEntity> playerDB=null;
	
	public void playersData() {
		player=new PlayerEntity();
	}
		public List<PlayerEntity> getAllPlayer() 
		{
			playerDB = new ArrayList<PlayerEntity>();
			String query= "SELECT * FROM player";
			try {
				rs=Utility.CreateConnection().executeQuery(query);
			while(rs.next())
			{
				int jn = rs.getInt("Jn");
				String name = rs.getString("Name");
				String tname = rs.getString("Tname");
				String role = rs.getString("Role");
				int runs = rs.getInt("Runs");
				int wickets = rs.getInt("Wickets");
				player=new PlayerEntity(jn,name,tname,role,runs,wickets);
				playerDB.add(player);
			}
			Utility.CloseConnection();
			rs.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
			return playerDB;
	}
  public  boolean insertPlayer(int jn,String name,String tname,String role,int runs,int wickets) {
	         player=new PlayerEntity(jn,name,tname,role,runs,wickets);
	         String query="INSERT INTO player VALUES("+player.getJn()+ ";"+player.getName()+ " ;"+player.getTname()+ ";"+player.getRole()+ ";"+player.getRuns()+";"+player.getWickets()+")";
	      try {
		     Utility.CreateConnection().execute(query);
		     Utility.CloseConnection();
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	      return true;
  }
public void updateName(int jn,String upname) {
	String query= "UPDATE player SET Name= '"+upname+ "'where jn="+jn;
	
	try {
		Utility.CreateConnection().execute(query);
		Utility.CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	
}
public boolean updateTname(int jn,String updateTeam) {
	String query="UPDATE player SET Tname='"+updateTeam+ "'where jn="+jn;
	try {
		Utility.CreateConnection().execute(query);
		Utility.CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	return true;
}
public boolean updateRuns(int jn,int updateRuns) {
	String query="UPDATE player SET run='"+updateRuns+ "'where jn="+jn;
	try {
		Utility.CreateConnection().execute(query);
		Utility.CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	return true;
}
public boolean updateWicket(int jn,int updateWicket) {
	String query="UPDATE player SET wicket='"+updateWicket+ "'where jn="+jn;
	try {
		Utility.CreateConnection().execute(query);
		Utility.CloseConnection();
	} catch (SQLException e) {
		System.out.println(e);
		e.printStackTrace();
	}
	return true;
}

}

