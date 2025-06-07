package a2;

import a2.m;
import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class y implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final m f94a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.b f95b;

    static class a implements m.b {

        /* renamed from: a, reason: collision with root package name */
        private final w f96a;

        /* renamed from: b, reason: collision with root package name */
        private final n2.d f97b;

        a(w wVar, n2.d dVar) {
            this.f96a = wVar;
            this.f97b = dVar;
        }

        @Override // a2.m.b
        public void a(u1.d dVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f97b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                dVar.d(bitmap);
                throw iOExceptionA;
            }
        }

        @Override // a2.m.b
        public void b() {
            this.f96a.c();
        }
    }

    public y(m mVar, u1.b bVar) {
        this.f94a = mVar;
        this.f95b = bVar;
    }

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(InputStream inputStream, int i10, int i11, r1.h hVar) {
        boolean z10;
        w wVar;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z10 = false;
        } else {
            z10 = true;
            wVar = new w(inputStream, this.f95b);
        }
        n2.d dVarC = n2.d.c(wVar);
        try {
            return this.f94a.f(new n2.i(dVarC), i10, i11, hVar, new a(wVar, dVarC));
        } finally {
            dVarC.e();
            if (z10) {
                wVar.e();
            }
        }
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, r1.h hVar) {
        return this.f94a.p(inputStream);
    }
}
