package com.client;
	
    import java.util.List;
	import java.util.Scanner;
    import com.controller.PlayerController;
	import com.entity.PlayerEntity;
    import com.entity.PlayerEntity;

	public class PlayerClient {

		public static void client() {
			Scanner sc = new Scanner(System.in);
			PlayerController control = new PlayerController();
			System.out.println("Welcome to IPL Project :-\n");
			while (true) {
				System.out.println(
						"1) Show All Players\n2) Add Players \n3) Show Players By Team \n4) Update\n5) Show Players By Role\n6) Exit");
				System.out.print("----------------------------------------------------------------\nEnter Choice : ");
				int n = sc.nextInt();
				System.out.print("----------------------------------------------------------------");
				System.out.println();
				switch (n) {
				case 1:
					System.out.println("All Players List :-\n-------------------");
					List<PlayerEntity> allPlayer = control.getAllPlayer();
					for (PlayerEntity player : allPlayer) {
						System.out.printf("%-20s%-15s%-10s%-10d%-7d\n", player.getName(), player.getRole(),
								player.getTname(), player.getRuns(), player.getWickets());
					}
					System.out.println("----------------------------------------------------------------");
					break;
				case 2:
					System.out.print("Number of Entry : ");
					int num = sc.nextInt();
					System.out.println();
					control.insertPlayer(num);
					System.out.println("----------------------------------------------------------------");
					break;
				case 3:
					System.out.print("Enter Team Name : ");
					String team = sc.nextLine().toUpperCase();
					System.out.println("\n" + team + " Players List :-\n-------------------\n");
					List<PlayerEntity> teamPlayer = control.getTeamPlayer(team);
					for (PlayerEntity player : teamPlayer) {
						System.out.printf("%-20s%-15s%-10s%-10d%-7d\n", player.getName(), player.getRole(),
								player.getTname(), player.getRuns(), player.getWickets());
					}
					System.out.println("----------------------------------------------------------------");
					break;
				case 4:
					while (true) {
						System.out.print("Update :- \n");
						System.out.println(
								"----------------------------------------------------------------\n1) Update Name \n2) Update Team Name\n3) Update Runs\n4) Update Wickets\n5) Exit.");
						System.out.println("----------------------------------------------------------------");
						System.out.print("Enter Choice : ");
						int choice = sc.nextInt();
						System.out.println("----------------------------------------------------------------");
						switch (choice) {
						case 1:
							System.out.print("Enter Jersey number : ");
							int jn = sc.nextInt();
							sc.nextLine();
							System.out.print("Enter New Name : ");
							String nm = sc.nextLine();
							System.out.println("\nUpdated.....");
							control.updateName(jn, nm);
							System.out.println("----------------------------------------------------------------");
							break;
						case 2:
							System.out.print("Enter Jersey number : ");
							int jn1 = sc.nextInt();
							sc.nextLine();
							System.out.print("Enter New Team Name : ");
							String tnm = sc.nextLine();
							System.out.println("\nUpdated.....");
							control.updateTName(jn1, tnm);
							System.out.println("----------------------------------------------------------------");
							break;
						case 3:
							System.out.print("Enter Jersey number : ");
							int jn2 = sc.nextInt();
							System.out.println();
							System.out.print("Enter Updated Runs : ");
							int run = sc.nextInt();
							System.out.println("\nUpdated.....");
							control.updateRuns(jn2, run);
							System.out.println("----------------------------------------------------------------");
							break;
						case 4:
							System.out.print("Enter Jersey number : ");
							int jn3 = sc.nextInt();
							System.out.println();
							System.out.print("Enter Updated Wickets : ");
							int wc = sc.nextInt();
							System.out.println("\nUpdated.....");
							control.updateWickets(jn3, wc);
							System.out.println("----------------------------------------------------------------");
							break;
						case 5:
							System.out.println("Thank You For Visiting !");
							sc.close();
							System.exit(0);
						}
					}
				case 5:
					System.out.print("Enter Role of the Player : ");
					String role = sc.nextLine();
					System.out.println();
					List<PlayerEntity> rolePlayer = control.getPlayersByRole(role);
					for (PlayerEntity player : rolePlayer) {
						System.out.printf("%-20s%-15s%-10s%-10d%-7d\n", player.getName(), player.getRole(),
								player.getTname(), player.getRuns(), player.getWickets());
					}
					System.out.println("-----------------------------------------------------------------");
					break;
				case 6:
					System.out.println("Thank You For Visiting !");
					sc.close();
					System.exit(0);
				}
			}
		}

		public static void main(String[] args) {
			client();
			PlayerController control = new PlayerController();
			List<PlayerEntity> playerDB = control.getAllPlayer();
			 for (PlayerEntity player : playerDB) {
			 System.out.printf("%-20s%-15s%-10s%-10d%-7d\n",player.getName(),player.getRole(),player.getTname(),player.getRuns(),player.getWickets());
			 }

			 List<PlayerEntity> teamplayer = control.getTeamPlayer("cSk");
			 for (PlayerEntity player : teamplayer) {
		      System.out.println(player);
			 }
			control.insertPlayer(1);
			 control.updateName(1,"pandya");
			 control.updateTName(512,"MI");
			 control.updateRuns(512, 1000);
			 control.updateWickets(512, 500);
			 List<PlayerEntity> playersByRole = control.getPlayersByRole("all rounder");
			 for ( PlayerEntity player : playersByRole) {
			 System.out.printf("%-20s%-15s%-5s%-10d%-7d\n",player.getName(),player.getRole(),player.getTname(),player.getRuns(),player.getWickets());
			 
			}
		}
	}

