package from10_05;

import java.util.ArrayList;

public class MyStringBuilder {
    private StringBuilder stringBuilder;
    private ArrayList<MyStringBuilderCommand> commandList;
    private int currentIndex;

    public MyStringBuilder() {
        this.stringBuilder = new StringBuilder();
        this.commandList = new ArrayList<>();
        this.currentIndex = -1;
    }

    public MyStringBuilder(String str) {
        this.stringBuilder = new StringBuilder(str);
        this.commandList = new ArrayList<>();
        this.currentIndex = -1;
    }

    public void append(String str) {
        this.stringBuilder.append(str);
        this.commandList.add(new AppendCommand(str));
        this.currentIndex++;
    }

    public void delete(int start, int end) {
        String deletedString = this.stringBuilder.substring(start, end);
        this.stringBuilder.delete(start, end);
        this.commandList.add(new DeleteCommand(start, deletedString));
        this.currentIndex++;
    }

    public void undo() {
        if (currentIndex >= 0) {
            MyStringBuilderCommand command = this.commandList.get(currentIndex);
            command.undo(this.stringBuilder);
            currentIndex--;
        }
    }

    @Override
    public String toString() {
        return this.stringBuilder.toString();
    }

    private interface MyStringBuilderCommand {
        void undo(StringBuilder stringBuilder);
    }

    private class AppendCommand implements MyStringBuilderCommand {
        private String appendedString;

        public AppendCommand(String str) {
            this.appendedString = str;
        }

        @Override
        public void undo(StringBuilder stringBuilder) {
            int start = stringBuilder.length() - appendedString.length();
            stringBuilder.delete(start, stringBuilder.length());
            currentIndex--;
        }
    }

    private class DeleteCommand implements MyStringBuilderCommand {
        private int startIndex;
        private String deletedString;

        public DeleteCommand(int startIndex, String deletedString) {
            this.startIndex = startIndex;
            this.deletedString = deletedString;
        }

        @Override
        public void undo(StringBuilder stringBuilder) {
            stringBuilder.insert(startIndex, deletedString);
            currentIndex--;
        }
    }
}
