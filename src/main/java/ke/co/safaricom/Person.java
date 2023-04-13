package ke.co.safaricom;

class Person {
    private int age;
    private String gender;
    private String fullName;

    public Person() {
    }

    public Person(int age, String gender, String fullName) {
        this.age = age;
        this.gender = gender;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
