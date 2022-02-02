package Entities;

public class Employee {

    private String name;
    private Integer hour;
    private Double valuePerHour;

    public Employee(){

    }

    public Employee(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Integer getHour() {
        return hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double payment(){
        return hour * valuePerHour;
    }
}
