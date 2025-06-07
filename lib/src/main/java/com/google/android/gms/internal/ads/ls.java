package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ls {

    /* renamed from: a, reason: collision with root package name */
    private MotionEvent f11834a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    private MotionEvent f11835b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* renamed from: c, reason: collision with root package name */
    private final Context f11836c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f11837d;

    /* renamed from: e, reason: collision with root package name */
    private final au2 f11838e;

    /* renamed from: f, reason: collision with root package name */
    private final ns f11839f;

    public ls(Context context, ScheduledExecutorService scheduledExecutorService, ns nsVar, au2 au2Var) {
        this.f11836c = context;
        this.f11837d = scheduledExecutorService;
        this.f11839f = nsVar;
        this.f11838e = au2Var;
    }

    public final ab3 a() {
        return (ga3) qa3.n(ga3.D(qa3.h(null)), ((Long) bt.f6657c.e()).longValue(), TimeUnit.MILLISECONDS, this.f11837d);
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.f11834a.getEventTime()) {
            this.f11834a = MotionEvent.obtain(motionEvent);
        } else {
            if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.f11835b.getEventTime()) {
                return;
            }
            this.f11835b = MotionEvent.obtain(motionEvent);
        }
    }
}
