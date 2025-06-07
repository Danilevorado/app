package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes2.dex */
class g extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f26009a;

    g(b bVar) {
        super(Looper.getMainLooper());
        this.f26009a = new WeakReference(bVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        b bVar = (b) this.f26009a.get();
        if (bVar == null) {
            return;
        }
        if (message.what == -1) {
            bVar.invalidateSelf();
            return;
        }
        Iterator it = bVar.f25978t.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(message.what);
        }
    }
}
