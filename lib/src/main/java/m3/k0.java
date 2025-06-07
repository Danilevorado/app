package m3;

import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.ta;
import com.google.android.gms.internal.ads.ub;
import com.google.android.gms.internal.ads.ye0;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
final class k0 extends ub {
    final /* synthetic */ byte[] A;
    final /* synthetic */ Map B;
    final /* synthetic */ ye0 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k0(q0 q0Var, int i10, String str, ta taVar, sa saVar, byte[] bArr, Map map, ye0 ye0Var) {
        super(i10, str, taVar, saVar);
        this.A = bArr;
        this.B = map;
        this.C = ye0Var;
    }

    @Override // com.google.android.gms.internal.ads.oa
    public final byte[] C() {
        byte[] bArr = this.A;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.ub
    protected final void E(String str) throws IOException {
        this.C.g(str);
        super.E(str);
    }

    @Override // com.google.android.gms.internal.ads.oa
    public final Map q() {
        Map map = this.B;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.oa
    protected final /* bridge */ /* synthetic */ void t(Object obj) {
        E((String) obj);
    }
}
