package jungleRum;

import java.util.ArrayList;


public class Race {

    static void register(Runner runner, ArrayList smallList, ArrayList mediumList, ArrayList advancedList) {
        switch (runner.getCategory()) {
            case "small":
                smallList.add(runner);
                runner.setRegistrationNumber(smallList.size());
                break;
            case "medium":
                mediumList.add(runner);
                runner.setRegistrationNumber(mediumList.size());
                break;
            case "advanced":
                advancedList.add(runner);
                runner.setRegistrationNumber(advancedList.size());
                break;
            default:
        }
    }

    static void showList (ArrayList<Runner> list) {
        list.forEach(runner -> runner.showRunner());
    }

    static void deleteRunner (Runner runner, ArrayList smallList, ArrayList mediumList, ArrayList advancedList) {
        switch (runner.getCategory()) {
            case "small":
                smallList.remove(runner);
                runner.setRegistrationNumber(smallList.size());
                break;
            case "medium":
                mediumList.remove(runner);
                runner.setRegistrationNumber(mediumList.size());
                break;
            case "advanced":
                advancedList.remove(runner);
                runner.setRegistrationNumber(advancedList.size());
                break;
            default:
        }
    }

    static void showPrice (Runner runner) {
        System.out.println(runner.getPrice());
    }

    public static void main(String[] args){

        ArrayList<Runner> smallList = new ArrayList<Runner>();
        ArrayList<Runner> mediumList = new ArrayList<Runner>();
        ArrayList<Runner> advancedList = new ArrayList<Runner>();



        Runner runner1 = new Runner();
        runner1.setRg("38.987.463-1");
        runner1.setFirstName("AAAAAAAA");
        runner1.setLastName("XXXXXXX");
        runner1.setAge(16);
        runner1.setCelPhone("(12) 99323-9292");
        runner1.setEmergencyNumber("(12) 99323-0000");
        runner1.setBloodGroup("O+");
        runner1.setCategory("small");
        runner1.setPrice();

        Runner runner2 = new Runner();
        runner2.setRg("38.987.463-1");
        runner2.setFirstName("BBBBBBB");
        runner2.setLastName("ZZZZZZZ");
        runner2.setAge(20);
        runner2.setCelPhone("(12) 99323-9292");
        runner2.setEmergencyNumber("(12) 99323-0000");
        runner2.setBloodGroup("O+");
        runner2.setCategory("advanced");
        runner2.setPrice();

        Runner runner3 = new Runner();
        runner3.setRg("38.987.463-1");
        runner3.setFirstName("CCCCCCC");
        runner3.setLastName("PPPPPPP");
        runner3.setAge(25);
        runner3.setCelPhone("(12) 99323-9292");
        runner3.setEmergencyNumber("(12) 99323-0000");
        runner3.setBloodGroup("O+");
        runner3.setCategory("medium");
        runner3.setPrice();

        Runner runner4 = new Runner();
        runner4.setRg("38.987.463-1");
        runner4.setFirstName("DDDDDDDD");
        runner4.setLastName("KKKKKKKK");
        runner4.setAge(19);
        runner4.setCelPhone("(12) 99323-9292");
        runner4.setEmergencyNumber("(12) 99323-0000");
        runner4.setBloodGroup("O+");
        runner4.setCategory("small");
        runner4.setPrice();

        register(runner1, smallList,mediumList,advancedList);
        register(runner2, smallList,mediumList,advancedList);
        register(runner3, smallList,mediumList,advancedList);
        register(runner4, smallList,mediumList,advancedList);

//        deleteRunner(runner1, smallList,mediumList,advancedList);

        System.out.println("---- Lista Circuito Pequeno ----");
        showList(smallList);
        System.out.println("---- Lista Circuito Médio ----");
        showList(mediumList);
        System.out.println("---- Lista Circuito Avançado ----");
        showList(advancedList);

        showPrice(runner3);

    }
}
