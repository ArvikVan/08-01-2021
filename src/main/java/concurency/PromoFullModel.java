package concurency;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PromoFullModel {
    private Long promoCodeId;
    private String promoCode;
    private String firstName;
    private String fullName;
    private Long sum_Value;
    private Long percent;
    private String description;
    private Date timetoend;
}
