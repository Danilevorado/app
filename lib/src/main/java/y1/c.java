package y1;

import a2.b0;
import android.content.Context;
import android.net.Uri;
import r1.h;
import x1.m;
import x1.n;
import x1.q;

/* loaded from: classes.dex */
public class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28439a;

    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Context f28440a;

        public a(Context context) {
            this.f28440a = context;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new c(this.f28440a);
        }
    }

    public c(Context context) {
        this.f28439a = context.getApplicationContext();
    }

    private boolean e(h hVar) {
        Long l10 = (Long) hVar.c(b0.f7d);
        return l10 != null && l10.longValue() == -1;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, h hVar) {
        if (s1.b.d(i10, i11) && e(hVar)) {
            return new m.a(new m2.b(uri), s1.c.g(this.f28439a, uri));
        }
        return null;
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return s1.b.c(uri);
    }
}
