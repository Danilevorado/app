package d7;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b {
    public static String a(long j10) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j10);
        long millis = j10 - TimeUnit.HOURS.toMillis(hours);
        long minutes = timeUnit.toMinutes(millis);
        long seconds = timeUnit.toSeconds(millis - TimeUnit.MINUTES.toMillis(minutes));
        StringBuilder sb2 = new StringBuilder();
        if (hours > 0) {
            sb2.append(hours);
            sb2.append(":");
        }
        if (minutes < 10) {
            sb2.append('0');
        }
        sb2.append(minutes);
        sb2.append(":");
        if (seconds < 10) {
            sb2.append('0');
        }
        sb2.append(seconds);
        return sb2.toString();
    }
}
