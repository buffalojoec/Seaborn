package Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EarningsRecapRecord {

    String ticker;
    String shortName;
    String releaseTime;
    int numberOfAnalysts;
    double prediction;
    String volumeSuffix;
    double relativeVolume;
    String chartUrl;
    double actual;
    String differentialSuffix;
    double differential;
    String gainSuffix;
    double gain;

}
