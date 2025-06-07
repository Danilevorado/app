package m3;

import com.google.android.gms.internal.ads.ja;
import com.google.android.gms.internal.ads.lb;
import com.google.android.gms.internal.ads.oa;
import com.google.android.gms.internal.ads.tf0;
import com.google.android.gms.internal.ads.ua;
import com.google.android.gms.internal.ads.ye0;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class p0 extends oa {

    /* renamed from: y, reason: collision with root package name */
    private final tf0 f25268y;

    /* renamed from: z, reason: collision with root package name */
    private final ye0 f25269z;

    public p0(String str, Map map, tf0 tf0Var) throws IOException {
        super(0, str, new o0(tf0Var));
        this.f25268y = tf0Var;
        ye0 ye0Var = new ye0(null);
        this.f25269z = ye0Var;
        ye0Var.d(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.oa
    protected final ua m(ja jaVar) {
        return ua.b(jaVar, lb.b(jaVar));
    }

    @Override // com.google.android.gms.internal.ads.oa
    protected final /* bridge */ /* synthetic */ void t(Object obj) throws IOException {
        ja jaVar = (ja) obj;
        this.f25269z.f(jaVar.f10398c, jaVar.f10396a);
        ye0 ye0Var = this.f25269z;
        byte[] bArr = jaVar.f10397b;
        if (ye0.k() && bArr != null) {
            ye0Var.h(bArr);
        }
        this.f25268y.e(jaVar);
    }
}
