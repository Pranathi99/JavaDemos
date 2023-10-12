package DesignPatterns.BehavioralPatterns;

interface Expression {
    int interpret();
}

class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}

class AddExpression implements Expression {
    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}

class SubtractExpression implements Expression {
    private Expression left;
    private Expression right;

    public SubtractExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}

public class InterpreterPattern {
    public static void main(String[] args) {
        // Create the expression: 5 + (2 - 1)
        Expression expression = new AddExpression(
            new NumberExpression(5),
            new SubtractExpression(
                new NumberExpression(2),
                new NumberExpression(1)
            )
        );

        // Interpret and evaluate the expression
        int result = expression.interpret();
        System.out.println("Result: " + result); // Output: 6
    }
}
