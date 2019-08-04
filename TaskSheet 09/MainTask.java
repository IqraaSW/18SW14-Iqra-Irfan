class InvalidAgeException extends Exception{
	InvalidAgeException (String s){
	super(s);
	}
}
class VotingMachine{
	String [] candi_names;
	int votes[];
    public void addCandidates(String[] names){
    candi_names=names;
    votes=new int[candi_names.length];
    }
    public void castVote(int voterAge,String voterToCandidate)
    throws InvalidAgeException{
    if(voterAge<18){
    throw new InvalidAgeException("Invalid Age");
    }
    else
    {
    for(int i=0;i<candi_names.length;i++){
    if(candi_names[i]==voterToCandidate)
    {votes[i]++;}
    }
    }
    }

    public void printResult(){
    	for(int i=0;i<candi_names.length;i++){
    		System.out.println(candi_names[i]+"                        "+votes[i]);
    	}
    	}
    }

    class MainTask{
    public static void main(String args[]){
    VotingMachine v =new VotingMachine();
    String names[]={"Ramsha","Manahil","Shaan","Iqra"};

    try{
    v.addCandidates(names);
    v.castVote(20,"Ramsha");
    v.castVote(18,"Manahil");
    v.castVote(20,"Shaan");
    v.castVote(19,"Iqra");
    v.printResult();
    }
    catch(InvalidAgeException i){
    System.out.println(i);
    }
    }
}