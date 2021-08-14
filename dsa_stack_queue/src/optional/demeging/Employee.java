package optional.demeging;

public class Employee {
    private String name = "";
    private boolean isMale = false;
    private String birthday;

    public Employee() {
    }

    public Employee(String name, boolean isMale, String birthday) {
        this.name = name;
        this.isMale = isMale;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void printAllInfor(){
        String print = this.name +","+ this.birthday +",";
        if (this.isMale())
            print += "Male";
        else
            print += "Female";
        System.out.println(print);
    }

    public String getAllInfor(){
        String print = this.name +","+ this.birthday +",";
        if (this.isMale())
            print += "Male";
        else
            print += "Female";
        return print;
    }
}
