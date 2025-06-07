package o4;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;

/* loaded from: classes.dex */
public final class p extends com.google.android.gms.common.api.b implements x3.b {

    /* renamed from: m, reason: collision with root package name */
    private static final a.g f25747m;

    /* renamed from: n, reason: collision with root package name */
    private static final a.AbstractC0091a f25748n;

    /* renamed from: o, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f25749o;

    /* renamed from: k, reason: collision with root package name */
    private final Context f25750k;

    /* renamed from: l, reason: collision with root package name */
    private final b4.f f25751l;

    static {
        a.g gVar = new a.g();
        f25747m = gVar;
        n nVar = new n();
        f25748n = nVar;
        f25749o = new com.google.android.gms.common.api.a("AppSet.API", nVar, gVar);
    }

    p(Context context, b4.f fVar) {
        super(context, f25749o, a.d.f5607a, b.a.f5618c);
        this.f25750k = context;
        this.f25751l = fVar;
    }

    @Override // x3.b
    public final b5.i a() {
        return this.f25751l.j(this.f25750k, 212800000) == 0 ? e(com.google.android.gms.common.api.internal.f.a().d(x3.h.f28252a).b(new d4.h() { // from class: o4.m
            @Override // d4.h
            public final void a(Object obj, Object obj2) {
                ((g) ((d) obj).H()).L0(new x3.d(null, null), new o(this.f25745a, (b5.j) obj2));
            }
        }).c(false).e(27601).a()) : b5.l.d(new c4.a(new Status(17)));
    }
}
