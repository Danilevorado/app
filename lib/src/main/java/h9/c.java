package h9;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24105a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24106b;

    /* renamed from: c, reason: collision with root package name */
    private Class f24107c;

    public c(SharedPreferences sharedPreferences, String str, Class cls) {
        this.f24106b = str;
        this.f24105a = sharedPreferences;
        String string = null;
        if (sharedPreferences != null) {
            try {
                string = sharedPreferences.getString(str, null);
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f24107c = cls;
                return;
            }
        }
        if (TextUtils.isEmpty(string)) {
            this.f24107c = cls;
        } else {
            this.f24107c = Class.forName(string);
        }
    }

    public Class a() {
        return this.f24107c;
    }
}
