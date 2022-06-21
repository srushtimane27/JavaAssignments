public class LPUseCase6 {
    public static void main(String[] args) {
        int totalWorkingHours = 100;
        int wagePerHour = 20;
        int totalSum = 0;

        for (int i=1; i<=100; i++){
            totalSum = totalSum+(i*wagePerHour);
        }
        System.out.println("totalSum= "+ totalSum);

        }
    }
