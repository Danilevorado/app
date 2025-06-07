package y1;

import java.io.InputStream;
import java.net.URL;
import r1.h;
import x1.g;
import x1.m;
import x1.n;
import x1.q;

/* loaded from: classes.dex */
public class e implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f28458a;

    public static class a implements n {
        @Override // x1.n
        public m b(q qVar) {
            return new e(qVar.d(g.class, InputStream.class));
        }
    }

    public e(m mVar) {
        this.f28458a = mVar;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(URL url, int i10, int i11, h hVar) {
        return this.f28458a.a(new g(url), i10, i11, hVar);
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
