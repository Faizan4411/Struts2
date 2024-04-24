
public class Strudent{
	private String name;
	private String fatherName;
	private String rollNo;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setFatherName(String fatherName){
		this.fatherName=fatherName;
	}
	public String getFatherName(){
		return fatherName;
	}
	
	public void setRollNo(String rollNo){
		this.rollNo=rollNo;
		
	}
	public String getRollNo(){
		
		return rollNo;
	}
	
	public String execute(){
		return "success";
	}
}
