package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.c1;
import com.google.android.gms.internal.play_billing.q4;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class d0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private boolean f5192a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5193b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e0 f5194c;

    d0(e0 e0Var, boolean z10) {
        this.f5194c = e0Var;
        this.f5193b = z10;
    }

    private final void c(Bundle bundle, d dVar, int i10) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f5194c.f5203e.d(t.a(23, i10, dVar));
            return;
        }
        try {
            this.f5194c.f5203e.d(q4.B(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), c1.a()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.a0.i("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void a(Context context, IntentFilter intentFilter) {
        if (this.f5192a) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, true != this.f5193b ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter);
        }
        this.f5192a = true;
    }

    public final synchronized void b(Context context, IntentFilter intentFilter, String str) {
        if (this.f5192a) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.f5193b ? 4 : 2);
        } else {
            context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
        }
        this.f5192a = true;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.a0.i("BillingBroadcastManager", "Bundle is null.");
            u uVar = this.f5194c.f5203e;
            d dVar = v.f5270j;
            uVar.d(t.a(11, 1, dVar));
            e0 e0Var = this.f5194c;
            if (e0Var.f5200b != null) {
                e0Var.f5200b.e(dVar, null);
                return;
            }
            return;
        }
        d dVarD = com.google.android.gms.internal.play_billing.a0.d(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i10 = true != Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 1 : 2;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List listG = com.google.android.gms.internal.play_billing.a0.g(extras);
            if (dVarD.b() == 0) {
                this.f5194c.f5203e.e(t.c(i10));
            } else {
                c(extras, dVarD, i10);
            }
            this.f5194c.f5200b.e(dVarD, listG);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (dVarD.b() != 0) {
                c(extras, dVarD, i10);
                this.f5194c.f5200b.e(dVarD, com.google.android.gms.internal.play_billing.j.s());
                return;
            }
            e0 e0Var2 = this.f5194c;
            if (e0Var2.f5201c == null && e0Var2.f5202d == null) {
                com.google.android.gms.internal.play_billing.a0.i("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                u uVar2 = this.f5194c.f5203e;
                d dVar2 = v.f5270j;
                uVar2.d(t.a(77, i10, dVar2));
                this.f5194c.f5200b.e(dVar2, com.google.android.gms.internal.play_billing.j.s());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                com.google.android.gms.internal.play_billing.a0.i("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                u uVar3 = this.f5194c.f5203e;
                d dVar3 = v.f5270j;
                uVar3.d(t.a(16, i10, dVar3));
                this.f5194c.f5200b.e(dVar3, com.google.android.gms.internal.play_billing.j.s());
                return;
            }
            try {
                if (this.f5194c.f5202d != null) {
                    this.f5194c.f5202d.a(new g(string));
                } else {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(string).optJSONArray("products");
                    ArrayList arrayList = new ArrayList();
                    if (jSONArrayOptJSONArray != null) {
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                            if (jSONObjectOptJSONObject != null) {
                                arrayList.add(new c0(jSONObjectOptJSONObject, null));
                            }
                        }
                    }
                    this.f5194c.f5201c.a();
                }
                this.f5194c.f5203e.e(t.c(i10));
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.a0.i("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string));
                u uVar4 = this.f5194c.f5203e;
                d dVar4 = v.f5270j;
                uVar4.d(t.a(17, i10, dVar4));
                this.f5194c.f5200b.e(dVar4, com.google.android.gms.internal.play_billing.j.s());
            }
        }
    }
}
