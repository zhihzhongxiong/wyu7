import java.util.Objects;

public class Emp {
    private String name;
    private String age;
    private String sex;
    private String salary;
    private String date;

    public Emp(String name, String age, String sex, String salary, String date) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return Objects.equals(name, emp.name) &&
                Objects.equals(age, emp.age) &&
                Objects.equals(sex, emp.sex) &&
                Objects.equals(salary, emp.salary) &&
                Objects.equals(date, emp.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, salary, date);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", salary='" + salary + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
