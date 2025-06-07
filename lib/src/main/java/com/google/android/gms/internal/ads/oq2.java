package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
final class oq2 implements q22 {

    /* renamed from: a, reason: collision with root package name */
    private Message f13362a;

    /* renamed from: b, reason: collision with root package name */
    private pr2 f13363b;

    /* synthetic */ oq2(np2 np2Var) {
    }

    private final void d() {
        this.f13362a = null;
        this.f13363b = null;
        pr2.b(this);
    }

    @Override // com.google.android.gms.internal.ads.q22
    public final void a() {
        Message message = this.f13362a;
        Objects.requireNonNull(message);
        message.sendToTarget();
        d();
    }

    public final oq2 b(Message message, pr2 pr2Var) {
        this.f13362a = message;
        this.f13363b = pr2Var;
        return this;
    }

    public final boolean c(Handler handler) {
        Message message = this.f13362a;
        Objects.requireNonNull(message);
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        d();
        return zSendMessageAtFrontOfQueue;
    }
}
