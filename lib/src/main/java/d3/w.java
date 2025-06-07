package d3;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.ze0;
import k3.m2;
import k3.u3;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f22881a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private m2 f22882b;

    /* renamed from: c, reason: collision with root package name */
    private a f22883c;

    public static abstract class a {
        public abstract void a();

        public void b(boolean z10) {
        }

        public abstract void c();

        public void d() {
        }

        public abstract void e();
    }

    public void a(a aVar) {
        u3 u3Var;
        synchronized (this.f22881a) {
            this.f22883c = aVar;
            m2 m2Var = this.f22882b;
            if (m2Var != null) {
                if (aVar == null) {
                    u3Var = null;
                } else {
                    try {
                        u3Var = new u3(aVar);
                    } catch (RemoteException e5) {
                        ze0.e("Unable to call setVideoLifecycleCallbacks on video controller.", e5);
                    }
                }
                m2Var.O0(u3Var);
            }
        }
    }

    public final m2 b() {
        m2 m2Var;
        synchronized (this.f22881a) {
            m2Var = this.f22882b;
        }
        return m2Var;
    }

    public final void c(m2 m2Var) {
        synchronized (this.f22881a) {
            this.f22882b = m2Var;
            a aVar = this.f22883c;
            if (aVar != null) {
                a(aVar);
            }
        }
    }
}
