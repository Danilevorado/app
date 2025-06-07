package g4;

import android.content.Context;
import b5.i;
import b5.j;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.f;
import d4.h;
import e4.s;
import e4.u;
import e4.v;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.api.b implements u {

    /* renamed from: k, reason: collision with root package name */
    private static final a.g f23866k;

    /* renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0091a f23867l;

    /* renamed from: m, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f23868m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f23869n = 0;

    static {
        a.g gVar = new a.g();
        f23866k = gVar;
        c cVar = new c();
        f23867l = cVar;
        f23868m = new com.google.android.gms.common.api.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, v vVar) {
        super(context, f23868m, vVar, b.a.f5618c);
    }

    @Override // e4.u
    public final i b(final s sVar) {
        f.a aVarA = f.a();
        aVarA.d(p4.d.f25919a);
        aVarA.c(false);
        aVarA.b(new h() { // from class: g4.b
            @Override // d4.h
            public final void a(Object obj, Object obj2) {
                int i10 = d.f23869n;
                ((a) ((e) obj).H()).p1(sVar);
                ((j) obj2).c(null);
            }
        });
        return d(aVarA.a());
    }
}
