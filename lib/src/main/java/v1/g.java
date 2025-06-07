package v1;

import t1.v;
import v1.h;

/* loaded from: classes.dex */
public class g extends n2.h implements h {

    /* renamed from: e, reason: collision with root package name */
    private h.a f27827e;

    public g(long j10) {
        super(j10);
    }

    @Override // v1.h
    public void a(int i10) {
        if (i10 >= 40) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            m(h() / 2);
        }
    }

    @Override // v1.h
    public void c(h.a aVar) {
        this.f27827e = aVar;
    }

    @Override // v1.h
    public /* bridge */ /* synthetic */ v d(r1.f fVar) {
        return (v) super.l(fVar);
    }

    @Override // v1.h
    public /* bridge */ /* synthetic */ v e(r1.f fVar, v vVar) {
        return (v) super.k(fVar, vVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n2.h
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(v vVar) {
        return vVar == null ? super.i(null) : vVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // n2.h
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(r1.f fVar, v vVar) {
        h.a aVar = this.f27827e;
        if (aVar == null || vVar == null) {
            return;
        }
        aVar.c(vVar);
    }
}
