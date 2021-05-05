package com.company.stream;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningMethod {
    public static String join(List<String> strings) {
        return strings.stream().collect(Collectors.joining(System.lineSeparator(), "Prefix", "Suffix"));
    }
}
