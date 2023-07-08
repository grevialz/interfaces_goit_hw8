package java_goit_hw8;

public class Tests {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape parallelogram = new Parallelogram();
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        Shape quad = new Quad();

        new OutputNameShape().name(triangle);
        new OutputNameShape().name(parallelogram);
        new OutputNameShape().name(rectangle);
        new OutputNameShape().name(circle);
        new OutputNameShape().name(quad);
    }
}
