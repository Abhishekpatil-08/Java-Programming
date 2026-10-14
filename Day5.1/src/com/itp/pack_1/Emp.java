package com.itp.pack_1;

public abstract class Emp {
    private int id;
    private String name;
    private int DeptId;
    private double Basicsalary;

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", DeptId=" + DeptId + ", Basicsalary=" + Basicsalary + "]";
    }

    public Emp(int id, String name, int deptId, double basicsalary) {
        super();
        this.id = id;
        this.name = name;
        DeptId = deptId;
        Basicsalary = basicsalary;
    }


    public double getBasicsalary() {

        return Basicsalary;
    }

    public void setBasicsalary(double basicsalary) {

        Basicsalary = basicsalary;
    }

    public abstract double computeNetSalary();

}
