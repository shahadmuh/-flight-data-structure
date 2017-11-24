public class Business extends Passneger{
private int rewardPoints;

public Business(String passNo,String name,int rewardPoints){
super(passNo,name);
this.rewardPoints=rewardPoints;}

public int getRewardPoints(){
return rewardPoints;}}