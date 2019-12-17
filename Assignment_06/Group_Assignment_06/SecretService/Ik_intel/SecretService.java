import agent.Agent;
import service_record.ServiceRecord;
public class SecretService{

  public static void main(String [] args){
  
    ServiceRecord sr = new ServiceRecord("Lieutenant Colonel", "Colonel", 20, 50);
    Agent arg = new Agent("007", "James Bond", 191083, sr);
    
    System.out.println("Agent and Service Record details before changing");
    arg.printServiceRecord();
    
    arg.promote(sr, "Brigadier General");
    
    arg.addExperiement();
    arg.missionSuccess();
    
    System.out.println("Agent and Service Record details after changing");
    arg.printServiceRecord();
  }
  
}