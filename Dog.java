public class Dog{
    String breed;
    String size;
    int age;
    String color;

    public Dog(String b, String s, int a, String c){
        breed = b;
        size = s;
        age = a;
        color = c;

    }

    public String getBreed(){
        return ("The breed is " + breed);
    }
}