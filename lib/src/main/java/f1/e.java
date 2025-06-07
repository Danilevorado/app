package f1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class e extends h {

    /* renamed from: f, reason: collision with root package name */
    private final BroadcastReceiver f23599f;

    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            rb.h.e(context, "context");
            rb.h.e(intent, "intent");
            e.this.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, i1.c cVar) {
        super(context, cVar);
        rb.h.e(context, "context");
        rb.h.e(cVar, "taskExecutor");
        this.f23599f = new a();
    }

    @Override // f1.h
    public void h() {
        b1.j.e().a(f.f23601a, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f23599f, j());
    }

    @Override // f1.h
    public void i() {
        b1.j.e().a(f.f23601a, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f23599f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
