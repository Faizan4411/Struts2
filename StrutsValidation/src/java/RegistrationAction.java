
import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport {
    private String name;
	private String surname;
	private String password;
	private String fatherName;
	private String brotherName;
	private String address;
        private String email;
	private String city;
	private String zip;
	private String gender;
        private String numberStr;
        private String cnic;

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
	
    public String getSurname(){
            return surname;
    }
    public void setSurname(String surname){
            this.surname=surname;
    }

    public String getPassword() {
    return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	
    public String getFatherName(){
            return fatherName;
    }
    public void setFatherName(String fatherName){
            this.fatherName=fatherName;
    }

    public String getBrotherName(){
            return brotherName;
    }
    public void setBrotherName(String brotherName){
            this.brotherName=brotherName;
    }

    public String getAddress(){
            return address;
    }
    public void setAddress(String address){
            this.address=address;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	
	public String getCity(){
		return city;
	}
	public void setCity(String city){
		this.city=city;
	}
	
	public String getZip(){
		return zip;
	}
	public void setZip(String zip){
		this.zip=zip;
	}
	
	public String getGender(){
		return gender;
	}
	public void setGender(String gender){
		this.gender=gender;
	}

    public String getNumberStr() {
        return numberStr;
    }

    public void setNumberStr(String numberStr) {
        this.numberStr = numberStr;
    }
    
   public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

        

    

   
   
    public void validate() {
        if (name == null || name.trim().isEmpty()) {
            addFieldError("name", "name is required");
        }
		
        if (surname == null || surname.trim().isEmpty()) {
            addFieldError("surname", "Surname is required");
        }
		
        if (password == null || password.trim().isEmpty()) {
            addFieldError("password", "Password is required");
        }
		
        if (fatherName == null || fatherName.trim().isEmpty()) {
            addFieldError("fatherName", "Father Name is required");
        }
		
        if (brotherName == null || brotherName.trim().isEmpty()) {
            addFieldError("brotherName", "Brother Name is required");
        }
		
        if (address == null || address.trim().isEmpty()) {
            addFieldError("address", "Address is required");
        }
		
        if (email == null || email.trim().isEmpty()) {
            addFieldError("email", "Email is required");
        } else if (!email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            addFieldError("email", "Invalid email format");
        }
		
        if (city == null || city.trim().isEmpty()) {
            addFieldError("city", "City is required");
        }
        
        if (zip == null || zip.trim().isEmpty()) {
            addFieldError("zip", "Zip is required");
        }
		
	if (gender == null || gender.trim().isEmpty()) {
            addFieldError("gender", "Gender is required");
        }
        
        boolean containsNonDigit = false;
        
        for (char c : numberStr.toCharArray()) {
            if (!Character.isDigit(c)) {
                containsNonDigit = true;
                break;
            }
        }
        
        if (containsNonDigit) {
            addFieldError("numberStr", "Please Only number Enter ");
        } else {
            int number=numberStr.length();
            if(!(number==11)){
               addFieldError("numberStr", "number is 11  required");
            }
        }
        
        if (cnic == null || cnic.isEmpty()) {
            addFieldError("cnic", "CNIC is required");
        } else {
            // Validate CNIC format using regex
            if (!cnic.matches("\\d{5}-\\d{7}-\\d")) {
                addFieldError("cnic", "Invalid CNIC format. Correct format: XXXXX-XXXXXXX-X");
            }
        }
        
        
      

        
        
    }

   
    public String execute() {
       
        return SUCCESS;
    }
}