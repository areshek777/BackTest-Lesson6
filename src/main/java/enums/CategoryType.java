package enums;

import lombok.Getter;

public enum CategoryType {
    FOOD(1,"Food"),
    ELECTRONIC(2,"Electronic"),
    FURNITURE(3, "Furniture"),
    NONEXISTENT(0, "NonExistent");

    @Getter
    private final String title;

    @Getter
    private final Integer id;

    CategoryType(Integer id, String title) {
        this.title = title;
        this.id = id;
    }

}
