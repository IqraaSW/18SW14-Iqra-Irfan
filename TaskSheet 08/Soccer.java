import Task2.Sports;
class Soccer extends Sports{
public String getName(){
return "Generic Soccer";
}
public void getNumberOfTeamMembers(){
System.out.println("Each team has 11 players in"+ getName());
}
}