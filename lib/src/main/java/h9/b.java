package h9;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24102a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24103b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24104c;

    public b(SharedPreferences sharedPreferences, String str, boolean z10) {
        boolean z11;
        this.f24103b = str;
        if (sharedPreferences == null) {
            z11 = z10;
        } else {
            try {
                z11 = sharedPreferences.getBoolean(str, z10);
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f24104c = z10;
            }
        }
        this.f24104c = z11;
        this.f24102a = sharedPreferences;
    }

    public boolean a() {
        return this.f24104c;
    }

    public void b(boolean z10) {
        this.f24104c = z10;
        SharedPreferences sharedPreferences = this.f24102a;
        if (sharedPreferences == null) {
            k9.h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(this.f24103b, z10);
        editorEdit.apply();
    }
}
