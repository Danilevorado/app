package i7;

import java.util.Locale;

/* loaded from: classes.dex */
public class d implements b {
    @Override // i7.b
    public String a() {
        String language;
        language = Locale.getDefault().getLanguage();
        language.hashCode();
        switch (language) {
            case "in":
                return "id";
            case "iw":
                return "he";
            case "ji":
                return "yi";
            case "zh":
                return language + "-" + Locale.getDefault().getCountry();
            default:
                return language;
        }
    }
}
