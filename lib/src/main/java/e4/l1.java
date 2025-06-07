package e4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class l1 implements Handler.Callback {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ m1 f23186m;

    /* synthetic */ l1(m1 m1Var, k1 k1Var) {
        this.f23186m = m1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f23186m.f23192f) {
                i1 i1Var = (i1) message.obj;
                j1 j1Var = (j1) this.f23186m.f23192f.get(i1Var);
                if (j1Var != null && j1Var.i()) {
                    if (j1Var.j()) {
                        j1Var.g("GmsClientSupervisor");
                    }
                    this.f23186m.f23192f.remove(i1Var);
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f23186m.f23192f) {
            i1 i1Var2 = (i1) message.obj;
            j1 j1Var2 = (j1) this.f23186m.f23192f.get(i1Var2);
            if (j1Var2 != null && j1Var2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(i1Var2), new Exception());
                ComponentName componentNameB = j1Var2.b();
                if (componentNameB == null) {
                    componentNameB = i1Var2.a();
                }
                if (componentNameB == null) {
                    String strC = i1Var2.c();
                    p.l(strC);
                    componentNameB = new ComponentName(strC, "unknown");
                }
                j1Var2.onServiceDisconnected(componentNameB);
            }
        }
        return true;
    }
}
