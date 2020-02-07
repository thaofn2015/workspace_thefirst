package fan.stu.entity;

public class Employee {

    private int id;

    private String name;

    private String address;

    private String email;

    private String gender;

    private String position;

    private String[] favorite;

    public Employee() {
        
    }

    public Employee(int id, String name, String address, String email, String gender, String position,
            String[] favorite) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.position = position;
        this.favorite = favorite;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String[] getFavorite() {
        return favorite;
    }

    public void setFavorite(String[] favorite) {
        this.favorite = favorite;
    }
}
