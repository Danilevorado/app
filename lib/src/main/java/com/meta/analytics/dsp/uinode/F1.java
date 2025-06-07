package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: assets/audience_network.dex */
public final class F1 {
    public static String[] A04 = {"XHo", "ubtbrXFiKU0aMD9WZdFFXMvL5SNCKhBD", "k9cdhOGQS1oEdCdR21VeueSE4nGT", "BZNadIlHUT8LbNbZ8qdMYncW4fXCJJFh", "22DNreJXUwzG5I9t9ymbmjKefjfUTWMr", "OkM0GcBH5aVjMNZagw1JqhxPR8ijdnHI", "ik3Hzc9el9B7KCBCFVHKN4tCPL2D2JGF", "0FgMGgJ2UsG2ZcXwt2m5OtQLezKmVI44"};
    public final int A00;
    public final C0569Eo A01;
    public final long A02;
    public final CopyOnWriteArrayList<F0> A03;

    public F1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public F1(CopyOnWriteArrayList<F0> copyOnWriteArrayList, int i10, C0569Eo c0569Eo, long j10) {
        this.A03 = copyOnWriteArrayList;
        this.A00 = i10;
        this.A01 = c0569Eo;
        this.A02 = j10;
    }

    private long A00(long j10) {
        long jA01 = C9W.A01(j10);
        if (jA01 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long mediaTimeMs = this.A02;
        return mediaTimeMs + jA01;
    }

    private void A01(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public final F1 A02(int i10, C0569Eo c0569Eo, long j10) {
        return new F1(this.A03, i10, c0569Eo, j10);
    }

    public final void A03() {
        AbstractC0629Ha.A04(this.A01 != null);
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0572Er(this, listener));
        }
    }

    public final void A04() {
        AbstractC0629Ha.A04(this.A01 != null);
        String[] strArr = A04;
        if (strArr[4].charAt(4) != strArr[1].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "rYA4ryMG3XFm73cnSWA4HWNW3HUxv7KC";
        strArr2[1] = "1YJ2rSWw51hvYcz1kikUBhJeKIWd76IZ";
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 listenerAndHandler = it.next();
            A01(listenerAndHandler.A00, new RunnableC0573Es(this, listenerAndHandler.A01));
        }
    }

    public final void A05() {
        AbstractC0629Ha.A04(this.A01 != null);
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0578Ex(this, listener));
        }
    }

    public final void A06(int i10, Format format, int i11, Object obj, long j10) {
        A0C(new F3(1, i10, format, i11, obj, A00(j10), -9223372036854775807L));
    }

    public final void A07(Handler handler, F4 f42) {
        AbstractC0629Ha.A03((handler == null || f42 == null) ? false : true);
        this.A03.add(new F0(handler, f42));
    }

    public final void A08(F2 f22, F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0576Ev(this, listener, f22, f32));
        }
    }

    public final void A09(F2 f22, F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0575Eu(this, listener, f22, f32));
        }
    }

    public final void A0A(F2 f22, F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0574Et(this, listener, f22, f32));
        }
    }

    public final void A0B(F2 f22, F3 f32, IOException iOException, boolean z10) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            A01(next.A00, new RunnableC0577Ew(this, next.A01, f22, f32, iOException, z10));
        }
    }

    public final void A0C(F3 f32) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 next = it.next();
            F4 listener = next.A01;
            A01(next.A00, new RunnableC0580Ez(this, listener, f32));
        }
    }

    public final void A0D(F4 f42) {
        Iterator<F0> it = this.A03.iterator();
        while (it.hasNext()) {
            F0 listenerAndHandler = it.next();
            if (listenerAndHandler.A01 == f42) {
                this.A03.remove(listenerAndHandler);
            }
        }
    }

    public final void A0E(C0628Gy c0628Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12) {
        A0A(new F2(c0628Gy, j12, 0L, 0L), new F3(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0F(C0628Gy c0628Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A08(new F2(c0628Gy, j12, j13, j14), new F3(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0G(C0628Gy c0628Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14) {
        A09(new F2(c0628Gy, j12, j13, j14), new F3(i10, i11, format, i12, obj, A00(j10), A00(j11)));
    }

    public final void A0H(C0628Gy c0628Gy, int i10, int i11, Format format, int i12, Object obj, long j10, long j11, long j12, long j13, long j14, IOException iOException, boolean z10) {
        A0B(new F2(c0628Gy, j12, j13, j14), new F3(i10, i11, format, i12, obj, A00(j10), A00(j11)), iOException, z10);
    }
}
