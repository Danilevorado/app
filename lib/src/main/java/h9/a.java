package h9;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f24098a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24099b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f24100c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24101d;

    public a(SharedPreferences sharedPreferences, String str, int i10, Class cls) {
        ArrayList arrayList;
        this.f24099b = str;
        this.f24101d = i10;
        String string = null;
        if (sharedPreferences != null) {
            try {
                string = sharedPreferences.getString(str, null);
            } catch (Exception e5) {
                k9.h.o(e5);
                this.f24100c = new ArrayList();
            }
        }
        if (string == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = (ArrayList) (cls == null ? z7.g.a(string, ArrayList.class) : z7.g.a(string, ArrayList.class, cls));
        }
        this.f24100c = arrayList;
        this.f24098a = sharedPreferences;
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f24098a;
        if (sharedPreferences == null) {
            k9.h.k("Incorrect state of the app preferences is null");
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString(this.f24099b, z7.g.b(this.f24100c));
        editorEdit.apply();
    }

    public void b(Serializable serializable) {
        try {
            this.f24100c.add(serializable);
            if (this.f24100c.size() > this.f24101d) {
                this.f24100c.remove(0);
            }
            a();
        } catch (Exception e5) {
            k9.h.o(e5);
        }
    }
}
