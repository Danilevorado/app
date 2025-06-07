package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class za {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f18501c = ab.f6029b;

    /* renamed from: a, reason: collision with root package name */
    private final List f18502a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f18503b = false;

    za() {
    }

    public final synchronized void a(String str, long j10) {
        if (this.f18503b) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f18502a.add(new ya(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void b(String str) {
        long j10;
        this.f18503b = true;
        if (this.f18502a.size() == 0) {
            j10 = 0;
        } else {
            j10 = ((ya) this.f18502a.get(r1.size() - 1)).f17946c - ((ya) this.f18502a.get(0)).f17946c;
        }
        if (j10 <= 0) {
            return;
        }
        long j11 = ((ya) this.f18502a.get(0)).f17946c;
        ab.a("(%-4d ms) %s", Long.valueOf(j10), str);
        for (ya yaVar : this.f18502a) {
            long j12 = yaVar.f17946c;
            ab.a("(+%-4d) [%2d] %s", Long.valueOf(j12 - j11), Long.valueOf(yaVar.f17945b), yaVar.f17944a);
            j11 = j12;
        }
    }

    protected final void finalize() {
        if (this.f18503b) {
            return;
        }
        b("Request on the loose");
        ab.b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }
}
