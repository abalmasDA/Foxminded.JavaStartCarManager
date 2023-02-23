package ua.com.foxminded.carmanager;

public enum Color {
    BLACK("Black"),
    BLUE("Blue"),
    GREEN("Green"),
    ORANGE("Orange"),
    WHITE("White"),
    YELLOW("Yellow");

    String txt;

    Color(String Colortxt) {
        this.txt = Colortxt;

    }

    public String getTxt() {
        return txt;
    }
}