package com.company.lambda;
/**
 * вернуть Supplier, который создает пустую строку через new
 * @author arviy
 * @version 1.0
 */

import java.util.function.Supplier;

public class MRSupplier {
    public static Supplier<String> supplier() {
        return String::new;
    }
}
