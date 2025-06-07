package t1;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class y {

    /* renamed from: a, reason: collision with root package name */
    private boolean f27320a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f27321b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).c();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v vVar, boolean z10) {
        if (this.f27320a || z10) {
            this.f27321b.obtainMessage(1, vVar).sendToTarget();
        } else {
            this.f27320a = true;
            vVar.c();
            this.f27320a = false;
        }
    }
}
