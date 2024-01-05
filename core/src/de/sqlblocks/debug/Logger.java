package de.sqlblocks.debug;

public class Logger {

    private static int warnings = 0;
    private static int errors = 0;

    public static void debug(String text) {
        System.out.println("DEBUG: " + text);
    }

    public static void error(String text) {
        System.out.println("\n");
        System.err.println("ERROR: " + text);
        System.out.println("\n");
        errors++;
    }

    public static void warning(String text) {
        System.err.println(text);
        warnings++;
    }

    public static void info(String text) {
        System.out.println(text);
    }

    public static int getWarningCount() {
        return warnings;
    }

    public static int getErrorCount() {
        return errors;
    }

}
