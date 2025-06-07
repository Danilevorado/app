package x1;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x1.m;

/* loaded from: classes.dex */
public class w implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f28221b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    private final m f28222a;

    public static class a implements n {
        @Override // x1.n
        public m b(q qVar) {
            return new w(qVar.d(g.class, InputStream.class));
        }
    }

    public w(m mVar) {
        this.f28222a = mVar;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(Uri uri, int i10, int i11, r1.h hVar) {
        return this.f28222a.a(new g(uri.toString()), i10, i11, hVar);
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f28221b.contains(uri.getScheme());
    }
}
