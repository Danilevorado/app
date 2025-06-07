package s3;

import com.google.android.gms.internal.ads.c44;
import com.google.android.gms.internal.ads.fs2;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.ls2;
import com.google.android.gms.internal.ads.p01;
import com.google.android.gms.internal.ads.q44;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements c44 {

    /* renamed from: a, reason: collision with root package name */
    private final q44 f26823a;

    /* renamed from: b, reason: collision with root package name */
    private final q44 f26824b;

    /* renamed from: c, reason: collision with root package name */
    private final q44 f26825c;

    public k(q44 q44Var, q44 q44Var2, q44 q44Var3) {
        this.f26823a = q44Var;
        this.f26824b = q44Var2;
        this.f26825c = q44Var3;
    }

    @Override // com.google.android.gms.internal.ads.q44
    public final /* bridge */ /* synthetic */ Object b() {
        return ((ls2) this.f26823a.b()).b(fs2.GENERATE_SIGNALS, ((p01) this.f26825c).b().c()).f(((n) this.f26824b).b()).i(((Integer) k3.w.c().b(ir.f9951g5)).intValue(), TimeUnit.SECONDS).a();
    }
}
