package h9;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24108a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24109b;

    /* renamed from: c, reason: collision with root package name */
    private int f24110c;

    public d(SharedPreferences sharedPreferences, String str, int i10) {
        int i11;
        this.f24109b = str;
        if (sharedPreferences == null) {
            i11 = i10;
        } else {
            try {
                i11 = sharedPreferences.getInt(str, i10);
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f24110c = i10;
            }
        }
        this.f24110c = i11;
        this.f24108a = sharedPreferences;
    }

    public int a() {
        return this.f24110c;
    }

    public void b(int i10) {
        this.f24110c = i10;
        SharedPreferences sharedPreferences = this.f24108a;
        if (sharedPreferences == null) {
            k9.h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(this.f24109b, i10);
        editorEdit.apply();
    }
}
