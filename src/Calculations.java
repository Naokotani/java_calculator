public class Calculations {
    // Responsible for generating the current string.
    private String currInput = "";
    // Holds the last input used for calculations
    private String lastInput = "";
    // The running total from calculations
    private double total = 0.0;
    // Controls whether the input field is reset when typing starts
    private boolean resetInput = false;
    // Usd to determine the appropriate calculation to run.
    private enum Operator {ADD, SUBTRACT, MULTIPLY, DIVIDE, EQUALS, NONE};
    // Holds the Operator enum to control calculations.
    private Operator lastOperator = Operator.NONE;

    /**
     * Takes the input from the calculator on button presses and concatenates the
     * input string
     * @param input the input from the calculator
     * @return The current input string displayed on the calculator.
     */
    public String setInput(String input) {
        if (resetInput) {
            this.currInput = "";
            resetInput = false;
        }
        this.currInput += input;
        return this.currInput;
    }

    /**
     * Clears the calculator and resets to the default state.
     * @return returns 0 as the placeholder in the default state.
     */
    public String clearTotal() {
        this.resetInput = true;
        this.total = 0.0;
        this.currInput = "0";
        lastOperator = Operator.NONE;
        return "0";
    }

    /**
     * Controls what happens when the + button is clicked.
     * @return returns the appropriate placeholder in the input.
     */
    public String addInput() {
        this.resetInput = true;
        this.lastInput = this.currInput;
        String currValue = parseOperator();
        this.lastOperator = Operator.ADD;
        return  currValue + "+";
    }

    /**
     * Controls what happens when the - button is clicked.
     * @return returns the appropriate placeholder in the input.
     */
    public String subInput() {
        this.resetInput = true;
        this.lastInput = this.currInput;
        String currValue = parseOperator();
        this.lastOperator = Operator.SUBTRACT;
        return  currValue + "-";
    }

    /**
     * Controls what happens when the * button is clicked.
     * @return returns the appropriate placeholder in the input.
     */
    public String mulInput() {
        this.resetInput = true;
        this.lastInput = this.currInput;
        String currValue = parseOperator();
        this.lastOperator = Operator.MULTIPLY;
        return  currValue + "*";
    }

    /**
     * Controls what happens when the / button is clicked.
     * @return returns the appropriate placeholder in the input.
     */
    public String divInput() {
        this.resetInput = true;
        this.lastInput = this.currInput;
        String currValue = parseOperator();
        this.lastOperator = Operator.DIVIDE;
        return  currValue + "/";
    }

    /**
     * Controls what happens when the = button is clicked.
     * @return returns the appropriate placeholder in the input.
     */
    public String equals() {
        this.lastInput = this.currInput;
        parseOperator();
        lastOperator = Operator.EQUALS;
        return Double.valueOf(this.total).toString();
    }

    /**
     * Performs addition calculations.
     * @return the running total as a string.
     */
    public String add() {
        double lastValue = Double.parseDouble(this.lastInput);
        this.total += lastValue;
        return Double.valueOf(this.total).toString();
    }

    /**
     * Performs subtractions calculations.
     * @return the running total as a string.
     */
    public String subtract() {
        double currValue = Double.parseDouble(this.lastInput);
        this.total -= currValue;
        return Double.valueOf(this.total).toString();
    }

    /**
     * Performs multiplication calculations.
     * @return the running total as a string.
     */
    public String multiply() {
        double currValue = Double.parseDouble(this.currInput);
        this.total *=  currValue;
        return Double.valueOf(this.total).toString();
    }

    /**
     * Performs division calculations.
     * @return the running total as a string.
     */
    public String divide() {
        double currValue = Double.parseDouble(this.currInput);
        this.total /= currValue;
        return Double.valueOf(this.total).toString();
    }

    /**
     * Used to handle the case of the first time an operator is clicked
     * @return returns the first number entered as a placeholder.
     */
    public String none() {
        total += Double.parseDouble(currInput);
        return Double.valueOf(this.total).toString();
    }

    /**
     * Controls the appropriate calculation to perform.
     * @return returns a placeholder string based on the appropriate calculation
     */
    public String parseOperator() {
        return switch (lastOperator) {
            case ADD -> add();
            case SUBTRACT -> subtract();
            case DIVIDE -> divide();
            case MULTIPLY -> multiply();
            case EQUALS -> Double.valueOf(this.total).toString();
            case NONE -> none();
        };
    }


}
