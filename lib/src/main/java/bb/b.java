package bb;

import android.content.Context;
import android.content.SharedPreferences;
import k9.h;

/* loaded from: classes2.dex */
class b implements e9.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4596a;

    /* renamed from: b, reason: collision with root package name */
    private final ha.c f4597b = new ha.c() { // from class: bb.a
        @Override // ha.c
        public final void a(Exception exc) {
            h.j("Prefs", exc);
        }
    };

    b(Context context) {
        this.f4596a = context;
    }

    @Override // e9.a
    public SharedPreferences a(String str) {
        return new t9.b(this.f4596a).b(str).c(false).a(this.f4597b).d();
    }
}
