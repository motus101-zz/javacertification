package com;

class Child extends Parent {
    private int i = 42;

    void doChildStaff() {
        System.out.println("From Child!");
    }

    void absMethod() {
        System.out.println("Py py ...");
    }

    public void setI(int i) {
        this.i = i;
    }
    void myStaticMethod() {
        System.out.println("I belong to Child");
    }

    public int getI() {
        return i;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Child)) return false;
        if (!super.equals(object)) return false;

        Child child = (Child) object;

        if (getI() != child.getI()) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getI();
        return result;
    }
}