package service_record;
public class ServiceRecord{

  private String previousRanks;
  private String currentRank;
  private int yearsOfService;
  private int successfulMissionCount;

  public ServiceRecord(String previousRanks, String currentRank, int yearsOfService,int successfulMissionCount) {
    this.previousRanks = previousRanks;
    this.currentRank = currentRank;
    this.yearsOfService = yearsOfService;
    this.successfulMissionCount = successfulMissionCount;
  }

public void setPreviousRanks(String previousRanks){
  
  this.previousRanks = previousRanks;
}

public String getPreviousRanks(){
  
  return this.previousRanks;
}

public void setCurrentRank(String currentRank){

  this.currentRank = currentRank;
}
public String getCurrentRank(){

  return this.currentRank;
}
public int getYearsOfService(){

 return this.yearsOfService;
}
public int getSuccessfulMissionCount(){

  return this.successfulMissionCount;
}
public void incrementSuccessfulMissionCount( ){

  successfulMissionCount += 1;
}
public void incrementYearsOfService( ){

  yearsOfService += 1;
}
}