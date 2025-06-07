package f9;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import k9.h;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f23671a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f23672b = new HashMap();

    /* renamed from: f9.a$a, reason: collision with other inner class name */
    public enum EnumC0131a {
        STRING,
        BOOLEAN,
        LONG,
        INT
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23678a;

        static {
            int[] iArr = new int[EnumC0131a.values().length];
            f23678a = iArr;
            try {
                iArr[EnumC0131a.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23678a[EnumC0131a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23678a[EnumC0131a.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23678a[EnumC0131a.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public a(String str) {
        this.f23671a = str;
    }

    void a(e9.a aVar) {
        h.v("MigrationScheme", "Implement scheme with scheme: " + this.f23672b);
        SharedPreferences sharedPreferencesA = aVar.a(this.f23671a);
        if (sharedPreferencesA == null) {
            h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
        for (Map.Entry entry : this.f23672b.entrySet()) {
            try {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    editorEdit.putBoolean(str, ((Boolean) value).booleanValue());
                } else if (value instanceof String) {
                    editorEdit.putString(str, (String) value);
                } else if (value instanceof Long) {
                    editorEdit.putLong(str, ((Long) value).longValue());
                } else if (value instanceof Integer) {
                    editorEdit.putInt(str, ((Integer) value).intValue());
                } else {
                    h.v("MigrationScheme", "Unknown format for key: " + str);
                }
            } catch (Exception unused) {
                h.v("MigrationScheme", "Failed put value to editor");
            }
        }
        editorEdit.apply();
    }

    public void b(e9.a aVar, EnumC0131a enumC0131a, String str) {
        Object string;
        SharedPreferences sharedPreferencesA = aVar.a(this.f23671a);
        if (sharedPreferencesA == null) {
            return;
        }
        if (!sharedPreferencesA.contains(str)) {
            sharedPreferencesA.getAll();
            if (!sharedPreferencesA.contains(str)) {
                return;
            }
        }
        try {
            int i10 = b.f23678a[enumC0131a.ordinal()];
            if (i10 == 1) {
                string = sharedPreferencesA.getString(str, "");
            } else if (i10 == 2) {
                string = Boolean.valueOf(sharedPreferencesA.getBoolean(str, false));
            } else if (i10 == 3) {
                string = Long.valueOf(sharedPreferencesA.getLong(str, 0L));
            } else if (i10 != 4) {
                return;
            } else {
                string = Integer.valueOf(sharedPreferencesA.getInt(str, 0));
            }
            this.f23672b.put(str, string);
        } catch (Exception unused) {
            h.v("MigrationScheme", "Failed providing data with key: " + str);
        }
    }

    public void c(String str, boolean z10) {
        this.f23672b.put(str, Boolean.valueOf(z10));
    }
}
