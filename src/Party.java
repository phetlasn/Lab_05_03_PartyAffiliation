public class Party {
    public static void main(String[] args) {

        String partyAffiliation;
        partyAffiliation = "D";

        System.out.println("Enter your party affiliation: [D/R/I]");

        if (partyAffiliation.equalsIgnoreCase("D")){
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equalsIgnoreCase("R")){
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equalsIgnoreCase("I")){
            System.out.println("You get a Independent Person.");
        } else{
            System.out.println("You did not input a valid part of D, R, or I");
        }


    }
}

