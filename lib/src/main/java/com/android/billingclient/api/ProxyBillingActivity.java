package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: m, reason: collision with root package name */
    private ResultReceiver f5119m;

    /* renamed from: n, reason: collision with root package name */
    private ResultReceiver f5120n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5121o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f5122p;

    private Intent a(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent b() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            super.onActivityResult(r9, r10, r11)
            r0 = 0
            r1 = 0
            r2 = 110(0x6e, float:1.54E-43)
            java.lang.String r3 = "ProxyBillingActivity"
            r4 = 100
            if (r9 == r4) goto L43
            if (r9 != r2) goto L10
            goto L43
        L10:
            r10 = 101(0x65, float:1.42E-43)
            if (r9 != r10) goto L28
            int r9 = com.google.android.gms.internal.play_billing.a0.a(r11, r3)
            android.os.ResultReceiver r10 = r8.f5120n
            if (r10 == 0) goto Lef
            if (r11 != 0) goto L1f
            goto L23
        L1f:
            android.os.Bundle r0 = r11.getExtras()
        L23:
            r10.send(r9, r0)
            goto Lef
        L28:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Got onActivityResult with wrong requestCode: "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = "; skipping..."
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.google.android.gms.internal.play_billing.a0.i(r3, r9)
            goto Lef
        L43:
            com.android.billingclient.api.d r4 = com.google.android.gms.internal.play_billing.a0.d(r11, r3)
            int r4 = r4.b()
            r5 = -1
            if (r10 != r5) goto L54
            if (r4 == 0) goto L52
            r10 = r5
            goto L54
        L52:
            r4 = r1
            goto L70
        L54:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Activity finished with resultCode "
            r5.append(r6)
            r5.append(r10)
            java.lang.String r10 = " and billing's responseCode: "
            r5.append(r10)
            r5.append(r4)
            java.lang.String r10 = r5.toString()
            com.google.android.gms.internal.play_billing.a0.i(r3, r10)
        L70:
            android.os.ResultReceiver r10 = r8.f5119m
            if (r10 == 0) goto L7f
            if (r11 != 0) goto L77
            goto L7b
        L77:
            android.os.Bundle r0 = r11.getExtras()
        L7b:
            r10.send(r4, r0)
            goto Lef
        L7f:
            if (r11 == 0) goto Le0
            android.os.Bundle r10 = r11.getExtras()
            java.lang.String r0 = "LAUNCH_BILLING_FLOW"
            java.lang.String r4 = "INTENT_SOURCE"
            if (r10 == 0) goto La8
            android.os.Bundle r10 = r11.getExtras()
            java.lang.String r3 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r10 = r10.getString(r3)
            if (r10 == 0) goto L9c
            android.content.Intent r10 = r8.a(r10)
            goto Ldc
        L9c:
            android.content.Intent r10 = r8.b()
            android.os.Bundle r11 = r11.getExtras()
            r10.putExtras(r11)
            goto Ldc
        La8:
            android.content.Intent r10 = r8.b()
            java.lang.String r11 = "Got null bundle!"
            com.google.android.gms.internal.play_billing.a0.i(r3, r11)
            java.lang.String r11 = "RESPONSE_CODE"
            r3 = 6
            r10.putExtra(r11, r3)
            java.lang.String r11 = "DEBUG_MESSAGE"
            java.lang.String r5 = "An internal error occurred."
            r10.putExtra(r11, r5)
            r11 = 22
            r6 = 2
            com.android.billingclient.api.d$a r7 = com.android.billingclient.api.d.c()
            r7.c(r3)
            r7.b(r5)
            com.android.billingclient.api.d r3 = r7.a()
            com.google.android.gms.internal.play_billing.q4 r11 = com.android.billingclient.api.t.a(r11, r6, r3)
            byte[] r11 = r11.c()
            java.lang.String r3 = "FAILURE_LOGGING_PAYLOAD"
            r10.putExtra(r3, r11)
        Ldc:
            r10.putExtra(r4, r0)
            goto Le4
        Le0:
            android.content.Intent r10 = r8.b()
        Le4:
            if (r9 != r2) goto Lec
            r9 = 1
            java.lang.String r11 = "IS_FIRST_PARTY_PURCHASE"
            r10.putExtra(r11, r9)
        Lec:
            r8.sendBroadcast(r10)
        Lef:
            r8.f5121o = r1
            r8.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws IntentSender.SendIntentException {
        int i10;
        PendingIntent pendingIntent;
        int i11;
        super.onCreate(bundle);
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.a0.h("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f5121o = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.f5119m = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f5120n = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.f5122p = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        com.google.android.gms.internal.play_billing.a0.h("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f5122p = true;
                i11 = 110;
                i10 = i11;
            }
            i10 = 100;
        } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
            this.f5119m = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            i10 = 100;
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.f5120n = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            i11 = 101;
            i10 = i11;
        } else {
            i10 = 100;
            pendingIntent = null;
        }
        try {
            this.f5121o = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i10, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e5) {
            com.google.android.gms.internal.play_billing.a0.j("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e5);
            ResultReceiver resultReceiver = this.f5119m;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f5120n;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentB = b();
                    if (this.f5122p) {
                        intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentB.putExtra("RESPONSE_CODE", 6);
                    intentB.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentB);
                }
            }
            this.f5121o = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f5121o) {
            Intent intentB = b();
            intentB.putExtra("RESPONSE_CODE", 1);
            intentB.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentB);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f5119m;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f5120n;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f5121o);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f5122p);
    }
}
