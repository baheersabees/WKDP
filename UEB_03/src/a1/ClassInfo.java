package a1;

public class ClassInfo {
    private Object obj;

    public ClassInfo(Object obj) {
        this.obj = obj;
    }

    public String getClassName() {
        return this.obj.getClass().getSimpleName();
    }

    public String getFullClassName() {
        return this.obj.getClass().getName();
    }

    public String getPackageName() {
        Package pkg = this.obj.getClass().getPackage();
        return (pkg == null) ? "" : pkg.getName();
    }

    public boolean isInSamePackage(Object other) {
        if (other == null) return false;
        return java.util.Objects.equals(
            getPackageName(), 
            new ClassInfo(other).getPackageName()
        );
    }
}
