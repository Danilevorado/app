package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import b1.j;
import b1.l;
import b1.u;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4134a = j.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.e().a(f4134a, "Requesting diagnostics");
        try {
            u.g(context).b(l.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e5) {
            j.e().d(f4134a, "WorkManager is not initialized", e5);
        }
    }
}
