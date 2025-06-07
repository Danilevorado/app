package s4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;

/* loaded from: classes.dex */
public abstract class x extends e4.h {
    private final String I;
    protected final s J;

    public x(Context context, Looper looper, GoogleApiClient.b bVar, GoogleApiClient.c cVar, String str, e4.e eVar) {
        super(context, looper, 23, eVar, bVar, cVar);
        this.J = new w(this);
        this.I = str;
    }

    @Override // e4.c
    protected final Bundle E() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.I);
        return bundle;
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // e4.c
    public final int h() {
        return 11717000;
    }

    @Override // e4.c
    protected final /* bridge */ /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new h(iBinder);
    }

    @Override // e4.c
    public final b4.d[] z() {
        return v4.n.f27862f;
    }
}
