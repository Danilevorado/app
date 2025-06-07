package e4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class b1 implements ServiceConnection {

    /* renamed from: m, reason: collision with root package name */
    private final int f23076m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ c f23077n;

    public b1(c cVar, int i10) {
        this.f23077n = cVar;
        this.f23076m = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f23077n;
        if (iBinder == null) {
            c.h0(cVar, 16);
            return;
        }
        synchronized (cVar.f23091n) {
            c cVar2 = this.f23077n;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f23092o = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new r0(iBinder) : (m) iInterfaceQueryLocalInterface;
        }
        this.f23077n.i0(0, null, this.f23076m);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f23077n.f23091n) {
            this.f23077n.f23092o = null;
        }
        c cVar = this.f23077n;
        int i10 = this.f23076m;
        Handler handler = cVar.f23089l;
        handler.sendMessage(handler.obtainMessage(6, i10, 1));
    }
}
