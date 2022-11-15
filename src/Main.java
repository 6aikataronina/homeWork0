public class Main {
    public static void main(String[] args) {
        String nameAge;
        final int NUM = 1;
        String word = "Wife";
        nameAge = NUM + word;
        System.out.println(NUM + word + nameAge);

        if (NUM < 0){
            System.out.println("Вы сохранили отрицательное число!");
        }else if(NUM > 0){
            System.out.println("Вы сохранили положительное число!");
        }else {
            System.out.println("Вы сохранили ноль!");
        }

    }
}