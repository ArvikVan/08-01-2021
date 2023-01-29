package concurency;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrepareStatementDemo {
    private Connection connection;

    public PrepareStatementDemo() throws Exception {
        initConnection();
    }

    private void initConnection() throws Exception{
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String login = "postgres";
        String password = "Arvijka";
        connection = DriverManager.getConnection(url, login, password);
    }

    public List<PromoFullModel> getAll() {
        List<PromoFullModel> list = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement("select * from promo")) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    list.add(PromoFullModel.builder()
                            .promoCodeId(resultSet.getLong("promoCodeId"))
                            .promoCode(resultSet.getString("promoCode"))
                            .sum_Value(resultSet.getLong("sum_Value"))
                            .percent(resultSet.getLong("percent"))
                            .firstName(resultSet.getString("firstName"))
                            .fullName(resultSet.getString("fullName"))
                            .description(resultSet.getString("description"))
                            .timetoend(resultSet.getDate("timetoend"))
                            .build());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public static void main(String[] args) throws Exception {
        PrepareStatementDemo promoF = new PrepareStatementDemo();
        List<PromoFullModel> fullModelList;
        fullModelList = promoF.getAll();
        System.out.println("Model from db" + fullModelList.toString());

        List<PromoCodeInfoModel> promoCodeInfoModels = new ArrayList<>();
        List<PromoMini> pro = fullModelList.stream().map(x -> PromoMini.builder()
                .promoCodeId(x.getPromoCodeId())
                .promoCode(x.getPromoCode())
                .build()).distinct().collect(Collectors.toList());
        System.out.println("PromoMini " + pro);
        pro.forEach(item ->
                promoCodeInfoModels.add(PromoCodeInfoModel.builder()
                        .promoCodeId(item.getPromoCodeId())
                        .promoCode(item.getPromoCode())
                        .promoCodeUsersModels(getUsers(fullModelList, item.getPromoCode()))
                        .build())
        );
        System.out.println("promoCodeInfoModels " + promoCodeInfoModels);
    }
    private static List<PromoCodeUsersModel> getUsers(List<PromoFullModel> full, String promocode) {
        List<PromoCodeUsersModel> list = new ArrayList<>();
        full.stream().filter(pr -> promocode.equals(pr.getPromoCode())).forEach(item -> list.add(PromoCodeUsersModel.builder()
                .firstName(item.getFirstName())
                .fullName(item.getFullName())
                .sum_Value(item.getSum_Value())
                .percent(item.getPercent())
                .timetoend(item.getTimetoend())
                .description(item.getDescription())
                .build()));
        System.out.println("list--" + list);
        return list;
    }
}
