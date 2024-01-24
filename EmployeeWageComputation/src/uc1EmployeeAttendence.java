public class uc1EmployeeAttendence {
    public static final int is_part_time = 1;
    public static final int is_full_time = 2;

    private final String company;
    private final int emp_rate_per_hour;
    private final int num_of_working_days;
    private final int max_hrs_in_month;
    private int totalEmpWage;

    public uc1EmployeeAttendence(String company, int emp_rate_per_hour, int num_of_working_days, int max_hrs_in_month) {
        this.company = company;
        this.emp_rate_per_hour = emp_rate_per_hour;
        this.num_of_working_days = num_of_working_days;
        this.max_hrs_in_month = max_hrs_in_month;
    }

    public void computeEmpWage() {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= max_hrs_in_month && totalWorkingDays < num_of_working_days) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case is_part_time:
                    empHrs = 4;
                    break;
                case is_full_time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * emp_rate_per_hour;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage ;
    }

    public static void main(String[] args) {
        uc1EmployeeAttendence dMart = new uc1EmployeeAttendence("DMart", 20, 20, 100);
        uc1EmployeeAttendence jio = new uc1EmployeeAttendence("Jio", 15, 23, 100);
        dMart.computeEmpWage();
        System.out.println(dMart);
        jio.computeEmpWage();
        System.out.println(jio);
    }

}


