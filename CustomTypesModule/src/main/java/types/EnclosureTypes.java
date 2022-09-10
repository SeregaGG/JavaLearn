package types;

public enum EnclosureTypes {
    SMALL(0),
    MEDIUM(1),
    BIG(2),
    LARGE(3);
    private int value;
    EnclosureTypes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
