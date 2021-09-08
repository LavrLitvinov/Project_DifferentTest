package StreamApiEcsempels;

public class OurForest {
    private String name;
    private String familia;
    private int age;
    private String profession;
    private int salary;
    private Position position;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familia='" + familia + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getFamilia() {
        return familia;
    }

    public int getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    public OurForest(String name, String familia, int age, String profession, int salary, Position position) {
        this.name = name;
        this.familia = familia;
        this.age = age;
        this.profession = profession;
        this.salary = salary;
        this.position = position;
    }

    enum Position {
        VEDMA, LESHYI, FAIRY, XRYN, VATERMAN, FORESTER
    }

}
