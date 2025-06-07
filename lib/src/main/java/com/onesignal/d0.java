package com.onesignal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f21801a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f21802b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f21803c;

    public d0(Context context) {
        rb.h.e(context, "context");
        this.f21801a = context;
        this.f21802b = NotificationOpenedReceiver.class;
        this.f21803c = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    private final Intent c() {
        return new Intent(this.f21801a, (Class<?>) this.f21802b);
    }

    public final PendingIntent a(int i10, Intent intent) {
        rb.h.e(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.f21801a, i10, intent, 201326592);
    }

    public final Intent b(int i10) {
        Intent intentAddFlags = c().putExtra("androidNotificationId", i10).addFlags(603979776);
        rb.h.d(intentAddFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return intentAddFlags;
    }
}
