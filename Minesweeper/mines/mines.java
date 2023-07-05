package mines;

public class mines {

    private int values; // 0-8 = Char Value, -1 = Mines

    public mines() {
        values = 0;
    }

    public mines(int values) {
        this.values = values;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }

}