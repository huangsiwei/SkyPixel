package skypixel.util;

/**
 * Created by hsw11 on 2017/11/11.
 */
public enum ResourceType {
    VIDEO(0, "VIDEO"),
    IMAGE(1, "IMAGE"),
    IMAGE360(2, "IMAGE360");

    String text;
    int value;

    ResourceType(int value, String text) {
        this.value = value;
        this.text = text;
    }
}
