package y1;

import android.content.Context;
import android.net.Uri;
import r1.h;
import x1.m;
import x1.n;
import x1.q;

/* loaded from: classes.dex */
public class b implements m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28437a;

    public static class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Context f28438a;

        public a(Context context) {
            this.f28438a = context;
        }

        @Override // x1.n
        public m b(q qVar) {
            return new b(this.f28438a);
        }
    }

    public b(Context context) {
        this.f28437a = context.getApplicationContext();
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, h hVar) {
        if (s1.b.d(i10, i11)) {
            return new m.a(new m2.b(uri), s1.c.d(this.f28437a, uri));
        }
        return null;
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return s1.b.a(uri);
    }
}
