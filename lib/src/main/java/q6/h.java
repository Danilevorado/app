package q6;

import android.content.Context;
import x5.q;

/* loaded from: classes.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static x5.d b(String str, String str2) {
        return x5.d.i(f.a(str, str2), f.class);
    }

    public static x5.d c(final String str, final a aVar) {
        return x5.d.j(f.class).b(q.i(Context.class)).f(new x5.h() { // from class: q6.g
            @Override // x5.h
            public final Object a(x5.e eVar) {
                return h.d(str, aVar, eVar);
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, x5.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
