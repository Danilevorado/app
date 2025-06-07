package g4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d4.g;
import e4.h;
import e4.v;

/* loaded from: classes.dex */
public final class e extends h {
    private final v I;

    public e(Context context, Looper looper, e4.e eVar, v vVar, d4.d dVar, g gVar) {
        super(context, looper, 270, eVar, dVar, gVar);
        this.I = vVar;
    }

    @Override // e4.c
    protected final Bundle E() {
        return this.I.b();
    }

    @Override // e4.c
    protected final String I() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // e4.c
    protected final String J() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // e4.c
    protected final boolean M() {
        return true;
    }

    @Override // e4.c
    public final int h() {
        return 203400000;
    }

    @Override // e4.c
    protected final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // e4.c
    public final b4.d[] z() {
        return p4.d.f25920b;
    }
}
