public class Main {
    public static void main(String[] args) {

        Rectangle re1 = new Rectangle(4, 40);

        Rectangle re2 = new Rectangle(3.5, 35.9);


        System.out.println("Display 1: "+ re1.display());
        System.out.println("Display 2: "+ re2.display());


        System.out.println("Area1 : "+ re1.getArea());
        System.out.println("Area2 : "+ re2.getArea());

        System.out.println("Perimeter 1 : "+ re1.getPerimeter());
        System.out.println("Perimeter 2 : "+ re1.getPerimeter());


    }
}
