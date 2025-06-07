package s3;

import android.content.Context;
import com.google.android.gms.internal.ads.bb3;
import com.google.android.gms.internal.ads.bg;
import com.google.android.gms.internal.ads.bp2;
import com.google.android.gms.internal.ads.c44;
import com.google.android.gms.internal.ads.cn0;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.k44;
import com.google.android.gms.internal.ads.km0;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.q44;
import com.google.android.gms.internal.ads.qm0;
import com.google.android.gms.internal.ads.tu2;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class d implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f26794a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f26795b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f26796c;

    /* renamed from: d, reason: collision with root package name */
    private final q44 f26797d;

    /* renamed from: e, reason: collision with root package name */
    private final q44 f26798e;

    /* renamed from: f, reason: collision with root package name */
    private final q44 f26799f;

    /* renamed from: g, reason: collision with root package name */
    private final q44 f26800g;

    /* renamed from: h, reason: collision with root package name */
    private final q44 f26801h;

    /* renamed from: i, reason: collision with root package name */
    private final q44 f26802i;

    public d(q44 q44Var, q44 q44Var2, q44 q44Var3, q44 q44Var4, q44 q44Var5, q44 q44Var6, q44 q44Var7, q44 q44Var8, q44 q44Var9) {
        this.f26794a = q44Var;
        this.f26795b = q44Var2;
        this.f26796c = q44Var3;
        this.f26797d = q44Var4;
        this.f26798e = q44Var5;
        this.f26799f = q44Var6;
        this.f26800g = q44Var7;
        this.f26801h = q44Var8;
        this.f26802i = q44Var9;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        km0 km0Var = (km0) this.f26794a.b();
        Context contextA = ((qm0) this.f26795b).a();
        bg bgVar = (bg) this.f26796c.b();
        bp2 bp2Var = (bp2) this.f26797d.b();
        bb3 bb3Var = of0.f13186a;
        k44.b(bb3Var);
        return new c(km0Var, contextA, bgVar, bp2Var, bb3Var, (ScheduledExecutorService) this.f26799f.b(), (dn1) this.f26800g.b(), (tu2) this.f26801h.b(), ((cn0) this.f26802i).a());
    }
}
