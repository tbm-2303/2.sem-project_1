public class Customer {

    String first_Name;
    String last_Name;
    int id;


    public Customer(String first_Name, String last_Name, int id) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.id = id;
    }

    public String getName() {
        return first_Name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.first_Name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
