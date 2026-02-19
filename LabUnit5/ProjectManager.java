package LabUnit5;

// The "Master" base class that every programmer must extend
abstract class ProjectComponent {
    // Every class created by any programmer must implement these
    abstract void logStatus();
    abstract void runDebug();

    // Common functionality shared by all project classes
    void versionInfo() {
        System.out.println("Project Build: v1.0.4");
    }
}

// Programmer A's contribution
class DatabaseModule extends ProjectComponent {
    @Override
    void logStatus() { System.out.println("DB Module: Connected."); }

    @Override
    void runDebug() { System.out.println("DB Module: Scanning for leaks..."); }
}

// Programmer B's contribution
class UIModule extends ProjectComponent {
    @Override
    void logStatus() { System.out.println("UI Module: Rendered."); }

    @Override
    void runDebug() { System.out.println("UI Module: Checking refresh rate..."); }
}

public class ProjectManager {
    public static void main(String[] args) {
        // We can store all different modules in one array because they share the same base
        ProjectComponent[] modules = { new DatabaseModule(), new UIModule() };

        for (ProjectComponent module : modules) {
            module.versionInfo(); // Guaranteed method
            module.runDebug();    // Guaranteed interface
        }
    }
}
