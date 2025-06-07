package m3;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.b03;

/* loaded from: classes.dex */
public final class o1 extends b03 {
    public o1(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.b03
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            j3.t.r();
            b2.h(j3.t.q().c(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e5) {
            j3.t.q().u(e5, "AdMobHandler.handleMessage");
        }
    }
}
