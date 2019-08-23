package zhilutec.tio.dto.body;

import lombok.Data;

/**
 * {"cmd":"join",
 * "cmdseq":1,
 * "appeui":"2C26C50001000001",
 * "appnonce":1234,
 * "challenge":"ABCDEF1234567890ABCDEF1234567890",
 * }
 */
@Data
public class DownJoinBody extends BaseBody {
    private String appeui;
    private Integer appnonce;
    private Integer cmdseq;
    private String challenge;
}
