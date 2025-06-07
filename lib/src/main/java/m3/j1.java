package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.internal.ads.ir;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: d, reason: collision with root package name */
    private boolean f25245d;

    /* renamed from: e, reason: collision with root package name */
    private Context f25246e;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25244c = false;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25243b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f25242a = new i1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void e(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f25243b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) entry.getKey());
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
        }
    }

    public final synchronized void b(Context context) {
        if (this.f25244c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f25246e = applicationContext;
        if (applicationContext == null) {
            this.f25246e = context;
        }
        ir.a(this.f25246e);
        this.f25245d = ((Boolean) k3.w.c().b(ir.f10113v3)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (!((Boolean) k3.w.c().b(ir.f10075r9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            this.f25246e.registerReceiver(this.f25242a, intentFilter);
        } else {
            this.f25246e.registerReceiver(this.f25242a, intentFilter, 4);
        }
        this.f25244c = true;
    }

    public final synchronized void c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f25245d) {
            this.f25243b.put(broadcastReceiver, intentFilter);
            return;
        }
        ir.a(context);
        if (!((Boolean) k3.w.c().b(ir.f10075r9)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        }
    }

    public final synchronized void d(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f25245d) {
            this.f25243b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}
