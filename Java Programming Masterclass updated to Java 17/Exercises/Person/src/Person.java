public class Person {

    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100){
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }

    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }
        else {
            return false;
        }
    }

    public String
}
