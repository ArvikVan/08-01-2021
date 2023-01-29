package concurency;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromoCodeInfoModel {
    private Long promoCodeId;
    private String promoCode;
    private List<PromoCodeUsersModel> promoCodeUsersModels;
}
