package com.controller;
	import java.util.List;
	import com.entity.PlayerEntity;
	import com.service.PlayerService;

	public class PlayerController {

		PlayerService service = null;
		public List<PlayerEntity> getAllPlayer(){
			service = new PlayerService();
			List<PlayerEntity> playerDB = service.getAllPlayer();
			return playerDB;
		}
		public void insertPlayer(int num){
			service = new PlayerService();
			service.insertPlayer(num);
		}
		public List<PlayerEntity> getTeamPlayer(String team){
			service = new PlayerService();
			List<PlayerEntity> teamplayer = service.teamPlayer(team);
			return teamplayer;
		}
		public List<PlayerEntity> getPlayersByRole(String role){
			service = new PlayerService();
			List<PlayerEntity> playerbyrole = service.playerByRole(role);
			return playerbyrole;
		}
		public boolean updateName(int jn,String upname) {
			service = new PlayerService();
			service.updateName(jn,upname);
			return true;
		}
		public boolean updateTName(int jn,String uptname) {
			service = new PlayerService();
			service.updateTname(jn,uptname);
			return true;
		}
		public boolean updateRuns(int jn,int run) {
			service = new PlayerService();
			service.updateRuns(jn,run);
			return true;
		}
		public boolean updateWickets(int jn,int wicket) {
			service = new PlayerService();
			service.updatewickets(jn,wicket);
			return true;
		}
	}

