class Hockey{

     static void getTeamMembers(String[] teamMembers){
	 
	 System.out.println("Inside getTeamMembers()");
	 
	 System.out.println("Size of team members" + teamMembers.length);
	 
	 System.out.println("List of team members are");
	 
	 for(int index = 0; index < teamMembers.length; index++){
	 
	     System.out.println(teamMembers[index]);
	 
	}
	
	System.out.println("End of getTeamMembers()");
	 
  }

}