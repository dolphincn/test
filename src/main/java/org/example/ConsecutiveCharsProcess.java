package org.example;

public class ConsecutiveCharsProcess {
    private String inputChars;
    private CharsProcess charsProcess;

    public ConsecutiveCharsProcess()
    {
    }
    public ConsecutiveCharsProcess(String inputChars,CharsProcess charsProcess)
    {
        this.inputChars = inputChars;
        this.charsProcess = charsProcess;
        System.out.println("input: "+inputChars);
    }

    public ConsecutiveCharsProcess setChars(String inputChars) {
        this.inputChars = inputChars;
        System.out.println("input: "+inputChars);
        return this;
    }
    public String getChars() {
        return this.inputChars;
    }

    public ConsecutiveCharsProcess setCharsProcess(CharsProcess charsProcess) {
        this.charsProcess = charsProcess;
        return this;
    }

    public String Process() {
        System.out.println("output: ");
        return this.charsProcess.process(this.inputChars);
    }
}
