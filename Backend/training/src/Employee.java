public class Employee{
    private int id;
    private String name;
    private String email;
    private int registrationNumber;
    private Company company;

    public Employee(int id, String name, String email, int registrationNumber, Company company){
        this.id = id;
        this.name = name;
        this.email = email;
        this.registrationNumber = registrationNumber;
        this.company = company;
    }

    public int getId(){
        return id;
    }

    public void setId(int emId){
    this.id = emId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
    this.email = email;
    }

    public int getRegistrationNumber(){
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber){
    this.registrationNumber = registrationNumber;
    }

    public Company getCompany(){
        return company;
    }

    public void setCompany(Company company){
    this.company = company;
    }    
}