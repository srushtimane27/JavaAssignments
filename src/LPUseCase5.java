public class LPUseCase5 {
    public static void main(String[] args) {
        int FullDayEmployeeWage = 120;
        int DaysInMonth = 20 ;
        int EmployeeWagePerMonth = 0;

        for (int i=1; i<=20; i++){
            EmployeeWagePerMonth = EmployeeWagePerMonth+(i*FullDayEmployeeWage);
        }
        System.out.println("EmployeeWagePerMonth= " + EmployeeWagePerMonth);

        }
    }

