package androidx.core.os;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class f {

    static class a {
        static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static i a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? i.i(a.a(configuration)) : i.a(configuration.locale);
    }
}
