package com.avijitsamanta.Collage;

public class EmployeesMain {
    static class Employee {

        private String eid;

        public Employee() {
            this.eid = null;
        }

        public void calculateSalary(int hour, int experience) {
        }

        public void calculateSalary(int hour) {
        }

        public String getEid() {
            return eid;
        }

        public void setEid(String eid) {
            this.eid = eid;
        }
    }

    static class SoftwareDeveloper extends Employee {
        @Override
        public void calculateSalary(int hour, int experience) {
            super.calculateSalary(hour, experience);
            int salary;
            if (experience > 5)
                salary = 6000 * hour;
            else
                salary = 2500 * hour;

            System.out.println("SoftwareDeveloper Salary is " + salary);
        }
    }

    static class Gatekeeper extends Employee {
        @Override
        public void calculateSalary(int hour) {
            super.calculateSalary(hour);
            System.out.println("Gatekeeper Salary is " + (500 * hour));
        }
    }

    static class Manager extends Employee {
        @Override
        public void calculateSalary(int hour, int experience) {
            super.calculateSalary(hour, experience);
            int salary;
            if (experience > 10)
                salary = hour * 7500;
            else
                salary = hour * 3250;

            System.out.println("Manager Salary is " + salary);
        }
    }

    public static void main(String[] args) {
        SoftwareDeveloper sod = new SoftwareDeveloper();
        sod.setEid("E_152-SOF");
        System.out.println(sod.getEid());
        sod.calculateSalary(8, 3);

        Gatekeeper gatekeeper = new Gatekeeper();
        gatekeeper.setEid("E_110-EFD");
        System.out.println(gatekeeper.getEid());
        gatekeeper.calculateSalary(16);

        Manager manager = new Manager();
        manager.setEid("E_189-MM");
        System.out.println(manager.getEid());
        manager.calculateSalary(14, 12);

    }
}
