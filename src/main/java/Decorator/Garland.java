package Decorator;

public class Garland extends TreeDecorator{

    public Garland(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decoratedWithGarland();
    }

    private String decoratedWithGarland() {
        return " with Garland";
    }
}
