package prototype;

public class WersionControlRunner {
    public static void main(String[] args) {

        Project master = new Project(1,"super", "source code");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterCone = factory.cloneProject();
        System.out.println("============================");
        System.out.println(masterCone);

    }
}
