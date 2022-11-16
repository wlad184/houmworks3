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
           System.out.println();

           //task #3
        int capacityVagona = 102;
        int totalSittingPlaces = 60;
        int totalStandingPlaces = capacityVagona - totalSittingPlaces; //42 места стоячих
        int passenger = 102;
            System.out.println("В вагоне " + passenger + " пассажиров");

                    if (passenger <= 60){
                        int sittingPlaces = capacityVagona - totalStandingPlaces - passenger;
                        System.out.print("В вагоне осталось " + sittingPlaces + " сидячих мест");
                        System.out.println(" и " + totalStandingPlaces + " стоячих мест");
                    }

                    if (passenger > 60){
                            if (passenger < 102) {
                                int standingPlaces = capacityVagona - passenger;
                                System.out.println("В вагоне осталось 0 сидячих мест и " + standingPlaces + " стоячих мест");
                            }
                        }

                    if (passenger >= 102){
                            System.out.println("В вагоне мест нет");
                        }



    }

}