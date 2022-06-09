package pdf;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.06.2022
 */
@Data
@AllArgsConstructor
public class PdfCheckReport {
    Long userId;
    @SuppressWarnings("checkstyle:MemberName")
    String UserFullName;
    String result;
}
