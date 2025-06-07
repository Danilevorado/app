package m3;

import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.xa;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
final class j0 implements sa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f25240a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n0 f25241b;

    j0(q0 q0Var, String str, n0 n0Var) {
        this.f25240a = str;
        this.f25241b = n0Var;
    }

    @Override // com.google.android.gms.internal.ads.sa
    public final void a(xa xaVar) {
        ze0.g("Failed to load URL: " + this.f25240a + "\n" + xaVar.toString());
        this.f25241b.a(null);
    }
}
