package kotlinx.coroutines.scheduling;

import yb.q;

/* loaded from: classes2.dex */
public abstract class f extends q {

    /* renamed from: o, reason: collision with root package name */
    private final int f24990o;

    /* renamed from: p, reason: collision with root package name */
    private final int f24991p;

    /* renamed from: q, reason: collision with root package name */
    private final long f24992q;

    /* renamed from: r, reason: collision with root package name */
    private final String f24993r;

    /* renamed from: s, reason: collision with root package name */
    private a f24994s = y();

    public f(int i10, int i11, long j10, String str) {
        this.f24990o = i10;
        this.f24991p = i11;
        this.f24992q = j10;
        this.f24993r = str;
    }

    private final a y() {
        return new a(this.f24990o, this.f24991p, this.f24992q, this.f24993r);
    }

    public final void U(Runnable runnable, i iVar, boolean z10) {
        this.f24994s.y(runnable, iVar, z10);
    }

    @Override // yb.c
    public void c(kb.e eVar, Runnable runnable) {
        a.U(this.f24994s, runnable, null, false, 6, null);
    }
}
