package h9;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24114a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24115b;

    /* renamed from: c, reason: collision with root package name */
    private long f24116c;

    public f(SharedPreferences sharedPreferences, String str, long j10) {
        long j11;
        this.f24115b = str;
        this.f24114a = sharedPreferences;
        if (sharedPreferences == null) {
            j11 = j10;
        } else {
            try {
                j11 = sharedPreferences.getLong(str, j10);
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f24116c = j10;
                return;
            }
        }
        this.f24116c = j11;
    }

    public long a() {
        return this.f24116c;
    }

    public void b(long j10) {
        this.f24116c = j10;
        SharedPreferences sharedPreferences = this.f24114a;
        if (sharedPreferences == null) {
            k9.h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putLong(this.f24115b, j10);
        editorEdit.apply();
    }
}
