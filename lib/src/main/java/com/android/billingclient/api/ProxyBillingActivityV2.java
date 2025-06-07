package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.e;
import com.google.android.apps.common.proguard.UsedByReflection;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends ComponentActivity {
    private androidx.activity.result.c F;
    private androidx.activity.result.c G;
    private ResultReceiver H;
    private ResultReceiver I;

    final void G(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int iB = com.google.android.gms.internal.play_billing.a0.d(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.H;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.a0.i("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + aVar.b() + " and billing's responseCode: " + iB);
        }
        finish();
    }

    final void H(androidx.activity.result.a aVar) {
        Intent intentA = aVar.a();
        int iB = com.google.android.gms.internal.play_billing.a0.d(intentA, "ProxyBillingActivityV2").b();
        ResultReceiver resultReceiver = this.I;
        if (resultReceiver != null) {
            resultReceiver.send(iB, intentA == null ? null : intentA.getExtras());
        }
        if (aVar.b() != -1 || iB != 0) {
            com.google.android.gms.internal.play_billing.a0.i("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", Integer.valueOf(aVar.b()), Integer.valueOf(iB)));
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.F = E(new e.e(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.y
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f5291a.G((androidx.activity.result.a) obj);
            }
        });
        this.G = E(new e.e(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.z
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f5292a.H((androidx.activity.result.a) obj);
            }
        });
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.H = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
                return;
            } else {
                if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                    this.I = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                    return;
                }
                return;
            }
        }
        com.google.android.gms.internal.play_billing.a0.h("ProxyBillingActivityV2", "Launching Play Store billing dialog");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.H = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.F.a(new e.b(pendingIntent).a());
        } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.I = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.G.a(new e.b(pendingIntent2).a());
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.H;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.I;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
