public class PhoneApp {
    public static void main(String[] args) {
        
        System.out.println("--- Iniciando Testes de Validação ---\n");

        try {
            System.out.println("Teste 1: Tentando criar Phone com nome vazio...");
            Phone p1 = new Phone("", "1234567890123456");
        } catch (ValidationException e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        try {
            System.out.println("\nTeste 2: Tentando criar Phone com serial inválido...");
            Phone p2 = new Phone("iPhone 15", "12345");
        } catch (ValidationException e) {
            System.out.println("Capturado: " + e.getMessage());
        }

        try {
            System.out.println("\nTeste 3: Tentando criar Phone com dados corretos...");
            Phone p3 = new Phone("Samsung S24", "SN-98765432101234");
            System.out.println("Sucesso: Objeto '" + p3.getName() + "' instanciado!");
        } catch (ValidationException e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        System.out.println("\n--- Fim dos Testes ---");
    }
}