public enum WheelTypes {

    WINTER("Winter"),
    COMMON("Common");
    private String name;

    WheelTypes(String name) {
        this.name = name;
    }

    public static WheelTypes toEnum(String inputType) {
        return WheelTypes.valueOf(inputType.toUpperCase());
    }
}
