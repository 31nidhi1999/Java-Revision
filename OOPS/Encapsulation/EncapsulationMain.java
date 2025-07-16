class Person{
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class EncapsulationMain{
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Nidhi");
        System.out.println("Person's name: " + person.getName());
    }
}