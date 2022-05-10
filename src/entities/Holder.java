package entities;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Holder {

    private String name;

    public Holder(String name) {
        this.name = name;
    }
}
