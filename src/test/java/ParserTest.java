import org.junit.jupiter.api.Test;
import Commands.Command;
import Commands.ToDoCommand;
import Main.Parser;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParserTest {

    @Test
    public void parseCommand_validTodoCommand_returnsTodoCommand() {
        Parser parser = new Parser();
        Command command = parser.parseCommand("todo read book");

        assertTrue(command instanceof ToDoCommand);
    }
}

