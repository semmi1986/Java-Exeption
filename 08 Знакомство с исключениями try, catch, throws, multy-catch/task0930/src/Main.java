import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *  Логирование состояний и ошибок в работе программы.
 *  Напишите метод, который выбрасывает проверяемое исключение и поймайте его в методе main
 *  Отловите и залогируйте начало вызова метода с ошибкой и саму ошибку уровнем INFO и WARNING соответственно
 */

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Начало выполнения программы.");

        try {
            logger.log(Level.INFO, "Начало вызова метода methodThatThrowsException.");
            methodThatThrowsException();
        } catch (Exception e) {
            logger.log(Level.WARNING, "Ошибка произошла: " + e.getMessage(), e);
        }

        logger.log(Level.INFO, "Завершение выполнения программы.");
        System.out.println("Hello world!");
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("Это проверяемое исключение.");
    }
}