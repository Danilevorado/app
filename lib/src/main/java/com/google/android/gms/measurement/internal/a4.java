package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class a4 extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    static final String f19745d = a4.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private final n9 f19746a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f19747b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19748c;

    a4(n9 n9Var) {
        e4.p.l(n9Var);
        this.f19746a = n9Var;
    }

    public final void b() {
        this.f19746a.e();
        this.f19746a.B().f();
        if (this.f19747b) {
            return;
        }
        this.f19746a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f19748c = this.f19746a.Y().k();
        this.f19746a.b().t().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f19748c));
        this.f19747b = true;
    }

    public final void c() {
        this.f19746a.e();
        this.f19746a.B().f();
        this.f19746a.B().f();
        if (this.f19747b) {
            this.f19746a.b().t().a("Unregistering connectivity change receiver");
            this.f19747b = false;
            this.f19748c = false;
            try {
                this.f19746a.a().unregisterReceiver(this);
            } catch (IllegalArgumentException e5) {
                this.f19746a.b().p().b("Failed to unregister the network broadcast receiver", e5);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f19746a.e();
        String action = intent.getAction();
        this.f19746a.b().t().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f19746a.b().u().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zK = this.f19746a.Y().k();
        if (this.f19748c != zK) {
            this.f19748c = zK;
            this.f19746a.B().y(new z3(this, zK));
        }
    }
}
