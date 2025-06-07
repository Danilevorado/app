package o4;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d extends e4.h {
    protected d(Context context, Looper looper, e4.e eVar, d4.d dVar, d4.g gVar) {
        super(context, looper, 300, eVar, dVar, gVar);
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // e4.c
    protected final boolean M() {
        return true;
    }

    @Override // e4.c
    public final boolean W() {
        return true;
    }

    @Override // e4.c
    public final int h() {
        return 212800000;
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // e4.c
    public final b4.d[] z() {
        return x3.h.f28253b;
    }
}
