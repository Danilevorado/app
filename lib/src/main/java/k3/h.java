package k3;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.cf0;
import com.google.android.gms.internal.ads.df0;
import com.google.android.gms.internal.ads.o30;
import com.google.android.gms.internal.ads.y60;
import com.google.android.gms.internal.ads.z60;

/* loaded from: classes.dex */
final class h extends s {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f24648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ o30 f24649c;

    h(r rVar, Context context, o30 o30Var) {
        this.f24648b = context;
        this.f24649c = o30Var;
    }

    @Override // k3.s
    protected final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object b(b1 b1Var) {
        return b1Var.j1(l4.b.p1(this.f24648b), this.f24649c, 231004000);
    }

    @Override // k3.s
    public final /* bridge */ /* synthetic */ Object c() {
        try {
            return ((z60) df0.b(this.f24648b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", new bf0() { // from class: k3.g
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.internal.ads.bf0
                public final Object a(Object obj) {
                    return y60.L5(obj);
                }
            })).C0(l4.b.p1(this.f24648b), this.f24649c, 231004000);
        } catch (RemoteException | cf0 | NullPointerException unused) {
            return null;
        }
    }
}
