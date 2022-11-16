public class Main {
    public static void main(String[] args) {

        //task #1
        int age = 21;
        if (age >= 18) {
            System.out.println("Поздравляем вы достигли совершеннолетия!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, просим вас немного подождать!");
        }
        System.out.println();


        //task #2
        int ageOne = 10;
        if (ageOne >= 7){
            if (ageOne < 18) {
                System.out.println("Ребёнок ходит в школу!");
            }
        }
         if (ageOne >= 18){
             if (ageOne < 24) {
                 System.out.println("Человек уже закончил школу!");
             }
        }
           if (ageOne >= 24){
                  System.out.println("Человек окончил университет!");

        }

    }

}