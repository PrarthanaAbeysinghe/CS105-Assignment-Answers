package agent;
import service_record.ServiceRecord;
public class Agent{

  public String codeName;
  private String realName;
  private int idNumber;
  private ServiceRecord serviceRecord;

  public Agent(String code_name, String real_name, int id, ServiceRecord sr) {
    this.codeName = code_name;
    this.realName = real_name;
    this.idNumber = id;
    this.serviceRecord = sr;
  }

  public void setRealName(String realName){
    
    this.realName = realName;
  }

  public String getRealName(){

    return this.realName;
  }
  public void setID(int idNumber){
    
    this.idNumber = idNumber;
  }
  public int getID(){

    return this.idNumber;
  }
  public void promote(ServiceRecord sr, String newRank){
    
    String current = sr.getCurrentRank(); 
    String prev = sr.getPreviousRanks();
    sr.setPreviousRanks(prev + "," +current);
    sr.setCurrentRank(newRank);
  }
  public void missionSuccess(){

    serviceRecord.incrementSuccessfulMissionCount();
  }
  public void addExperiement(){

    serviceRecord.incrementYearsOfService();
  }
  public void printServiceRecord(){

    System.out.println(codeName+"\t"+realName+"\t"+idNumber+"\t"+serviceRecord.getPreviousRanks()+"\t"+serviceRecord.getCurrentRank()+"\t"+serviceRecord.getYearsOfService()+"\t"+serviceRecord.getSuccessfulMissionCount());
  }
  }