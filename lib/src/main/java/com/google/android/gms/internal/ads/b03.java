package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public class b03 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f6304a;

    public b03(Looper looper) {
        super(looper);
        this.f6304a = Looper.getMainLooper();
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}
