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
                if (ageOne >= 7 && ageOne < 18){
                    System.out.println("Ребёнок ходит в школу!");
                    }

                if (ageOne >= 18 && ageOne < 24){
                    System.out.println("Человек уже закончил школу!");

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

                if (passenger > 60 && passenger < 102){
                    int standingPlaces = capacityVagona - passenger;
                        System.out.println("В вагоне осталось 0 сидячих мест и " + standingPlaces + " стоячих мест");

                }

                if (passenger >= 102){
                    System.out.println("В вагоне мест нет");
                }


        System.out.println();

        //task #4
        int ages = 21;
        if (ages >= 18) {
            System.out.println("Поздравляем вы достигли совершеннолетия!");
        }else {
            System.out.println("Возраст совершеннолетия ещё не наступил, просим вас немного подождать!");
        }
        System.out.println();

        //task #5
        int ageTwo = 10;
        if (ageTwo >= 7 && ageTwo < 18){
            System.out.println("Ребёнок ходит в школу!");
        }else if (ageOne >= 18 && ageOne < 24){
            System.out.println("Человек уже закончил школу!");
        }else if(ageOne >= 24){
            System.out.println("Человек окончил университет!");
        }

        System.out.println();

        //task #6
        int capacityVagona1 = 102;
        int totalSittingPlaces1 = 60;
        int totalStandingPlaces1 = capacityVagona1 - totalSittingPlaces1; //42 места стоячих
        int passenger1 = 100;
        System.out.println("В вагоне " + passenger1 + " пассажиров");

        if (passenger1 <= 60){
            int sittingPlaces1 = capacityVagona1 - totalStandingPlaces1 - passenger1;
            System.out.print("В вагоне осталось " + sittingPlaces1 + " сидячих мест");
            System.out.println(" и " + totalStandingPlaces1 + " стоячих мест");
        } else if (passenger1 > 60 && passenger1 < 102) {
            int standingPlaces1 = capacityVagona1 - passenger1;
            System.out.println("В вагоне осталось 0 сидячих мест и " + standingPlaces1 + " стоячих мест");
        }else{

        //if (passenger1 >= 102){
            System.out.println("В вагоне мест нет");
        }
        System.out.println();

        //task #7
        int ageThree = 1;
        if (ageThree >=2 && ageThree <=6){
            System.out.println("Если возраст человека равен " + ageThree + " , то ему нужно ходить в детский сад");
        }
        if (ageThree >= 7 && ageThree < 18){
            System.out.println("Если возраст человека равен " + ageThree + " , то ему нужно ходить в школу");
        }else if (ageThree >= 18 && ageThree < 24){
            System.out.println("Если возраст человека равен " + ageThree + " , то его место в университете");
        }else if(ageThree >= 24){
            System.out.println("Если возраст человека равен " + ageThree + " , то ему пора ходить на работу");
        }

        System.out.println();

        //task #8
         int ageChild = 11;
         if (ageChild < 5){
             System.out.println("Ребёнку " + ageChild + " лет, он не может кататься на атракционе");
         }else if(ageChild < 14){
             System.out.println("Ребёнку " + ageChild + " лет, он может кататься на атракционе только в сопровождении взрослого");
         } else if (ageChild > 14) {
             System.out.println("Ребёнку " + ageChild + " лет, он может кататься на атракционе без сопровождения взрослого");
         }
        System.out.println();

         //task #9
        int one = 8;
        int two = 8;
        int three = 8;
        if ((one > two) && (one > three)){
            System.out.println("Число " + one + " максимальное");
        }else if (two > three){
            System.out.println("Число " + two + " максимальное");
        } else {
            System.out.println("Число " + three + " максимальное");
        }



    }

}