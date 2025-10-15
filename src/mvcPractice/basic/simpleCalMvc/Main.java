package mvcPractice.basic.simpleCalMvc;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model,view);

        controller.run();
        // 생각보다 까다롭네

    }
}
