package e4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class c1 extends o0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f23107g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f23108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(c cVar, int i10, IBinder iBinder, Bundle bundle) {
        super(cVar, i10, bundle);
        this.f23108h = cVar;
        this.f23107g = iBinder;
    }

    @Override // e4.o0
    protected final void f(b4.b bVar) {
        if (this.f23108h.f23099v != null) {
            this.f23108h.f23099v.w0(bVar);
        }
        this.f23108h.P(bVar);
    }

    @Override // e4.o0
    protected final boolean g() throws RemoteException {
        String str;
        String interfaceDescriptor;
        try {
            IBinder iBinder = this.f23107g;
            p.l(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f23108h.I().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f23108h.I() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface iInterfaceW = this.f23108h.w(this.f23107g);
        if (iInterfaceW == null || !(c.k0(this.f23108h, 2, 4, iInterfaceW) || c.k0(this.f23108h, 3, 4, iInterfaceW))) {
            return false;
        }
        this.f23108h.f23103z = null;
        c cVar = this.f23108h;
        Bundle bundleB = cVar.B();
        if (cVar.f23098u == null) {
            return true;
        }
        this.f23108h.f23098u.L0(bundleB);
        return true;
    }
}
