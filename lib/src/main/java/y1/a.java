package y1;

import com.bumptech.glide.load.data.j;
import r1.g;
import r1.h;
import x1.l;
import x1.m;
import x1.n;
import x1.q;

/* loaded from: classes.dex */
public class a implements m {

    /* renamed from: b, reason: collision with root package name */
    public static final g f28434b = g.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a, reason: collision with root package name */
    private final l f28435a;

    /* renamed from: y1.a$a, reason: collision with other inner class name */
    public static class C0213a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final l f28436a = new l(500);

        @Override // x1.n
        public m b(q qVar) {
            return new a(this.f28436a);
        }
    }

    public a(l lVar) {
        this.f28435a = lVar;
    }

    @Override // x1.m
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public m.a a(x1.g gVar, int i10, int i11, h hVar) {
        l lVar = this.f28435a;
        if (lVar != null) {
            x1.g gVar2 = (x1.g) lVar.a(gVar, 0, 0);
            if (gVar2 == null) {
                this.f28435a.b(gVar, 0, 0, gVar);
            } else {
                gVar = gVar2;
            }
        }
        return new m.a(gVar, new j(gVar, ((Integer) hVar.c(f28434b)).intValue()));
    }

    @Override // x1.m
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(x1.g gVar) {
        return true;
    }
}
