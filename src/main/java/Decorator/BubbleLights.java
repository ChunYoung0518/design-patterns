package Decorator;

public class BubbleLights extends TreeDecorator{

    public BubbleLights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decoratedWithBubbleLights();
    }

    private String decoratedWithBubbleLights() {
        return " with Bubble Lights";
    }
}
