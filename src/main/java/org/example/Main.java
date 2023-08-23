package org.example;

public class Main {
    public static void main(String[] args) {

        ConsecutiveCharsProcess tt= new ConsecutiveCharsProcess();

        System.out.println("=================");
        tt.setChars("xaaazzldddddxcccc");
        tt.setCharsProcess(new ConsecutiveCharsReplace());
        tt.Process();

        System.out.println("=================");
        tt.setChars("bbbaaccccvmmmmsddm");
        tt.setCharsProcess(new ConsecutiveCharsRemove());
        tt.Process();

    }

}