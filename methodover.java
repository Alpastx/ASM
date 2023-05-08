class animal {
    public void sound() {
        System.out.println("The animal make a sound");
        }
        }
        class dog{
        public void sound() {
        System.out.println("A dog barks");
        }
        }
        class cat{
        public void sound() {
        System.out.println("A cat meows");
        }
        }
        public class methodover {
        public static void main(String[] args) {
        animal ani = new animal();
        dog dog = new dog();
        cat cat = new cat();
        ani.sound();
        dog.sound();
        cat.sound();
        }
        
}
