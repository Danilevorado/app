package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ h f21489m = new h();

    private /* synthetic */ h() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
