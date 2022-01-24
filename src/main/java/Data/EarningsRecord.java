package Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EarningsRecord {

    String ticker;
    String shortName;
    DateTime releaseTime;
    int numberOfAnalysts;
    double prediction;
    String volumeSuffix;
    double relativeVolume;
    String chartUrl;
    double actual;
    double differential;
    double gain;

    public EarningsRecord(String ticker,
                          String shortName,
                          DateTime releaseTime,
                          int numberOfAnalysts,
                          double prediction,
                          String volumeSuffix,
                          double relativeVolume,
                          String chartUrl) {
        this.ticker = ticker;
        this.shortName = shortName;
        this.releaseTime = releaseTime;
        this.numberOfAnalysts = numberOfAnalysts;
        this.prediction = prediction;
        this.volumeSuffix = volumeSuffix;
        this.relativeVolume = relativeVolume;
        this.chartUrl = chartUrl;
    }
}
