public class Duke {
    private String commandType;

    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     *
     * @param input the user's message
     * @return Duke's reply
     */
    public String getResponse(String input) {
        String trimmed = input == null ? "" : input.trim().toLowerCase();
        if (trimmed.startsWith("todo") || trimmed.startsWith("deadline") || trimmed.startsWith("event")) {
            commandType = "AddCommand";
        } else if (trimmed.startsWith("mark") || trimmed.startsWith("unmark")) {
            commandType = "ChangeMarkCommand";
        } else if (trimmed.startsWith("delete")) {
            commandType = "DeleteCommand";
        } else {
            commandType = "Default";
        }
        return "Duke heard: " + input;
    }

    public String getCommandType() {
        return commandType;
    }
}
