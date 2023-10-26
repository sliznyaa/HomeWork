public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.personInfo("Will" ,"Smith", "New York", 354676123);
        person.personInfo("Leonardo" ,"DiCaprio", "Los Angeles", 537098546);
        person.personInfo("Sherlock", "Holmes", "London", 645798221);

        System.out.println("_________________");

        Person.personInfoStatic("Jennifer", "Aniston", "New York", 354897849);
        Person.personInfoStatic("Robert", "Downey Jr.", "Austin", 539786504);
        Person.personInfoStatic("Cillian", "Murphy", "Douglas", 853467865);
    }

    public void personInfo (String name, String surname, String city, long phone){
        System.out.println("Зателефонувати громадянинові "+ name+ " " + surname + " з міста " + city + " можна за номером " + phone);
    }

    public static void personInfoStatic (String name, String surname, String city, long phone){
        System.out.println("Зателефонувати громадянинові "+ name+ " " + surname + " з міста " + city + " можна за номером " + phone);
    }
}
