package stream04072022;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ArvikV
 * @version 1.0
 * @since 04.06.2022
 */
@Data
@AllArgsConstructor
public class Item {
    private Long id;
    private String name;
    private int ssn;
}
