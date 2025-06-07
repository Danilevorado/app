package h9;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24120a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24121b;

    /* renamed from: c, reason: collision with root package name */
    private String f24122c;

    public h(SharedPreferences sharedPreferences, String str, String str2) {
        String string;
        this.f24121b = str;
        if (sharedPreferences == null) {
            string = str2;
        } else {
            try {
                string = sharedPreferences.getString(str, str2);
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f24122c = str2;
            }
        }
        this.f24122c = string;
        this.f24120a = sharedPreferences;
    }

    public String a() {
        return this.f24122c;
    }

    public void b(String str) {
        this.f24122c = str;
        SharedPreferences sharedPreferences = this.f24120a;
        if (sharedPreferences == null) {
            k9.h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(this.f24121b, str);
        editorEdit.apply();
    }
}
