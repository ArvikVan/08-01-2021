package time;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapaStream {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(
                Phone.builder().name("iPhone X").company("Apple").price(600).build(),
                Phone.builder().name("Pixel 2").company("Google").price(600).build(),
                Phone.builder().name("iPhone 8").company("Apple").price(600).build(),
                Phone.builder().name("iPhone 9").company("Apple").price(600).build(),
                Phone.builder().name("Galaxy S9").company("Samsung").price(600).build(),
                Phone.builder().name("Galaxy S8").company("Samsung").price(600).build()
        );
        //{Google=[Phone(name=Pixel 2, company=Google, price=600)],
        // Apple=[Phone(name=iPhone X, company=Apple, price=600), Phone(name=iPhone 8, company=Apple, price=600), Phone(name=iPhone 9, company=Apple, price=600)],
        // Samsung=[Phone(name=Galaxy S9, company=Samsung, price=600), Phone(name=Galaxy S8, company=Samsung, price=600)]}
//        Map<String, List<Phone>> phonesByCompany =
//                phoneStream.collect(Collectors.groupingBy(Phone::getCompany));
        //{Google=1, Apple=3, Samsung=2}
        // Map<String, Long> phonesByCompany = phoneStream.collect(Collectors.groupingBy(Phone::getCompany, Collectors.counting()));
        //{Google=[Pixel 2], Apple=[iPhone X, iPhone 8, iPhone 9], Samsung=[Galaxy S9, Galaxy S8]}
        Map<String, List<String>> phonesByCompany =
                phoneStream.collect(Collectors.groupingBy(Phone::getCompany, Collectors.mapping(Phone::getName, Collectors.toList())));
        System.out.println(phonesByCompany);
    }
}
