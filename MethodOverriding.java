public class MethodOverriding {
    public static void main(String[] args) {
        Document d1 = new Document();
        d1.print();
        Document d2 = new MsWord();
        d2.print();
        Document d3 = new Office365();
        d3.print();
        // polymorphism allow child class object to be saved in parent class variable
        // this will only allow parent class attribute and functions not from the child

        Spreadsheet s = new Spreadsheet();
        Spreadsheet msExcel = new MsExcel();
        s.addColumn(1);
        s.addRow(2);
        msExcel.addColumn(0);
        msExcel.addRow(0);

    }
}

class Document {
    void print() {
        System.out.println("documebt is printing");
    }

    String saveFile() {
        return "file.txt";
    }
    // illegal operation
    // cannot override function if not extended from another class
}

class MsWord extends Document {
    // method overriding make the same function of parent in child
    // access modifier, return type and parameter should be same
    @Override
    void print() {
        System.out.println("msword printing");
    }
    // illegal operation
    // cannot annotate @Override if the method signature is different
}

class Office365 extends MsWord {
    @Override
    void print() {
        System.out.println("Online printing");
    }
}

class Spreadsheet {
    void addRow(int a) {
        System.out.println("int row added");
    }

    void addColumn(int b) {
        System.out.println("int column added");
    }
}

class MsExcel extends Spreadsheet {
    String fileType;

    @Override
    void addRow(int a) {
        System.out.println("excel row");
    }

    @Override
    void addColumn(int b) {
        System.out.println("excel column");
    }
}