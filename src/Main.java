public class Main {
    public static void main(String[] args) {
        Author Dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book Idiot = new Book("Idiot", 1868, Dostoevsky);

        Author Turgenev = new Author("Ivan", "Turgenev");
        Book FathersAndChildren = new Book("Fathers and children", 1862, Turgenev);

        System.out.println(Idiot.getTitle() + " " + Idiot.getAuthor().getName() + " " + Idiot.getAuthor().getSurname() + " " + Idiot.getYearPublication());
        System.out.println(FathersAndChildren.getTitle() + " " + FathersAndChildren.getAuthor().getName() + " " + FathersAndChildren.getAuthor().getSurname() + " " + FathersAndChildren.getYearPublication());

        FathersAndChildren.setYearPublication(1865);
        System.out.println("Измененая дата " + FathersAndChildren.getTitle() + " " + FathersAndChildren.getAuthor().getName() + " " + FathersAndChildren.getAuthor().getSurname() + " " + FathersAndChildren.getYearPublication());

    }
}