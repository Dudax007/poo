import java.util.Scanner;

public class GradeAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalStudents = 0;

        while (totalStudents <= 0) {
            System.out.print("Digite a quantidade de estudantes: ");
            if (scanner.hasNextInt()) {
                totalStudents = scanner.nextInt();
                if (totalStudents <= 0) {
                    System.out.println("A quantidade de estudantes deve ser maior que zero.");
                }
            } else {
                System.out.println("Por favor, digite um número inteiro válido.");
                scanner.next(); 
            }
        }

        int[] grades = new int[totalStudents];

        for (int i = 0; i < totalStudents; i++) {
            int grade = -1;
            while (grade < 0 || grade > 100) {
                System.out.print("Digite a nota do estudante " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    grade = scanner.nextInt();
                    if (grade < 0 || grade > 100) {
                        System.out.println("Nota inválida! A nota deve estar no intervalo de 0 a 100.");
                    }
                } else {
                    System.out.println("Por favor, digite um número inteiro válido.");
                    scanner.next(); 
                }
            }
            grades[i] = grade;
        }

        double average = calculateAverage(grades);
        int highest = findHighestGrade(grades);
        int lowest = findLowestGrade(grades);
        int aboveOrEqualAverage = countGradesAtOrAboveAverage(grades);
        int[] frequency = calculateFrequency(grades);

        System.out.println();
        System.out.printf("Média da turma: %.2f%n", average);
        System.out.println("Maior nota: " + highest);
        System.out.println("Menor nota: " + lowest);
        System.out.println("Notas acima ou iguais à média: " + aboveOrEqualAverage);
        
        System.out.println("\nDistribuição de notas:");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println(formatFrequencyLine(i, frequency[i]));
        }

        scanner.close();
    }

    public static double calculateAverage(int[] grades) {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static int findHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }
        return highest;
    }

    public static int findLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        return lowest;
    }

    public static int countGradesAtOrAboveAverage(int[] grades) {
        double average = calculateAverage(grades);
        int count = 0;
        for (int grade : grades) {
            if (grade >= average) {
                count++;
            }
        }
        return count;
    }

    public static int[] calculateFrequency(int[] grades) {
        int[] frequency = new int[11]; 
        for (int grade : grades) {
            if (grade == 100) {
                frequency[10]++;
            } else {
                int index = grade / 10; 
                frequency[index]++;
            }
        }
        return frequency;
    }

    public static String formatFrequencyLine(int index, int frequency) {
        if (index == 10) {
            return String.format("100: %d", frequency);
        } else {
            int startRange = index * 10;
            int endRange = startRange + 9;
            return String.format("%02d-%02d: %d", startRange, endRange, frequency);
        }
    }
}