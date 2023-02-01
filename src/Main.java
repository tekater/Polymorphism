import compiletime.New;
import myth.Chimera;
import myth.Dragon;
import myth.MythicalAnimal;
import runtime.Next;
import runtime.Precedence;

public class Main {
    public static void main(String[] args) {
        New newInstance = new New();

        New newInt = new New(1,2,3);

        New newFloat = new New(1.1f,2.2f,3.3f);

        New newString = new New("1", "2", "3");

        // Полиморфизм рантайма основывается на двух принципах:
        // 1. Ссылочная переменная суперкласса (родительского) может ссылаться
        //    на любой объект "наследник" (подкласс).
        // 2. Метод суперкласса (родительского) может быть переписан
        //    в подклассе.
        Next nextInstance = new Next(10,2,3);
        Precedence precedenceInstance = new Precedence(10, 2, 3);
        Precedence mixInstance = new Next(10, 2 ,3);

        System.out.println("Precedence:\n" + precedenceInstance.calculate(4, 5, 6));
        System.out.println("\nNext:\n" + nextInstance.calculate(4, 5, 6));
        System.out.println("\nMix:\n" + mixInstance.calculate(7, 8, 9));

        MythicalAnimal chimera = new Chimera();
        MythicalAnimal dragon = new Dragon();
        MythicalAnimal myth = new MythicalAnimal();
        myth.hello();
        chimera.hello();
        dragon.hello();
    }
}