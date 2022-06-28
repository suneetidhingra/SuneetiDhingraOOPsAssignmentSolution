package com.greatlearning.model;

public class  DriverClass {
    public static void main(String[] args) {


        SuperDepartment superDepartment = new SuperDepartment();
        String deptName;
        String getTodaysWork;
        String getWorkDeadline;
        String isTodayAHoliday;


        AdminDepartment adminDepartment = new AdminDepartment();
        deptName = adminDepartment.departmentName();
        System.out.println("Welcome to " + deptName);


        getTodaysWork = adminDepartment.getTodaysWork();
        System.out.println(getTodaysWork);

        getWorkDeadline = adminDepartment.getWorkDeadline();
        System.out.println(getWorkDeadline);

         isTodayAHoliday = adminDepartment.isTodayAHoliday();
        System.out.println(isTodayAHoliday);

        System.out.println();



        HRDepartment hrDepartment = new HRDepartment();
        deptName = hrDepartment.departmentName();
        System.out.println("Welcome to" + deptName);

        String doActivity = hrDepartment.doActivity();
        System.out.println(doActivity);

        getTodaysWork = hrDepartment.getTodaysWork();
        System.out.println(getTodaysWork);

        getWorkDeadline = hrDepartment.getWorkDeadline();
        System.out.println(getWorkDeadline);


        isTodayAHoliday  = hrDepartment.isTodayAHoliday();
        System.out.println(isTodayAHoliday);

        System.out.println();


        TechDepartment techDepartment = new TechDepartment();
        deptName = techDepartment.departmentName();
        System.out.println("Welcome to" + deptName);

        getTodaysWork = techDepartment.getTodaysWork();
        System.out.println(getTodaysWork);

        getWorkDeadline = techDepartment.getWorkDeadline();
        System.out.println(getWorkDeadline);

        String gTSI = techDepartment.getTechStackInformation();
        System.out.println(gTSI);

         isTodayAHoliday = techDepartment.isTodayAHoliday();
        System.out.println(isTodayAHoliday);
    }
}
